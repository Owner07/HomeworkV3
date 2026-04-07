package HomeWork7;

public class HW2 {
    public String[] sortString (String[] lines) {
        if (lines == null || lines.length == 0) {
            return new String[0];
        }

        String[] sorted = lines.clone();

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i].length() > sorted[j].length()) {
                    String temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}
