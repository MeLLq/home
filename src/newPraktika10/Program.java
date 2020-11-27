package newPraktika10;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Program  {

    public static void main(String[] args) {
        printfoldersize();
    }

    public static void printfoldersize() {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Log.log("Введен путь: " + path);
        File f = new File(path);
        if (!f.exists() || !f.isDirectory()) {
            Log.log("Не верно введен путь");
            System.err.println("Не верно введен путь");
            return;
        }
        long size = 0;
        long x = 1000000000;
        Queue<File> q = new PriorityQueue<File>();
        q.add(f);
        while (!q.isEmpty()) {
            File fl = q.poll();
            for (File i : fl.listFiles()) {
                if (i.isDirectory()) {
                    q.add(i);
                } else size += i.length();
            }
        }
        if (size > 0 && size < 10000) {
            System.out.println("Размер папки " + path + " составляет " + size + " байт");
            Log.log("Размер папки " + path + " составляет " + size + " байт");
        } else if (size >= 100 && size < 1000000) {
            double value = size / Math.pow(2, 10);
            String result = String.format("%.1f", value);
            System.out.println("Размер папки " + path + " составляет " + result + " Кб");
            Log.log("Размер папки " + path + " составляет " + result + " Кб");
        } else if (size >= 1000000 && size < 999999999) {
            double value1 = size / Math.pow(2, 20);
            String result1 = String.format("%.1f", value1);
            System.out.println("Размер папки " + path + " составляет " + result1 + " Мб");
            Log.log("Размер папки " + path + " составляет " + result1 + " Мб");
        } else {
            double value1 = size / Math.pow(2, 30);
            String result1 = String.format("%.1f", value1);
            System.out.println("Размер папки " + path + " составляет " + result1 + " Гб");
            Log.log("Размер папки " + path + " составляет " + size / Math.pow(2, 30) + " Гб");
        }

    }
}
