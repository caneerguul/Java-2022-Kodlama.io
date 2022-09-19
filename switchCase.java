package intro;

public class switchCase {//10
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A': System.out.println("Perfect Note is A");break;
            case 'B': System.out.println("Not Bad Note is B");break;
            case 'C': System.out.println("Note is C");break;
            case 'D': System.out.println("Note is D");break;
            case 'F': System.out.println("Note is F, not good ! Please Work Hard !");break;
            default : System.out.println("gecersiz not girdiniz");
        }
    }

}
