package newPraktika11;

public class St {
    String currAc;
    String accNumb;
    String currency;
    String date;
    String transactionReference;
    String Operation;
    double revenue;
    double cost;

    public St(String line) {
        String[] a = line.split(",");
        this.currAc = a[0];
        this.accNumb = a[1];
        this.currency = a[2];
        this.date = a[3];
        this.transactionReference = a[4];
        for (int i = 0; i < a[5].length(); i++) {
            this.Operation = "";
            if (a[5].charAt(i) == '/' || a[5].charAt(i) == '\\')
                for (int j = i; j < a[5].length(); j++) {
                    if (a[5].charAt(j) == ' ' && a[5].charAt(j + 1) == ' ' && a[5].charAt(j + 2) == ' ') {
                        i = a[5].length();
                        break;
                    } else {
                        this.Operation += a[5].charAt(j);
                    }
                }
        }
        this.revenue = Double.parseDouble(a[6]);
        this.cost = Double.parseDouble(a[7]);
    }

}
