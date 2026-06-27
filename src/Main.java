import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = false;

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator cal = new Calculator();

        int choice;
        boolean chk = false;

        do {
            System.out.println("Choose any operation: \n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Addition");
                    int sum = cal.add(a, b);
                    System.out.println("Sum: " +sum);
                    repeat = cal.repeatPrompt(sc);
                    chk = false;
                    break;
                case 2:
                    System.out.println("Substraction");
                    int sub = cal.sub(a, b);
                    System.out.println("Difference: " +sub);
                    cal.repeatPrompt(sc);
                    chk = false;
                    break;
                case 3:
                    System.out.println("Multiplication");
                    int mul = cal.multiply(a, b);
                    System.out.println("Multiplication: " +mul);
                    cal.repeatPrompt(sc);
                    chk = false;
                    break;
                case 4:
                    System.out.println("Division");
                    int div = cal.divide(a, b);
                    System.out.println("Division: " +div);
                    cal.repeatPrompt(sc);
                    chk = false;
                    break;
                default:
                    System.out.println("Enter a valid choice....!");
                    chk = true;
            }
        } while(chk || repeat);
    }
}