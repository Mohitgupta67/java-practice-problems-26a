import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10;

        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
    }
}