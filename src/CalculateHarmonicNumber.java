import java.util.Scanner;
public class CalculateHarmonicNumber {
    public static void main(String[] args) {
        //Girilen sayının harmonik serisini bulan program

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number =input.nextInt();
        double sum=0.0;
        for(int i=1 ;i<=number ;i++){
            sum+=(1.0/i);
        }
        System.out.println("Harmonic sum : "+sum);
    }
}
