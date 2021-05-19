package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { //BURADA OVERRÝDE EDÝLMESÝNÝ ÝSTEMÝYORSAN "DOUBLE'IN ARKASINA "FÝNAL" YAZMAN GEREKÝYOR." BU DURUMDA BURADA YAZAN TUTARI HÝÇBÝR CLASS EZEMEZ.
		return tutar *1.18;
	}
}
