import java.util.*;

class sum{
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        for(int i =1; i< n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: "+ sum);
    }
}