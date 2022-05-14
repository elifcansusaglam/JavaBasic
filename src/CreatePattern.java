import java.util.Scanner;

public class CreatePattern {
    // Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    // Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    // Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
    static int pattern(int number,int temp,boolean check){
        System.out.print (" "+temp);

        if (temp <= 0)
            check = false;
        if (!check && temp == number)
            return 1;
        if (check)
            return pattern(number,temp-5,check);
        else
            return pattern(number,temp+5,check);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=input.nextInt();
        pattern(number,number,true);
    }
}
