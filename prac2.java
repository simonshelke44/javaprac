// Check whether a number is even or odd

import java.util.*;
public class prac2 {
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
}
