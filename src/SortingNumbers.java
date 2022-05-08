import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SortingNumbers {
    //Girilen 3 sayıyı "küçükten büyüğe" sıralayan program
    public static void main(String[] args) {
        int numberOne,numberTwo,numberThree;
        Scanner input =new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz : ");
        numberOne=input.nextInt();
        System.out.print("Lütfen sayı giriniz : ");
        numberTwo=input.nextInt();
        System.out.print("Lütfen sayı giriniz : ");
        numberThree=input.nextInt();

        if(numberOne<numberTwo && numberOne<numberThree ){
            if(numberTwo<numberThree){
                System.out.println(numberOne+"<"+numberTwo+"<"+numberThree);
            }else{
                System.out.println(numberOne+"<"+numberThree+"<"+numberTwo);
            }
        }else if(numberTwo<numberOne && numberTwo<numberThree ){
            if(numberOne<numberThree){
                System.out.println(numberTwo+"<"+numberOne+"<"+numberThree);
            }else{
                System.out.println(numberTwo+"<"+numberThree+"<"+numberOne);
            }
        } else{
            if(numberOne<numberTwo){
                System.out.println(numberThree+"<"+numberOne+"<"+numberTwo);
            }else{
                System.out.println(numberThree+"<"+numberTwo+"<"+numberThree);
            }
        }
    }



}
