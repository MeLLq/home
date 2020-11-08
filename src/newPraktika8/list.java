package newPraktika8;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {

        int editInput, deleteInput;
        String input, addCase, editCase;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Сделать дз по Java");
        toDoList.add("Посетить магазин");
        while (flag) {
            input = scanner.next();
            if (input.equals("LIST")) {
                for (int j = 0; j < toDoList.size(); j++) {
                    System.out.println(j + "." + toDoList.get(j));
                }
            } else if (input.equals("ADD")) {
                String[] temp = scanner.nextLine().strip().split(" ", 2);
                if (temp.length == 1) {
                    toDoList.add(temp[0]);
                } else if (temp.length > 1) {
                    int index = Integer.parseInt(temp[0]);
                    if (!(index > toDoList.size())) {
                        toDoList.add(index, temp[1]);
                    } else {
                        toDoList.add(temp[1]);
                    }
                }
            } else if (input.equals("EDIT")) {
                try {editInput = scanner.nextInt();
                    toDoList.remove(editInput);
                    editCase = scanner.nextLine();
                    toDoList.add(editInput, editCase);
                } catch (Exception i) {
                    System.out.println("Не верный ввод");
                }
            } else if (input.equals("DELETE")) {
                try {deleteInput = scanner.nextInt();
                    toDoList.remove(deleteInput);
                } catch (Exception e) {
                    System.out.println("Не верный ввод");
                }
            } else if (input.equals("EXIT")) {
                flag = false;
            } else {
                System.out.println("Неверная команда. Повторите ввод.");
            }
        }
    }
}

