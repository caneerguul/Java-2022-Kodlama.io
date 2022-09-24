package intro;

public class asalKontrol {//19
    public static void main(String[] args) {
		int number = 3;
        boolean isPrime=true;

        if (number == 1){
            System.out.println("Sayı asal degildir");
            return;
        }
        if (number<1){
            System.out.println("Gecersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime=false;break;
            }
        }
        System.out.println("Bu sayi asal mi = " + isPrime);
    }
}
