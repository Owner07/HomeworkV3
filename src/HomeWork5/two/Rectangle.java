package HomeWork5.two;

public class Rectangle extends Figure{
    public Rectangle(int side, int side2) {
        super(side, side2);
    }

    public int perimeter(){
        System.out.println("Периметр прямоугольника = " + ((side + side2) * 2) + " см");
        return (side + side2) * 2;
    }

    public int square(){
        System.out.println("Площадь прямоугольника = " +(side * side2) + " см");
        return side * side2;
    }
}
