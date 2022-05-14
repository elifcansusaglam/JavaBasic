import java.util.Scanner;

public class CalculatePrimeNumbers {
    //"Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program
    static boolean checkPrime(int number,int index){
        if(number<=2){
            return (number==2)?true:false;
        }
        if(number % index==0){
            return false;
        }
        if(index*index>number){
            return true;
        }
        return checkPrime(number,index+1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Enter a number : ");
            int number=input.nextInt();
            boolean result=checkPrime(number,2);
            if(result){
                System.out.println(number+" is a prime number!");
            }else{
                System.out.println(number+" is not a prime number!");
            }
        }
    }
}
