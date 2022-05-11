import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //Kullanıcının girdiği yılın artık olup olmadığını bulan program
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();

        if(year%4==0){
            if(year%100==0) {
                year=year/100;
                if (year % 4 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                }
                else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
            }else {
                System.out.println(year + " bir artık yıldır!");
            }
        }
        else{
            System.out.println(year + " bir artık yıl değildir!");
        }


    }
}
