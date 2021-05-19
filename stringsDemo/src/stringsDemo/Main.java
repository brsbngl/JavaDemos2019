package stringsDemo;

public class Main {

	public static void main(String[] args) { // jAVA DERSÝ 17
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		// lenght eleman sayýsýný gösterir.
		System.out.println("Eleman Sayýsý: " + mesaj.length());
		// String ifadenin 5. karakterini bulmak için charAt kullan.(Ýndex 0 dan
		// alýndýðý için 4 yazdýk.)
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!")); // concat yeni bir string ifade oluþturmak için kullanýlýr.

		System.out.println(mesaj.startsWith("B")); // mesajýn neyle baþladýðýný gösteriyor.

		System.out.println(mesaj.endsWith(".")); // mesajýn neyle bittiðini gösteriyor.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // srcBegin:0 srcEnd:5 dstBegin: 0 dst = destination karakterleri atamaya  kaçtan baþlayacaðýný gösteriyor.
											
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("-----------------------------------------------------");

		// JAVA DERSÝ 18

		String yeniMesaj = mesaj.replace(' ', '-'); // Ýlk '' old char. Ýkinci '' new char
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// Subsstringin görevi bir metnin içerisinden parça almaktýr.

		for (String kelime : mesaj.split(" ")) { // Split fonksiyonu bir metni belli bir karakter veya karakter dizisini
													// dikkate alarak parçalamaya yarar.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // toLowerCase bütün harfleri küçültür.
		System.out.println(mesaj.toUpperCase()); // toUpperCase bütün harfleri büyültür.
		System.out.println(mesaj.trim()); // trim mesajýn içeriðinde boþluklar varsa onlarý silmeye yarýyor.
	}

}
