import java.util.Scanner;
abstract class Shape {
    public abstract double Area();
    public abstract void Stroka();
}
class Circle extends Shape{
    private int radius;
    private String S;
    public void setRadius(int a) {
        this.radius = a;
    }
    public int getRadius() {
        return radius;
    }
    public void setS(String s) {
        this.S = s;
    }
    public String getS() {
        return S;
    }
    Circle(int radius, String CenterCircle)
    {
        setS(CenterCircle);
        setRadius(radius);
    }
    public double Area() {
        return 3.14* getRadius()* getRadius();
    }
    public double Circumference()
    {
        return 2*3.14* getRadius();
    }
    public void Stroka() {
        System.out.println("Вывод окружности: ");
        System.out.format("%d \n", getRadius());
        System.out.println(getS());
        System.out.println(Area());
        System.out.println(Circumference());
    }
}
class Square extends Shape{
    private int side;
    public void setSide(int a) {
        this.side = a;
    }
    public int getSide() {
        return side;
    }
    Square(int side){
        setSide(side);
    }
    public double Area() {
        return getSide()* getSide();
    }
    public void Stroka() {
        System.out.println("Вывод Квадрата: ");
        System.out.println(getSide());
        System.out.println(Area());
    }
}
class Rectangle extends Shape{
    private int sidea;
    private int sideb;
    public void setSidea(int sidea) {
        this.sidea = sidea;
    }
    public int getSidea() {
        return sidea;
    }
    public void setSideb(int sideb) {
        this.sideb = sideb;
    }
    public int getSideb() {
        return sideb;
    }
    Rectangle(int sidea, int sideb){
        setSidea(sidea);
        setSideb(sideb);
    }
    public double Area() {
        return getSidea()* getSideb();
    }
    public void Stroka() {
        System.out.println("Вывод прямоугольника: ");
        System.out.println(getSidea());
        System.out.println(getSidea());
        System.out.println(Area());
    }
}
public class Shapetaste{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R;
        String CenterCircle;
        System.out.println("Введите радиус окружности: ");
        R=sc.nextInt();
        System.out.println("Введите центр окружности: ");
        CenterCircle=sc.next();
        Circle circle=new Circle(R,CenterCircle);
        int a,b,l;
        System.out.println("Введите сторону квадрата: ");
        a=sc.nextInt();
        Square square=new Square(a);
        System.out.println("Введите сторону прямоугольника: ");
        b=sc.nextInt();
        System.out.println("Введите вторую сторону прямоугльника: ");
        l=sc.nextInt();
        Rectangle rectangle=new Rectangle(b,l);
        circle.Stroka();
        square.Stroka();
        rectangle.Stroka();
    }
}
