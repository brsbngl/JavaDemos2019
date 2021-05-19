package stringsDemo;

public class Main {

	public static void main(String[] args) { // jAVA DERS� 17
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		// lenght eleman say�s�n� g�sterir.
		System.out.println("Eleman Say�s�: " + mesaj.length());
		// String ifadenin 5. karakterini bulmak i�in charAt kullan.(�ndex 0 dan
		// al�nd��� i�in 4 yazd�k.)
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!")); // concat yeni bir string ifade olu�turmak i�in kullan�l�r.

		System.out.println(mesaj.startsWith("B")); // mesaj�n neyle ba�lad���n� g�steriyor.

		System.out.println(mesaj.endsWith(".")); // mesaj�n neyle bitti�ini g�steriyor.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // srcBegin:0 srcEnd:5 dstBegin: 0 dst = destination karakterleri atamaya  ka�tan ba�layaca��n� g�steriyor.
											
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("-----------------------------------------------------");

		// JAVA DERS� 18

		String yeniMesaj = mesaj.replace(' ', '-'); // �lk '' old char. �kinci '' new char
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// Subsstringin g�revi bir metnin i�erisinden par�a almakt�r.

		for (String kelime : mesaj.split(" ")) { // Split fonksiyonu bir metni belli bir karakter veya karakter dizisini
													// dikkate alarak par�alamaya yarar.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // toLowerCase b�t�n harfleri k���lt�r.
		System.out.println(mesaj.toUpperCase()); // toUpperCase b�t�n harfleri b�y�lt�r.
		System.out.println(mesaj.trim()); // trim mesaj�n i�eri�inde bo�luklar varsa onlar� silmeye yar�yor.
	}

}
