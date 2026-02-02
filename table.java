import java.util.*;

public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table you want to print: ");
        int n = sc.nextInt();

        for (int i = 0; i <=12 ; i++){
            System.out.println(n + "x" + i + " = " +(n*i));
            
        }

    }
}
