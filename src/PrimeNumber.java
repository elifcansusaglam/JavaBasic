public class PrimeNumber {
    public static void main(String[] args) {
       // 1 - 100 arasındaki asal sayıları ekrana yazdıran program
        for(int i=100;i>1;i--){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    //System.out.println(i);
                    break;
                }else {
                    System.out.println(i+"is a prime number");
                    break;
                }
            }
        }
    }
}
