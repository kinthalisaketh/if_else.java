import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You are not allowed to drive!");
        }

        scanner.close();
    }
}
