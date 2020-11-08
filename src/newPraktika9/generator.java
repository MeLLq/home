package newPraktika9;
import java.util.*;

public class generator {
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
    }
}
