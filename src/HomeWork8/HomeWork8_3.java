package HomeWork8;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] symbols = new String[3];

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = scanner.nextLine();
        }

        Map<String, Boolean> res = Arrays.stream(symbols)
                .collect(Collectors.toMap(
                        str -> str,
                        str -> false,
                        (existing, replacement) -> true
                ));

        System.out.println(res);
    }
}