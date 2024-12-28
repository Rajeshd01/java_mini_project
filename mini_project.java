
import java.util.Scanner;

public class mini_project {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Input Your Choice \n 1. List Even Number \n 2. Sum Of Even Numer \n 3. Count of even number \n 4. Prime Number \n 5. Factorial of a number \n 6. List Odd Number \n 7. Sum Of Odd Numer \n 8. Count of Odd number \n 9. palindrome of Number \n 10. String palindrome");
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
                System.err.println("Sum Of Even Number");
                System.out.println("Enter The Start Range: ");
                int numSst = in.nextInt();
                System.out.println("Enter The End Range:");
                int numSed = in.nextInt();
                System.err.println("\n");

                SumEven(numSed, numSst);
        }
    }

    public static void ListEven(int numSt, int numEd) {
        for (int i = numSt; i <= numEd; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

    public static void SumEven(int numSed, int numSst) {
        int count = 0;
        for (int i= numSst; i<= numSed; i++){
            if (i %2 ==0){
                count++;
            }
        }

        System.err.println("The Total Even Digit From the Range is :" + count);


    }
}
