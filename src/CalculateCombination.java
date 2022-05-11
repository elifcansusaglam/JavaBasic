import java.util.Scanner;

public class CalculateCombination {
    public static void main(String[] args) {

        //Kombinasyon hesaplayan program
        //C(n,r) = n! / (r! * (n-r)!)

        int nFactorial=1,rFactorial=1,differenceFactorial=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz :");
        int n=input.nextInt();
        System.out.print("Seçim sayısını giriniz :");
        int r=input.nextInt();

        int difference=n-r;
        for (int i=1;i<=n;i++){
            nFactorial=i*nFactorial;
        }
        for (int j=1;j<=r;j++){
            rFactorial=j*rFactorial;
        }
        for (int k=1;k<=difference;k++){
            differenceFactorial=k*differenceFactorial;
        }
        int combination=nFactorial/(rFactorial*differenceFactorial);
        System.out.println("C("+n+","+r+") = "+combination);
    }
}
