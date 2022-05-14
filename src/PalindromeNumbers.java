import java.util.Scanner;

public class PalindromeNumbers {
    static boolean isPalindrome(int number){
        System.out.println("number");
        int temp=number,reverse=0,last;
        while(temp > 0){
            last = temp%10;
            reverse=(reverse*10)+last;
            temp=temp/10;
        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =input.nextInt();
        boolean result=isPalindrome(number);
        if(result){
            System.out.println(number+" is a palindrome number.");
        }else{
            System.out.println(number+" is not a palindrome number.");
        }
    }
}
