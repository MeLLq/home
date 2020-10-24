package praktika13;

import java.util.Scanner;

public class FIO {
    public static void main(String[] args) {
        String surname = " ";
        String name = " ";
        String patronymic = " ";
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Фамилия: ");
        if (sc.hasNextInt()) {
            System.out.println("Вы ввели не корректную фамилию перезапустите программу и попробуйте снова");
            System.exit(0);
        } else surname = sc.nextLine();
        System.out.println("Имя: ");
        if (sc.hasNextInt()) {
            System.out.println("Вы ввели не корректное имя перезапустите программу и попробуйте снова");
            System.exit(0);
        } else name = sc.nextLine();
        System.out.println("Есть ли отчество? если да то впиши 1 если нет то впиши любое число");
        if(sc.hasNextInt()){
            a = sc.nextInt();
            sc.skip(".*\n");
            if (a == 1) {
                System.out.println("Отчество:");
                patronymic = sc.nextLine();
                System.out.println("Фамиилия: " + surname + "\n" + " Имя: " + name + "\n" + "Отчество: " + patronymic);
            } else System.out.println("Фамиилия: " + surname + "\n" + " Имя: " + name);
            sc.close();
        }else{System.out.println("Вы ввели не корректное число перезапустите программу и попробуйте снова");
            System.exit(0);

    }
}}
