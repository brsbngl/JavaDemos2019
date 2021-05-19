package polymorphismDemo;  // AÞAÐIDA BULUNAN PUBLÝC VOÝD LOG(STRÝNG MESSAGE) VE ALTINDA BULUNAN SYSOUTUN ÝÇERÝKLERE GÖRE DEÐÝÞEN HALLERÝ, DATABASELOGGER, FÝLELOGGER VE EMAÝLLOGGERDA DA VAR. ÝMZALAR AYNI OLDUÐU HALDE ÇALIÞIR.
                          //BU DURUMA "OVERRÝDÝNG" DENÝR.

public class BaseLogger {
	public void Log(String message) { //IMZA KISMI BURASIDIR.
		System.out.println("Default Logger: "+message );
		
	}

}
