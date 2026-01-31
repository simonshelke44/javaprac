//Homework Problems
///Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.
///Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.


import java.util.*;

public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number (a):");
        int a = sc.nextInt();

        System.out.println("Enter the second number (b): ");
        int b = sc.nextInt();

        System.out.println("The numbers are: "+ a + "and" +b);
        System.out.println("Enter the operation: ");

        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        System.out.println("Enter your choice: ");

        int op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("addition is : "+ (a+b));
                break;
            case 2:
                System.out.println("sub is: "+ (a-b));
                break;
            case 3:
                System.out.println("multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division is: "+ (a/b));
                break;
            case 5:
                System.out.println("modulus is "+ (a%b));
                break;
            default:
                System.out.println("Invaild operation.");
                break;

        }

        

        
        
    }
}
