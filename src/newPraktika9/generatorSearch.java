package newPraktika9;

import java.util.*;

public class generatorSearch {
    public static void main(String[] args) {
        List<String> arrayNumbers = new ArrayList<String>();
        String[] arrayStringLetter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] n = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        for (String s : arrayStringLetter)
            for (String a : n)
                for (String value : arrayStringLetter)
                    for (String item : arrayStringLetter)
                        for (int i5 = 1; i5 < 200; i5++)
                            if (i5 < 10)
                                arrayNumbers.add(s + a + value + item + "0" + i5);
                            else
                                arrayNumbers.add(s + a + value + item + i5);

        HashSet<String> arrayNumberHash = new HashSet<String>(arrayNumbers);
        TreeSet<String> arrayNumberTree = new TreeSet<String>(arrayNumbers);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер, который хотите найти: ");
        String number = sc.nextLine();
        long start = System.nanoTime();
        boolean out1 = arrayNumbers.contains(number);
        long end1 = System.nanoTime() - start;
        Collections.sort(arrayNumbers);
        start = System.nanoTime();
        int outint2 = Collections.binarySearch(arrayNumbers, number);
        long end2 = System.nanoTime() - start;
        boolean out2;
        out2 = outint2 >= 0;
        start = System.nanoTime();
        boolean out3 = arrayNumberHash.contains(number);
        long end3 = System.nanoTime() - start;
        start = System.nanoTime();
        boolean out4 = arrayNumberTree.contains(number);
        long end4 = System.nanoTime() - start;
        System.out.println("Поиск перебором: " + out1 + ", на поиск потрачено: " + end1 + " нс");
        System.out.println("Бинарный поиск: " + out2 + ", на поиск потрачено: " + end2 + " нс");
        System.out.println("Поиск в HashSet: " + out3 + ", на поиск потрачено: " + end3 + " нс");
        System.out.println("Поиск в TreeSet: " + out4 + ", на поиск потрачено: " + end4 + " нс");
    }
}