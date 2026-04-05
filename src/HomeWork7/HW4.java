package HomeWork7;

public class HW4 {
    public boolean hasUniqueChars(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public String firstWorld(String[] lines) {
        for (String word : lines) {
            if (hasUniqueChars(word)) {
                return word;
            }
        }
        return null;
    }

    public void printResult(String[] lines) {
        String result = firstWorld(lines);
        if (result != null) {
            String green = "\u001B[32m";
            String reset = "\u001B[0m";
            System.out.println("Найдено слово: " + green + result + reset);
            System.out.println("Количество символов: " + result.length());
        } else {
            String red = "\u001B[31m";
            String reset = "\u001B[0m";
            System.out.println(red + "Слов с уникальными символами не найдено!" + reset);
        }
    }
}
