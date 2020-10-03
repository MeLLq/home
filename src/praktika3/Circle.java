public class Circle {
   private double R,D;
    public void Radius(int D)
    {
        R=D/2;
        System.out.print("Радиус=");
        System.out.print(R);
    }
    public void setD(int a) {
        this.D=a;
    }
    public double getD() {
        return D;
    }
}
