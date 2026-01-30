import java.util.*;


public class greaterequalsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("The numbers are equal.");
        }
        else{
            if(a>b){
                System.out.println("The number a is greater than b.");

            }else{
                System.out.println("The number b is greater than a.");
            }
        }
    }
}
