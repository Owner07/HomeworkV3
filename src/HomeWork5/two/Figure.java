package HomeWork5.two;

public abstract class Figure {
    int side;
    int side2;
    int side3;
    int side4;

    public Figure(int side) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public abstract void perimeter();
    public abstract void square();
}
