package overriding;

public class OgrenciKrediManager extends BaseKrediManager{ 
	public double hesapla(double tutar) {
		return tutar *1.10;  //D��ER MANAGERLARDA TUTAR 1.18 AMA BURADA 1.10 KULLANDIK. BURADA EXTENDS ED�LEN BASEKRED�MANAGER� EZD�K(BU EZME DURUMU �NHER�TANCE DURUMDA GE�ERL�, YAN� EXTENDS) VE BURADA K�, KURALI BU CLASS ���N KULLANDIK. 
                            //BU DURUMA "OVERR�D�NG" ADI VER�L�R.
}
}
