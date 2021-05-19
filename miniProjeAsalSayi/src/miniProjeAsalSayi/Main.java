package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;  // % mod operatörüdür. Mod Op.= Kalaný verir
    	System.out.println(remainder); //remainder kalan demek.
		boolean isPrime = true; //prime asal sayý demek.
		
		if(number==1) {
			System.out.println("Sayý Asal Deðildir");
			return;  //return bloðu burada bitirmeye yarýyor. Sen buradan geri dön anlamýný taþýyor.
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayý");
		}
		
		for(int i =2; i<number;i++) {
			if(number %i == 0) {
				isPrime = false;
			}
			
			
		}
		if(isPrime) { //isPrime tek yazmak, isPrime==true ile ayný anlama gelir.
			System.out.println("Sayý Asaldýr.");
			
			
		}else {
			System.out.println("Sayý Asal Deðildir.");
		}

	}

}
