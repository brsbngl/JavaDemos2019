package methods2;

public class Main { // java dersi 25

	public static void main(String[] args) { // operasyon, method, fonksiyon ayný þeylerdir.    //args argümanstan geliyor.
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer(); // substring bir þey oluþturur ve sonuç olarak onu verir ama void sonuç olarak
										// herhangi bir þey vermez. Yani substring bir deðer return ediyor.
		System.out.println(yeniMesaj);

		int sayi = topla(5,7,6,8);
		System.out.println(sayi);

		System.out.println(yeniMesaj);
		

	}

	public static void ekle() { // void yap anlamýna gelir.
		System.out.println("Eklendi.");

	}

	public static void sil() {
		System.out.println("Silindi.");

	}

	public static void güncelle() {
		System.out.println("Güncellendi.");

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
