package staticDemo;
//B�R �R�N� KAYDEDERKEN VEYA G�NCELLERKEN, �R�N�N KURALLARA UYGUN OLUP OLMADI�INI BULMAK ���N KULLANIRIZ BU CLASSI.
public class ProductValidator {
	
	static {
		System.out.println("Statik �al��t�.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { //&& "VE" DEMEK. ARICA "isEmpty" DE�ER G�R�LMED� ANLAMINA GEL�R.
			return true;         // YUKARIDA BULUNAN "IF" �N ���NDE YAZAN KODUN ANLAMI =  B�Z�M �R�N�M�Z�N VER�TABANINA KAYIT ED�LEB�LMES� ���N F�YATININ 0'DAN B�Y�K OLMASI VE �SM�N�NDE VER�LM�� OLMASI LAZIM.
			                    // ! ��ARET� "isEmpty" DE��LSE ANLAMINA GEL�R. YAN� ! ��ARET� DE��LSE DEMEKT�R.
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
}
