// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
class ControlFlow {

    static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int userInput = scanner.nextInt();
        
        if(isEven(userInput)) {
            System.out.println(userInput + " is even!");
        } else {
            System.out.println(userInput + " is odd!");
        }

    }
}
// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
