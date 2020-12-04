package newPraktika11;

public class Inf {
    String company;
    double cost;

    public Inf(String company, double cost) {
        this.company = company;
        this.cost = cost;
    }
    public void WriteInfo() {
        System.out.println(this.company + ", " + this.cost);
    }
}
