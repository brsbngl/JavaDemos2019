package loopDemo;

public class Main {

	public static void main(String[] args) {
for(int i = 1;i<=10;i++) { 
			
			//i++ ile i=i+1 ayn� �ey demektir yani i yi bir artt�r demektir.   // i+=2 i'yi iki iki artt�r demektir.
			
			//int i =1; saya� olarak ge�er. Yani saya� 1den ba�l�yor.  //int i =2; saya� olarak ge�er. Yani saya� 2den ba�l�yor.
			
			//i<10 �art k�sm�. i 10dan k���k oldu�u s�rece demektir.
			
			//i++ sayac�n ka�ar ka�ar artaca��n� verdi�in yerdir.
			
			System.out.println(i);
			
		}
		System.out.println(" For D�ng�s� Bitti");
		
		
		
		//while
		int  i = 1;
		while(i<10) { //whileda int �art�n i�ine yaz�lmaz.
			
			System.out.println(i);
			i+=2; // Ka�ar ka�ar artaca��n� belirtmezsen "infinite loopa"girer sistem ve sonsuz d�ng� halinde d�ner.
		}
		System.out.println(" While D�ng�s� Bitti");
		
		
		//do-While
		int j=1;
		do {
			System.out.println(j);
			j+=1;
			
		}while(j<10);
		System.out.println(" Do While D�ng�s� Bitti");

	}

}
