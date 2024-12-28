
import java.util.Scanner;

public class mini_project {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Input Your Choice \n 1. List Even Number \n 2. Count Of Even Numer \n 3. Sum of even number \n 4. Prime Number \n 5. Factorial of a number \n 6. List Odd Number \n 7. Sum Of Odd Numer \n 8. Count of Odd number \n 9. palindrome of Number \n 10. String palindrome");
        System.out.print("Enter Your Choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("List Of Even Number");
                System.out.println("Enter The Start Range: ");
                int numSt = in.nextInt();
                System.out.println("Enter The End Range:");
                int numEd = in.nextInt();
                System.err.println("\n");

                ListEven(numSt, numEd);

                break;

            case 2:
                System.err.println("Count Of Even Number");
                System.out.println("Enter The Start Range: ");
                int numCst = in.nextInt();
                System.out.println("Enter The End Range:");
                int numCed = in.nextInt();
                System.err.println("\n");

                CountEven(numCed, numCst);
                break;

            case 3:
                System.out.println("Sum of Even Number");
                System.out.println("Enter The Start Range: ");
                int numSst = in.nextInt();
                System.out.println("Enter The End Range:");
                int numSed = in.nextInt();
                System.err.println("\n");

                SumEven(numSst, numSed);

            case 4:
                System.out.println("Check Prime Number");
                System.out.println("Enter The Number To Check: ");
                int primenum = in.nextInt();
                System.err.println("\n");

                Prime(primenum);

            case 5:
                System.out.println("Factorial Of a Number");
                System.out.println("Enter the number To factorial");
                int factnum = in.nextInt();
                System.err.println("\n");
        }
    }

    public static void ListEven(int numSt, int numEd) {
        for (int i = numSt; i <= numEd; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

    public static void CountEven(int numCed, int numCst) {
        int count = 0;
        for (int i = numCst; i <= numCed; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.err.println("The Total Even Digit From the Range is :" + count);

    }

    public static void SumEven(int numSst, int numsed) {
        int sum = 0;
        for (int i = numSst; i <= numsed; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The Sum Of Even Digint is :" + sum);

    }

    public static void Prime(int primenum) {
        int count = 0;
        for (int i = 1; i <= primenum; i++) {
            if (primenum % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Its Not a Prime Number");
        }

    }
}
