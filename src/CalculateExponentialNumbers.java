import java.util.Scanner;
public  class CalculateExponentialNumbers {
    static int result=1;
    static int calc(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        result*=base;
        calc(base,exponent-1);
        return result;
    }
    public static void main(String[] args) {
        //Taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base=input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent=input.nextInt();
        int result= calc(base,exponent);
        System.out.println("Sonuç : "+ result);
    }
}
