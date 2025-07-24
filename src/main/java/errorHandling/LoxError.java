package errorHandling;

public class LoxError {
    private static boolean hadError = false;
    public static void error(int line, String message) {
        report(line, "", message);
    }

    private static void report(int line, String where,
                               String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message);
        setHadError(true);
    }

    public static boolean isHadError() {
        return hadError;
    }

    public static void setHadError(boolean hadError) {
        LoxError.hadError = hadError;
    }
}
