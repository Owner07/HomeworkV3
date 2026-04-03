package HomeWork5.two;

public class Rectangle extends Figure{
    public Rectangle(int side, int side2, int side3, int side4) {
        super(side);
    }

    public void perimeter(){
        System.out.println("Периметр прямоугольника = " + ((side + side2) * 2));
    }

    public void square(){
        System.out.println("Площадь прямоугольника = " +(side * side2));
    }
}
