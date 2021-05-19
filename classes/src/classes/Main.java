package classes;

public class Main {   //Java dersi 28.  //classlar gruplama yaparlar.  //classlar referans tiptir.  //Classlarýn bir amacýda ortak operasyonlarý tutmaktýr.( Dört iþlem yani.) //Classlar özellik tutarlar. Field yada Attribute olarak isimlendirilirler.

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(); //CustomerManager sýnýfýn ismi. Bu sýnýfa customerManager diye takma isim veriyorum. Takma isim camel casing olmalý.
		customerManager.Add();                                     
		customerManager.Remove();                                  
		customerManager.Update();
		
		//value type   //Deðer tip stackte tanýmlanýr. Yani sadece stack kullanýldý. Heapte bir deðer yansýmadý.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};   //Diziler referans tiptir. Yani  sayi1'i stackte oluþturdu. Karþýlýðý heapte oluþturdu.(1,2,3 heapte oluþtu yani.)
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
				
	}
 
}  
	

