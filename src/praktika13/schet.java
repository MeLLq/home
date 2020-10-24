package praktika13;

import java.util.Scanner;

public class schet {

    public static void main(String[] args) {
        String text = "Вася заработал 50000 рублей, Петя заработал - 7563 рубля, а  Маша - 30000 рублей";
        String[] text2=text.split(" ");
        int Vasya=Integer.parseInt(text2[2].trim());
        int Masha=Integer.parseInt(text2[13].trim());
        System.out.println(Masha+Vasya);
    }
}