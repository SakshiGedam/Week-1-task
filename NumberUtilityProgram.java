import java.util.Scanner;

public class NumberUtilityProgram {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a positive number.");
            return;
        } 

        System.out.println("\nChoose an operation:");
        System.out.println("1. Check Prime");
        System.out.println("2. Check Palindrome");
        System.out.println("3. Find Factorial");
        System.out.println("4. Fibonacci Series");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Prime: "+ isPrime(n));
                break;

            case 2:
                System.out.println("Palindrome: "+ isPalindrome(n));
                break;

            case 3:
                System.out.println("Factorial: "+ factorial(n));
                break;

            case 4:
                System.out.print("Fibonacci Series: ");
                fibonacci(n);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
             return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
