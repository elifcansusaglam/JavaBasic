import java.util.Scanner;
import java.lang.Math;

public class CalculateArmstrongNumbers {
    //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
    //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    //1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int count=1,sum=0,temp1;
        temp1=number;
        while(number > 10){
            if (number / 10 > 0) {
                count++;
                number = number / 10;
            }
        }
        System.out.println("count : "+ count);
        number =temp1;
        while(number>1) {
            int temp= number%10;
            sum =sum + (int)Math.pow(temp,count);
            number=number/10;
        }
        System.out.println("sum : "+ sum);
        number =temp1;
        if(sum==number)
            System.out.println(number+" is a armstrong number!");
        else
            System.out.println(number+" is not a armstrong number!");
    }
}
