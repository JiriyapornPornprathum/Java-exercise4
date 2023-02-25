import java.util.Scanner;

public class main4_3 {
    
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        exercise4_3 process = new exercise4_3();

        System.out.println("Enter number : ");
        num = scan.nextInt();

        process.setPrime(num);
        process.cal();
        process.display();

        scan.close();
    }
}
