package polymorphismDemo;  // A�A�IDA BULUNAN PUBL�C VO�D LOG(STR�NG MESSAGE) VE ALTINDA BULUNAN SYSOUTUN ��ER�KLERE G�RE DE���EN HALLER�, DATABASELOGGER, F�LELOGGER VE EMA�LLOGGERDA DA VAR. �MZALAR AYNI OLDU�U HALDE �ALI�IR.
                          //BU DURUMA "OVERR�D�NG" DEN�R.

public class BaseLogger {
	public void Log(String message) { //IMZA KISMI BURASIDIR.
		System.out.println("Default Logger: "+message );
		
	}

}
