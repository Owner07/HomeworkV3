package HomeWork5.two;

public class Circle extends Figure {
    public Circle(int side, int side2, int side3, int side4) {
        super(side, side2, side3, side4);
    }

    public void perimeter(){
        System.out.println("Периметр круга = " + (side / 2) * Math.PI);
    }

    public void square(){
        System.out.println("Площадь круга = " + ((side * side)* Math.PI));
    }
}
