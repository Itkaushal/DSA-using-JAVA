import java.util.Scanner;

// wrap to print fibonacci series up to user input number?
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        int first_num =0;
        int second_num =1;
        System.out.println("Fibonacci Series up to "+n+ "terms");

        for (int i=1; i<=n; i++){
            System.out.print(first_num + " ");
            int next = first_num+second_num;
            first_num= second_num;
            second_num=next;
        }

    }
}
