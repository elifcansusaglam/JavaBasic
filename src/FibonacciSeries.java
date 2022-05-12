import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        //Fibonacci serisi bulan program
        Scanner input=new Scanner(System.in);
        System.out.println("Serinin eleman sayısını giriniz : ");
        int n =input.nextInt();
        int sum=0,previousNumber=0, nextNumber=1;
        for(int i=1;i<n;i++){
            sum=previousNumber+nextNumber;
            previousNumber=nextNumber;
            nextNumber=sum;
            System.out.println(sum);
        }
    }

}
