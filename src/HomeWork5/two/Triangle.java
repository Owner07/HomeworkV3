package HomeWork5.two;

public class Triangle extends Figure{
    public Triangle(int side, int side2, int side3, int side4) {
        super(side, side2, side3, side4);
    }

    public void perimeter(){
        System.out.println("Периметр треугольника = " + (side + side2 + side3) + "см");
    }

    public void square(){
        System.out.println("Площадь треугольника = " + side * (side4 / 2) + "см");
    }
}
