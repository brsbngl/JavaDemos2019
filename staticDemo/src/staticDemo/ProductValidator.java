package staticDemo;
//BÝR ÜRÜNÜ KAYDEDERKEN VEYA GÜNCELLERKEN, ÜRÜNÜN KURALLARA UYGUN OLUP OLMADIÐINI BULMAK ÝÇÝN KULLANIRIZ BU CLASSI.
public class ProductValidator {
	
	static {
		System.out.println("Statik Çalýþtý.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { //&& "VE" DEMEK. ARICA "isEmpty" DEÐER GÝRÝLMEDÝ ANLAMINA GELÝR.
			return true;         // YUKARIDA BULUNAN "IF" ÝN ÝÇÝNDE YAZAN KODUN ANLAMI =  BÝZÝM ÜRÜNÜMÜZÜN VERÝTABANINA KAYIT EDÝLEBÝLMESÝ ÝÇÝN FÝYATININ 0'DAN BÜYÜK OLMASI VE ÝSMÝNÝNDE VERÝLMÝÞ OLMASI LAZIM.
			                    // ! ÝÞARETÝ "isEmpty" DEÐÝLSE ANLAMINA GELÝR. YANÝ ! ÝÞARETÝ DEÐÝLSE DEMEKTÝR.
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
}
