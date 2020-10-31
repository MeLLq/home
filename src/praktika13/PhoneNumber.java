package praktika13;

public class PhoneNumber {
    String n = new String();
    int count = 0;
   public String phoneNumberEdit(String a) {
       for (int i = 0; i < a.length(); i++) {
           if (((a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '(' || a.charAt(i) == ')' || a.charAt(i) == ' ' || a.charAt(i) == '-' || a.charAt(i) == '+') && count < 20) {
               if (a.charAt(i) >= '0' && a.charAt(i) <= '9') ;
               n += String.valueOf(a.charAt(i));
               count++;
           } else {
               return ("Не верный формат номера");
           }
       }
       if (n.length() == 13 && n.charAt(0) == '9')
           return ("+7" + "(" + n.substring(0, 3) + ")" + n.substring(4, 7) + "-" + n.substring(8, 10) + "-" + n.substring(11, 13));
       else if (n.length() == 16 && (n.charAt(0) == '+' || n.charAt(0) == '8'))
           return ("+7" + "(" + n.substring(3, 6) + ")" + n.substring(7, 10) + "-" + n.substring(11, 13) + "-" + n.substring(14, 16));
       else if (n.length() == 11 && (n.charAt(0) == '7' || n.charAt(0) == '8'))
           return ("+7" + "(" + n.substring(1, 4) + ")" + n.substring(4, 7) + "-" + n.substring(7, 9) + "-" + n.substring(9, 11));
       else if (n.length() == 18 && (n.charAt(0) == '+' || n.charAt(0) == '8'))
           System.out.println("+7" + "(" + n.substring(4, 7) + ")" + n.substring(9, 12) + "-" + n.substring(13, 15) + "-" + n.substring(16, 18));
       else if (n.length() == 13 && n.charAt(0) == '8')
           return ("+7" + "(" + n.substring(3, 6) + ")" + n.substring(7, 10) + "-" + n.substring(10, 12) + "-" + n.substring(12, 13));
       return ("Не верный формат номера");
   }
    public static void main(String[] args) {
        new PhoneNumber().phoneNumberEdit(null);

}
}
