import java.util.Scanner;
public class PlaneTicketPrice {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın.
        // İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasındaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        Scanner sc = new Scanner(System.in);
        double distance,total,price=0.10 ,newTotal;
        int age,travelType;

        System.out.print("Gideceğiniz mesafe(km) : ");
        distance=sc.nextDouble();
        if(distance<0) {
            System.out.print("Hatalı Veri Girdiniz! Lütfen pozitif sayı giriniz : ");
            distance=sc.nextDouble();
        }
        System.out.print("Yaşınız : ");
        age=sc.nextInt();
        if(age<0) {
            System.out.print("Hatalı Veri Girdiniz! Lütfen pozitif sayı giriniz : ");
            age=sc.nextInt();
        }
        System.out.print("Yolculuğunuz tek yön ise '1', Gidiş-Dönüş ise '2' yazınız : ");
        travelType=sc.nextInt();
        if(travelType!=1 && travelType!=2) {
            System.out.print("Hatalı Veri Girdiniz! Lütfen 1 ve ya 2 giriniz : ");
            travelType=sc.nextInt();
        }
        total=distance*price;
        System.out.println("Toplam Bilet Fiyatı : "+ total +"TL");
        newTotal=total;
        if (travelType==2){
            newTotal=total * 0.8;
            total=newTotal;
        }
        if(age<12){
            newTotal=total*0.5;
        } else if (age<25) {
            newTotal=total*0.9;
        }
        else if(age>65){
            newTotal=total*0.7;
        }
        System.out.println("İndirimli Bilet Fiyatı : "+newTotal+"TL");
    }
}

