package intro;

public class Main {// Day 1

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println("ortaMetin");
		
		int vade = 12;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = true; //false
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun)
		{
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun)
		{
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else 
		{
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
