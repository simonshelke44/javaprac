// Check whether a number is even or odd


//Qs. Print if a number is prime or not (Input n from the user). 
//[In this problem you will learn how to check if a number is prime or not]

/*import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the integer value: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The number " + n + " is even.");
        }else{
            System.out.println("The number " + n + " is odd.");
        }
    }
}*/


import java.util.*;

public class evenodd{
    public static void main(String[] args) {
        System.out.println("Enter the integer you want to check if even or odd: ");

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 ==0){
            System.out.println("The number " + n + " is even.");
        }else if(n%2 ==1){
            System.out.println("The number " + n + " is odd.");
        }else{
            System.out.println("Invalid input.");
        }
        
    }
}
