public class Homework1_6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("До:" +"a = " + a+"," + "b = "+ b);
        int qwert = a;
        a = b;
        b = qwert;
        System.out.println("После:" +"a = " + a+"," + "b = "+ b);
    }
}
