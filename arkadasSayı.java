package intro;

public class arkadasSayı {//22
    public static void main(String[] args) {
    	int number1=220;
    	int number2=284;
        boolean arkadasMi = false;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }
        if (total1 == number2 && total2 == number1) {
            arkadasMi = true;
        }
        System.out.println("Bu iki sayi arkadas mi? = " + arkadasMi);
    }

}
