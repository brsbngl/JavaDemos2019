package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {           // �K�S�NDE DE "int topla" YAZDIK FAKAT HATA ALMADIK. BUNUN SEBEB� OVERLOAD�NG. �K�S�N�NDE FARKLI �MZASI VAR(Topladan sonra gelen parantezin i�i �MZADIR.)
		return sayi1+sayi2;                           //Dortislem.topla YAZDI�IN ZAMAN �K� PARAMETREDE SORUNSUZ OLARAK �IKIYOR. VE 2 PARAMETREL� OLANI SE�SEN B�LE 3 TANE YAZDI�INDA HATA ALMIYORSUN. 
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}


}
