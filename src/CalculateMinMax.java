import java.util.Scanner;

public class CalculateMinMax {
    public static void main(String[] args) {
        //Girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan program
        Scanner input =new Scanner(System.in);
        System.out.print("Kaç tane sayı girmek istiyorsunuz : ");
        int n=input.nextInt();
        int min=0,max=0,number;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayınız: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);
    }
}
