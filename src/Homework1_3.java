public class Homework1_3 {
    public static void main(String[] args) {
        int n = 489;
        int n1 = n / 100;
        int n2 = (n / 10) % 10;
        int n3 = n % 10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1 + n2 + n3);
    }
}
