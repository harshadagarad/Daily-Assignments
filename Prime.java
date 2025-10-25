import java.util.Scanner;
public class Prime{
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
System.out.println("Enter number to check its prime or not: ");
       int n = sc.nextInt();
       
       boolean flag = true;
       for(int i = 2; i< n/2; i++){
       if(n % i == 0){
       flag = false;
       break;
       }
       }
       if (flag)
       System.out.println( n + " Is prime");
       else
       System.out.println( n + " Is not prime");
}
}