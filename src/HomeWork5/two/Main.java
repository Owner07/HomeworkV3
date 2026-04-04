package HomeWork5.two;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Rectangle rectangle = new Rectangle(10, 20, 30,40);
        Triangle triangle = new Triangle(10, 20, 30, 40);

        circle.perimeter();
        circle.square();

        triangle.perimeter();
        triangle.square();

        rectangle.perimeter();
        rectangle.square();

    }
}
