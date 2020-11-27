package newPraktika10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        doubleFolder();
    }
    public static void doubleFolder() {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File f1 = new File(path);
        if (!f1.exists() || !f1.isDirectory()) {
            Log.log("Не верно введен путь");
            System.err.println("Не верно введен путь");
            return;
        }
        path = sc.nextLine();
        File f2 = new File(path);
        if (!f2.exists() || !f2.isDirectory()) {
            Log.log("Не верно введен путь");
            System.err.println("Не верно введен путь");
            return;
        }
        long filesCount = 0;
        Queue<File> q = new PriorityQueue<File>();
        q.add(f1);
        while (!q.isEmpty()) {
            File fl = q.poll();
            for (File i : fl.listFiles()) {
                File f = new File(f2.getPath() + i.getPath().substring(f1.getPath().length()));
                //
                if (i.isDirectory()) {
                    q.add(i);
                    f.mkdir();
                } else {
                    try {
                        Files.copy(Paths.get(i.getPath()),
                                Paths.get(f.getPath()),
                                StandardCopyOption.REPLACE_EXISTING);
                        filesCount++;
                    } catch (IOException ex) {
                        System.err.println("Файл не скопирован: " + ex.getMessage());
                        Log.log("Файл не скопирован: " + ex.getMessage());
                    }
                }
            }
        }
        System.out.println("Копирование завершено,скопированно: " + filesCount);
        Log.log("Копирование завершено,скопированно: " + filesCount);
    }
}

