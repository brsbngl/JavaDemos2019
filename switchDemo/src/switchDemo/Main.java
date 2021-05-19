package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B'; // charlarda tek týrmak ve tek karakter kullanýlmalýdýr.

		switch (grade) {
		case 'A':
			// case durum demektir.
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtininiz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldýnýz.");
			break;
		default: // switch keyslerde yapýlmasý gereken yukarýda ki notlar dýþýnda,
					// baþka bir not girildiðinde ne yazsýný seçtiðimiz yerdir.
			System.out.println("Geçersiz not girdiniz.");

			// case 'B' :
			// case 'C' :
			// System.out.println("Ýyi : Geçtiniz"); // B ve c notlarý için ayný yazýyý
			// göstermek istiyorsak böyle kullanmak gerekiyor.

		}
	}

}
