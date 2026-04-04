package HomeWork5.two;

public class Circle extends Figure {
    public Circle(int side) {
        super(side);
    }

    public int perimeter(){
        int res = (int) ((side * 2) * Math.PI);
        System.out.println("Периметр круга = " + res + " см");
        return (int) ((side * 2) * Math.PI);
    }

    public int square(){
        int res2 = (int) ((side * side)* Math.PI);
        System.out.println("Площадь круга = " + res2 + " см");
        return (int) ((side * side)* Math.PI);
    }
}
