package mukemmelSayi;

public class Main {   //Java Dersi 21

	public static void main(String[] args) {
		//6 ==>1, 2 ve 3'e bölünür. Ve toplamlarý ayný sayýya eþit olan sayýlara mükemmel sayý denir.
		//28 ==> 1, 2, 3, 4, 7 ve 14'e bölünür. Ve toplamlarý ayný sayýya eþit olan sayýlara mükemmel sayý denir.
		int number = 6;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total = total +i;
				
				
			}
			
		}
				
		if(total == number) {
			System.out.println("Mükemmel Sayýdýr.");
		}else
			System.out.println("Mükemmel Sayý Deðildir.");
		 
		
	
		

	}

}
