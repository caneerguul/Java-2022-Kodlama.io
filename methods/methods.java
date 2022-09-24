package ödev2;

public class methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4};
        int aranacak = 6;
        boolean varMi = false;
        for(int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı Mevcut");
        }
        else{
            System.out.println("Sayı mevcut değil");
        }
    }
}
