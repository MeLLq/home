package newPraktika11;

import java.io.*;
import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {
        int it = 2;
        String line = " ";
        double revenue = 0;
        double cost = 0;
        boolean flag = false;

        try {
            ArrayList<St> st = new ArrayList<St>();
            ArrayList<Inf> infs = new ArrayList<Inf>();
            File file = new File("Data\\movementList.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while (it < 121) {
                line = bufferedReader.readLine();
                st.add(new St(line));

                revenue += st.get(it - 2).revenue;
                cost += st.get(it - 2).cost;

                it++;
            }

            infs.add(new Inf(st.get(0).Operation, st.get(0).cost));

            for (int i = 0; i < st.size(); i++) {
                for (int k = 0; k < infs.size(); k++) {
                    if (st.get(i).Operation.equals(infs.get(k).company)) {
                        infs.get(k).cost += st.get(i).cost;
                        flag = true;
                        break;
                    }
                }
                if (flag == false && st.get(i).cost != 0) {
                    infs.add(new Inf(st.get(i).Operation, st.get(i).cost));
                }
                flag = false;
            }

            System.out.println("Прибыль: " + revenue);
            System.out.println("Убыль: " + cost);

            for (int i = 0; i < infs.size(); i++) {
                infs.get(i).WriteInfo();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println(it);
        }
    }
}
