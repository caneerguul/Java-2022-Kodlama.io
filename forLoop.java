package intro;

public class forLoop {//11
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("loop is finished");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("loop is finished");
    }
}
