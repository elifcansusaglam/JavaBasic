import java.util.Scanner;
public class StarRanking {
    public static void main(String[] args) {
        //Yıldızlar ile elmas yapan program

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number =input.nextInt();

        for(int i=0; i<number;i++){
            for(int j=1; j<(number-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=number; i>0;i--){
            for (int j=0; j<(number-i);j++){
                System.out.print(" ");
            }
            for (int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
