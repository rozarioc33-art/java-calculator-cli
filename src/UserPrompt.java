import java.util.Scanner;

public class UserPrompt {

    private static final Scanner sc = new Scanner(System.in);

    public static int userInput() {
        return sc.nextInt();
    }

    public static void close() {
        sc.close();
    }
}
