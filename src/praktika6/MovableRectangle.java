import java.util.Scanner;

interface Movable {
    public void move();
}

class MovableRectangle implements Movable {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int movecounter;

    public int getX1() {
        return x1;
    }

    public MovableRectangle setX1(int x1) {
        this.x1 = x1;
        return this;
    }

    public int getY1() {
        return y1;
    }

    public MovableRectangle setY1(int y1) {
        this.y1 = y1;
        return this;
    }

    public int getX2() {
        return x2;
    }

    public MovableRectangle setX2(int x2) {
        this.x2 = x2;
        return this;
    }

    public int getY2() {
        return y2;
    }

    public MovableRectangle setY2(int y2) {
        this.y2 = y2;
        return this;
    }

    public int getMovecounter() {
        return movecounter;
    }

    public MovableRectangle setMovecounter(int movecounter) {
        this.movecounter = movecounter;
        return this;
    }

    MovableRectangle(int x1, int y1, int x2, int y2, int movecounter) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMovecounter(movecounter);
    }

    @Override
    public void move() {
        for (int i = 0; i <= 5; i++) {
            this.setX1(getX1() + getMovecounter())
                    .setX2(getX2() + getMovecounter());
            System.out.printf("Перемещение вершин:%nx1: %d y1: %d x2: %d y2: %d%n", getX1(), getY1(), getX2(), getY2());
        }
    }


    public static void main(String[] args) {
        int x1, y1, x2, y2, movecounter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую вершину прямоугольника: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Введите вторую вершину прямоугольника: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Введите счетчик движения: ");
        movecounter = sc.nextInt();
        MovableRectangle move = new MovableRectangle(x1, y1, x2, y2, movecounter);
        Movable vable = move;
        vable.move();
    }


}

