import java.util.Scanner;
public class ExponentialNumbers {
    public static void main(String[] args) {
        //Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz :  ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i*=4) {
            System.out.println("4'ün katları: " + i);
        }
        System.out.println("");
        for(int j = 1; j <= number; j*=5) {
            System.out.println("5'in katları : " + j);
        }
    }
}
