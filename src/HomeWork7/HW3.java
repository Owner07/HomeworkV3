package HomeWork7;

public class HW3 {

    public void avg(String[] lines) {
        String a = lines[0];
        String b = lines[1];
        String c = lines[2];

        double avgLength = (a.length() + b.length() + c.length()) / 3.0;

        System.out.println("Средняя длина строк: " + avgLength);
        System.out.println("Строки короче средней длины:");

        String[] all = {a, b, c};

        for (int i = 0; i < all.length; i++) {
            if (all[i].length() < avgLength) {
                System.out.println("Строка: " + all[i] + " длина: " + all[i].length());
            }
        }
    }
}