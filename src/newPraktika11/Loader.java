package newPraktika11;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        parseTable();
    }

    public static void parseTable() {
        try {
            List<String> table = Files.readAllLines(Paths.get("data/movementList.txt"));
            String[] line = table.get(7).split("\t");
            for (String s : line) {
                System.out.println(s);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
