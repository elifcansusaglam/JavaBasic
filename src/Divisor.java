import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

        System.out.print("Lütfen sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum=0,count=0;
        float avg;
        for(int i=1;i<=number ;i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                count++;
                System.out.println("count"+count);

            }
        }
        avg = (float) sum/count;
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması : "+avg);
    }
}