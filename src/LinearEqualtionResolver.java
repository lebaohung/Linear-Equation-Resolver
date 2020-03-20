import java.sql.SQLOutput;
import java.util.Scanner;
public class LinearEqualtionResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equaltion Resolver");
        System.out.println("Given an equation a*x + b = 0. Please enter constant");
        System.out.print("a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if ( b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution");
            }
        } else {
            double answer = -b/a;
            System.out.printf("The solution is x = %f", answer);
        }
    }
}
