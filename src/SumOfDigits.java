import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Bir sayının basamak sayılarının toplamını hesaplayan program
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int sum=0;
        while(number>1) {
            int temp= number%10;
            sum =sum + temp;
            number=number/10;
        }
        System.out.println("sum : "+sum);
    }
}
