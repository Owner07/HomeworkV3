package HomeWork7;

public class HW1 {
    public String MaxString(String[] lines) {
        if (lines == null || lines.length == 0) {
            return null;
        }

        String max = lines[0];
        for (String line : lines) {
            if (line.length() > max.length()) {
                max = line;
            }
        }
        return max;
    }

    public String MinString(String[] lines) {
        if (lines == null || lines.length == 0) {
            return null;
        }

        String min = lines[0];
        for (String line : lines) {
            if (line.length() < min.length()) {
                min = line;
            }
        }
        return min;
    }
}