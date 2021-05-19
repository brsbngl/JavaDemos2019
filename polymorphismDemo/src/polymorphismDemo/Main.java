package polymorphismDemo;  //POLIMORPHISM, ÝNHERITANNCE ÝLE KULLANILABÝLÝR. YANÝ ÖRNEK OLARAKK EMAÝL LOGGER VE FÝLE LOGGER ARASINDA ÝNHERÝTANCE BAÐLANTISI OLURSA POLIMORPHISM OLABÝLÝR.


public class Main {

	public static void main(String[] args) {
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		//for (BaseLogger logger:loggers) {
			//logger.Log("Log Mesajý");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		}
	
	
	}



