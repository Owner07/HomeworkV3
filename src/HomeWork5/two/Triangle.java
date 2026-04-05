package HomeWork5.two;

public class Triangle extends Figure{
    public Triangle(int side4, int side3, int side2, int side) {
        super(side4, side3, side2, side);
    }

    public int perimeter(){
        System.out.println("Периметр треугольника = " + (side + side2 + side3) + " см");
        return side + side2 + side3;
    }

    public int square(){
        System.out.println("Площадь треугольника = " + side * (side4 / 2) + " см");
        return side * (side4 / 2);
    }
}
