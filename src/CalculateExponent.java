import java.util.Scanner;
public class CalculateExponent {
    public static void main(String[] args) {
        //Kullanıcının girdiği değerler ile üslü sayı hesaplayan program

        Scanner input =new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :");
        int number =input.nextInt();
        System.out.print("Üs giriniz :");
        int exponent =input.nextInt();
        int result=1;

        for(int i=0;i<exponent;i++){
             result=result*number;
        }
        System.out.println("Cevap : "+result);

    }
}
