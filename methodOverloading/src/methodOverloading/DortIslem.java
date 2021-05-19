package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {           // ÝKÝSÝNDE DE "int topla" YAZDIK FAKAT HATA ALMADIK. BUNUN SEBEBÝ OVERLOADÝNG. ÝKÝSÝNÝNDE FARKLI ÝMZASI VAR(Topladan sonra gelen parantezin içi ÝMZADIR.)
		return sayi1+sayi2;                           //Dortislem.topla YAZDIÐIN ZAMAN ÝKÝ PARAMETREDE SORUNSUZ OLARAK ÇIKIYOR. VE 2 PARAMETRELÝ OLANI SEÇSEN BÝLE 3 TANE YAZDIÐINDA HATA ALMIYORSUN. 
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}


}
