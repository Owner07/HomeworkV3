package HomeWork5.two;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Rectangle rectangle = new Rectangle(12,15);
        Triangle triangle = new Triangle(10, 20, 30, 40);

        circle.perimeter();
        circle.square();

        triangle.perimeter();
        triangle.square();

        rectangle.perimeter();
        rectangle.square();

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(20);
        figures[1] = new Rectangle(17,20);
        figures[2] = new Triangle(12, 13, 14, 16);
        figures[3] = new Circle(25);
        figures[4] = new Rectangle(15,18);
        int sumPerimetr = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimetr += figures[i].perimeter();
        }
        System.out.println("Сумма периметров всех фигур = " + sumPerimetr + " см");
    }
}
