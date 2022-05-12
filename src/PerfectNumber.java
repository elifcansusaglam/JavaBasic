import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number :");
        int sum=0;
        int number =input.nextInt();

        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println(number+" is a perfect number");
        }else{
            System.out.println(number+" is not a perfect number");
        }
    }
}
