package classes;

public class Main {   //Java dersi 28.  //classlar gruplama yaparlar.  //classlar referans tiptir.  //Classlar�n bir amac�da ortak operasyonlar� tutmakt�r.( D�rt i�lem yani.) //Classlar �zellik tutarlar. Field yada Attribute olarak isimlendirilirler.

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(); //CustomerManager s�n�f�n ismi. Bu s�n�fa customerManager diye takma isim veriyorum. Takma isim camel casing olmal�.
		customerManager.Add();                                     
		customerManager.Remove();                                  
		customerManager.Update();
		
		//value type   //De�er tip stackte tan�mlan�r. Yani sadece stack kullan�ld�. Heapte bir de�er yans�mad�.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};   //Diziler referans tiptir. Yani  sayi1'i stackte olu�turdu. Kar��l��� heapte olu�turdu.(1,2,3 heapte olu�tu yani.)
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
				
	}
 
}  
	

