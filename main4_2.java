import java.util.Scanner;

public class main4_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        exercise4_2 process = new exercise4_2();

        System.out.print("Enter number : ");
        String num = scan.next();
        process.setNum(num);
        
        process.toStr(num);
        process.cal();
        System.out.println("Odd : " + process.Odd());
        System.out.println("Even : " + process.Even());
        System.out.println("Zero : " + process.Zero());

    }
}
