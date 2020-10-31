package newPraktika8;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line;
        String str = "";
        String[] lineArr;
        ArrayList<String> listOfCases = new ArrayList<String>();
        listOfCases.add("Почистить зубы");
        listOfCases.add("Умыться");
        listOfCases.add("Покушать");

        System.out.println("Для выхода из программы введите - EXIT");

        line = read.nextLine();

        while (!line.equals("EXIT")) {
            lineArr = line.split(" ");

            switch (lineArr[0]) {
                case ("LIST"):
                    if (lineArr.length == 1)
                        for (int i = 0; i < listOfCases.size(); i++)
                            System.out.println(i + ": " + listOfCases.get(i));
                    else
                        System.out.println("Неизвестная команда.");
                    break;
                case ("ADD"):
                    if (lineArr.length > 1 && !(lineArr[1].charAt(0) >= '0' && lineArr[1].charAt(0) <= '9')) {
                        for (int i = 1; i < lineArr.length; i++) {
                            str += lineArr[i] + " ";
                        }

                        listOfCases.add(str);
                    } else if (lineArr.length > 2 && lineArr[1].charAt(0) >= '0' && lineArr[1].charAt(0) <= '9' && Integer.parseInt(lineArr[1].trim()) < listOfCases.size()) {
                        for (int i = 2; i < lineArr.length; i++)
                            str += lineArr[i] + " ";

                        listOfCases.add(Integer.parseInt(lineArr[1].trim()), str);
                    } else
                        System.out.println("Неизвестная команда.");
                    break;
                case ("EDIT"):
                    if (lineArr.length > 2 && lineArr[1].charAt(0) >= '0' && lineArr[1].charAt(0) <= '9' && Integer.parseInt(lineArr[1].trim()) < listOfCases.size()) {
                        for (int i = 2; i < lineArr.length; i++)
                            str += lineArr[i] + " ";


                        listOfCases.set(Integer.parseInt(lineArr[1].trim()), str);
                    } else
                        System.out.println("Неизвестная команда.");
                    break;
                case ("DELETE"):
                    if (lineArr.length == 2 && lineArr[1].charAt(0) >= '0' && lineArr[1].charAt(0) <= '9' && Integer.parseInt(lineArr[1].trim()) < listOfCases.size())
                        listOfCases.remove(Integer.parseInt(lineArr[1].trim()));
                    else
                        System.out.println("Неизвестная команда.");
                    break;
                default:
                    System.out.println("Неизвестная команда.");
                    break;
            }
            line = read.nextLine();
            str = "";
        }
    }
}

