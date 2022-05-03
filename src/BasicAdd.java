import java.util.Scanner;

public class BasicAdd {
    public static void main(String[]args){
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        // çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

        int sum=0;
        boolean controller=true;
        while(controller){
            System.out.print("Lütfen çift sayı giriniz : ");
            Scanner input =new Scanner(System.in);
            int number = input.nextInt();
            if(number%2==1){
                controller=false;
                System.out.println("Tek sayı girdiniz!");
            }
            if(number%2==0){
                if(number%4==0){
                    sum+=number;
                }

            }
        }
        System.out.println("Çift ve 4'ün katları olan sayıları toplamı : "+sum);
    }
}
