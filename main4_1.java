import java.util.Scanner;

public class main4_1 {
    public static void main(String[] args) {
        int start;
        int end;

        Scanner scan = new Scanner(System.in);
        exercise4_1 process = new exercise4_1();

        System.out.print("Enter start number : ");
        start = scan.nextInt();

        System.out.print("Enter end number : ");
        end = scan.nextInt();

        process.setStart(start);
        process.setEnd(end);
        process.cal();

        scan.close();
    }
}
