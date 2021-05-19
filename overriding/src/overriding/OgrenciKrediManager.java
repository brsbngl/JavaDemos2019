package overriding;

public class OgrenciKrediManager extends BaseKrediManager{ 
	public double hesapla(double tutar) {
		return tutar *1.10;  //DÝÐER MANAGERLARDA TUTAR 1.18 AMA BURADA 1.10 KULLANDIK. BURADA EXTENDS EDÝLEN BASEKREDÝMANAGERÝ EZDÝK(BU EZME DURUMU ÝNHERÝTANCE DURUMDA GEÇERLÝ, YANÝ EXTENDS) VE BURADA KÝ, KURALI BU CLASS ÝÇÝN KULLANDIK. 
                            //BU DURUMA "OVERRÝDÝNG" ADI VERÝLÝR.
}
}
