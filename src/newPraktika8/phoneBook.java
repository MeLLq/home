package newPraktika8;

import praktika13.PhoneNumber;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class phoneBook {
    public static void main(String[] args) {
        int counter = 0;
        String input;
        Map<String, String> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            input = scanner.nextLine();
            boolean checkLetters1 = input.matches("^[a-zA-Zа-яА-Я]+$");
            boolean checkLetters2 = input.matches("[a-zA-Zа-яА-Я\\-]+[ ][a-zA-Zа-яА-Я\\-]+");
            boolean checkLetters3 = input.matches("[a-zA-Zа-яА-Я\\-]+[ ][a-zA-Zа-яА-Я\\-]+[ ][a-zA-Zа-яА-Я\\-]+");
            boolean checkNumbers = input.matches("[0-9]+$");
            if (input.equals("LIST")) {
                for (Map.Entry<String, String> item : map.entrySet()) {

                    System.out.println(item.getKey() + " - " + item.getValue());
                }
            } else if (input.equals("EXIT")) {
                flag = false;
            } else if (checkLetters1 || checkLetters2 || checkLetters3) {
                counter = 0;
                for (Map.Entry<String, String> item : map.entrySet()) {
                    if (input.equals(item.getKey())) {
                        System.out.println(item.getKey() + " - " + item.getValue());
                        counter++;
                        break;
                    }
                }
                if (counter == 0) {
                    System.out.println("Впишите номер: ");
                    String phone = scanner.nextLine();
                    PhoneNumber phoneNumber = new PhoneNumber();
                    phone = phoneNumber.phoneNumberEdit(phone);
                    System.out.println(phone);
                    map.put(input, phone);
                }
            } else if (checkNumbers) {
                counter = 0;
                for (Map.Entry<String, String> item : map.entrySet()) {
                    if (input.equals(item.getValue())) {
                        System.out.println(item.getKey() + " - " + item.getValue());
                        counter++;
                        break;
                    }
                }
                if (counter == 0) {
                    System.out.println("Впишите имя: ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    map.put(name, input);
                }
            } else {
                System.out.println("Данные введены некорректно");
            }
        }
    }
}