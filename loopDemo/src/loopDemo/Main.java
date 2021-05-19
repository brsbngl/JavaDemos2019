package loopDemo;

public class Main {

	public static void main(String[] args) {
for(int i = 1;i<=10;i++) { 
			
			//i++ ile i=i+1 ayný þey demektir yani i yi bir arttýr demektir.   // i+=2 i'yi iki iki arttýr demektir.
			
			//int i =1; sayaç olarak geçer. Yani sayaç 1den baþlýyor.  //int i =2; sayaç olarak geçer. Yani sayaç 2den baþlýyor.
			
			//i<10 þart kýsmý. i 10dan küçük olduðu sürece demektir.
			
			//i++ sayacýn kaçar kaçar artacaðýný verdiðin yerdir.
			
			System.out.println(i);
			
		}
		System.out.println(" For Döngüsü Bitti");
		
		
		
		//while
		int  i = 1;
		while(i<10) { //whileda int þartýn içine yazýlmaz.
			
			System.out.println(i);
			i+=2; // Kaçar kaçar artacaðýný belirtmezsen "infinite loopa"girer sistem ve sonsuz döngü halinde döner.
		}
		System.out.println(" While Döngüsü Bitti");
		
		
		//do-While
		int j=1;
		do {
			System.out.println(j);
			j+=1;
			
		}while(j<10);
		System.out.println(" Do While Döngüsü Bitti");

	}

}
