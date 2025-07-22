import java.io.IOException;


import static starterUtilityConfig.ConsoleRunner.runPrompt;
import static starterUtilityConfig.FileRunner.runFile;


public class Main {
  public static void main(String[] args) throws IOException {
    // You can use print statements as follows for debugging, they'll be visible when running tests.
    System.err.println("Logs from your program will appear here!");

    if (args.length > 1) {
      System.out.println("Usage: jlox [script]");
      System.exit(64);
    } else if (args.length == 1) {
      runFile(args[0]);
    } else {
      runPrompt();
    }
  }
}
