package starterUtilityConfig;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void run(String source) {
        Scanner scanner = new Scanner(source);
//        List<Token> tokens = scanner.scanTokens();
        List<String> tokens = scanner.tokens().toList();

        // For now, just print the tokens.
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
