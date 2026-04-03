package HomeWork5.two;

public class Circle extends Figure {
    public Circle(int side) {
        super(side);
    }

    public void perimeter(){
        System.out.println("Периметр круга = " + (side / 2) * Math.PI);
    }

    public void square(){
        System.out.println("Площадь круга = " + ((side * side)* Math.PI));
    }
}
