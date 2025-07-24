package starterUtilityConfig;

import domain.Token;

import java.util.List;
import scannerUtility.Scanner;

public class Runner {
    public static void run(String source) {
        Scanner scanner = new Scanner(source);
//        List<Token> tokens = scanner.scanTokens();
        List<Token> tokens = scanner.scanTokens();

        // For now, just print the tokens.
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}
