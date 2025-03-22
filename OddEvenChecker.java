import java.util.Scanner;

public class OddEvenChecker { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter an integer: "); 
        if (scanner.hasNextInt()) { 
            int number = scanner.nextInt(); 
            if (number % 2 == 0) {
                System.out.println(number + " is an even number."); 
            } else {
                System.out.println(number + " is an odd number."); 
            }
        } else {
            System.out.println("Invalid input. Please enter an integer."); // 
        }
        scanner.close(); 
    }
}