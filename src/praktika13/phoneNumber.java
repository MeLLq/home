package praktika13;

import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String n = new String();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (((a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '(' || a.charAt(i) == ')' || a.charAt(i) == ' ' || a.charAt(i) == '-' || a.charAt(i) == '+') && count < 11) {
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9') ;
                n += String.valueOf(a.charAt(i));
                count++;
            } else {
                System.out.println("Не верный формат номера");
                return;
            }
        }
        if (n.length() == 10 && n.charAt(0) == '9')
            System.out.println("+7" + "(" + n.substring(0, 3) + ")"+n.substring(3,6)+"-"+n.substring(6,8)+"-"+n.substring(8,10));
        else if(n.length()==11&&(n.charAt(0)=='7'||n.charAt(0)=='8'))
        System.out.println("+7" + "(" + n.substring(1, 4) + ")"+n.substring(4,7)+"-"+n.substring(7,9)+"-"+n.substring(9,11));
        else System.out.println("Не верный формат номера");
    }
}
