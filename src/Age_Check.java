import java.util.Scanner;
public class Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("You are 21 or older. You get a wristband.");
        }
        scanner.close();
    }
}
