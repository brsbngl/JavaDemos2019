package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B'; // charlarda tek t�rmak ve tek karakter kullan�lmal�d�r.

		switch (grade) {
		case 'A':
			// case durum demektir.
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok G�zel : Ge�tininiz");
			break;
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kald�n�z.");
			break;
		default: // switch keyslerde yap�lmas� gereken yukar�da ki notlar d���nda,
					// ba�ka bir not girildi�inde ne yazs�n� se�ti�imiz yerdir.
			System.out.println("Ge�ersiz not girdiniz.");

			// case 'B' :
			// case 'C' :
			// System.out.println("�yi : Ge�tiniz"); // B ve c notlar� i�in ayn� yaz�y�
			// g�stermek istiyorsak b�yle kullanmak gerekiyor.

		}
	}

}
