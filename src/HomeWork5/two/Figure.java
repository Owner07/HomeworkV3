package HomeWork5.two;

public abstract class Figure {
    int side;
    int side2;
    int side3;
    int side4;

    public Figure(int side4, int side3, int side2, int side) {
        this.side4 = side4;
        this.side3 = side3;
        this.side2 = side2;
        this.side = side;
    }

    public Figure(int side, int side2) {
        this.side = side;
        this.side2 = side2;
    }

    public Figure(int side) {
        this.side = side;
    }

    public abstract int perimeter();
    public abstract int square();
}
