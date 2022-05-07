import java.util.Scanner;

public class PassingClass {
     public static void main(String[] args) {


         //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
         //Geçme Notu : 55
         //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

         int math, physics, turkish, chemistry, music,count=0;
         Scanner input = new Scanner(System.in);

         System.out.print("Matematik notunuzu giriniz : ");
         math = input.nextInt();
         if(math<0 || math>100){
             math=0;
         }else{
             count+=1;
         }
         System.out.print("Fizik notunuzu giriniz : ");
         physics = input.nextInt();
         if(physics<0 || math>100){
             physics=0;
         }else{
             count+=1;
         }
         System.out.print("Türkçe notunuzu giriniz : ");
         turkish = input.nextInt();
         if(turkish<0 || turkish>100){
             turkish=0;
         }else{
             count+=1;
         }
         System.out.print("Kimya notunuzu giriniz : ");
         chemistry = input.nextInt();
         if(chemistry<0 || chemistry>100){
             chemistry=0;
         }else{
             count+=1;
         }
         System.out.print("Müzik notunuzu giriniz : ");
         music = input.nextInt();
         if(music<0 || music>100){
             music=0;
         }else{
             count+=1;
         }
         float average = (math+physics+turkish+chemistry+music)/count;

         if(average>=55){
             System.out.println("Ortalamanız : "+average+" Tebrikler sınıfı geçtiniz !");
         }else
             System.out.println("Ortalamanız : "+average+" Sınıfta kaldınız");
     }
}
