package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;  // % mod operat�r�d�r. Mod Op.= Kalan� verir
    	System.out.println(remainder); //remainder kalan demek.
		boolean isPrime = true; //prime asal say� demek.
		
		if(number==1) {
			System.out.println("Say� Asal De�ildir");
			return;  //return blo�u burada bitirmeye yar�yor. Sen buradan geri d�n anlam�n� ta��yor.
		}
		
		if(number<1) {
			System.out.println("Ge�ersiz Say�");
		}
		
		for(int i =2; i<number;i++) {
			if(number %i == 0) {
				isPrime = false;
			}
			
			
		}
		if(isPrime) { //isPrime tek yazmak, isPrime==true ile ayn� anlama gelir.
			System.out.println("Say� Asald�r.");
			
			
		}else {
			System.out.println("Say� Asal De�ildir.");
		}

	}

}
