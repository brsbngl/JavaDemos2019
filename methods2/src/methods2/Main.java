package methods2;

public class Main { // java dersi 25

	public static void main(String[] args) { // operasyon, method, fonksiyon ayn� �eylerdir.    //args arg�manstan geliyor.
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = sehirVer(); // substring bir �ey olu�turur ve sonu� olarak onu verir ama void sonu� olarak
										// herhangi bir �ey vermez. Yani substring bir de�er return ediyor.
		System.out.println(yeniMesaj);

		int sayi = topla(5,7,6,8);
		System.out.println(sayi);

		System.out.println(yeniMesaj);
		

	}

	public static void ekle() { // void yap anlam�na gelir.
		System.out.println("Eklendi.");

	}

	public static void sil() {
		System.out.println("Silindi.");

	}

	public static void g�ncelle() {
		System.out.println("G�ncellendi.");

	}

	public static int topla(int sayi1, int sayi2,int sayi3,int sayi4) {
		return sayi1 + sayi2 +sayi3 + sayi4;
	}
	public static int topla2(int[]sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi; 
			
			
		}
		return toplam;
	}


	public static String sehirVer() {
		return "Ankara";

	}

}
