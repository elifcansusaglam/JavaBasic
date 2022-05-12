import java.util.Scanner;

public class CalculateEbobEkok {
    public static void main(String[] args) {
        // EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni
        // EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı
        // EKOK = (n1*n2) / EBOB
        // iki sayının EBOB ve EKOK değerlerini hesaplayan program
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number1= input.nextInt();
        System.out.print("Enter number : ");
        int number2= input.nextInt();
        int smallest,ebob=1,ekok;
        if(number1<number2) {
            smallest = number1;
        }
        else{
            smallest=number2;
        }
        int i=smallest;
        System.out.println("smallest : "+smallest);
        System.out.println("i:"+i);
        while(i>1){
            if(number1%i==0 && number2%i==0){
                ebob=i;
                break;
            }
            i--;
        }
        System.out.println("EBOB is : "+ebob);
        ekok=(number1*number2)/ebob;
        System.out.println("EKOK is : "+ekok);
    }
}
