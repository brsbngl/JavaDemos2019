package mukemmelSayi;

public class Main {   //Java Dersi 21

	public static void main(String[] args) {
		//6 ==>1, 2 ve 3'e b�l�n�r. Ve toplamlar� ayn� say�ya e�it olan say�lara m�kemmel say� denir.
		//28 ==> 1, 2, 3, 4, 7 ve 14'e b�l�n�r. Ve toplamlar� ayn� say�ya e�it olan say�lara m�kemmel say� denir.
		int number = 6;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total = total +i;
				
				
			}
			
		}
				
		if(total == number) {
			System.out.println("M�kemmel Say�d�r.");
		}else
			System.out.println("M�kemmel Say� De�ildir.");
		 
		
	
		

	}

}
