import java.util.Scanner;

public class Calculator {
    int a;
    int b;

    int sum;
    int sub;

//    Calculator(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean repeatPrompt(Scanner sc) {
        System.out.println("Do you want to continue? \n 1. Yes \n 2. No");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Yes...");
            return true;
        } else {
            System.out.println("No...");
            return false;
        }
    }
}
