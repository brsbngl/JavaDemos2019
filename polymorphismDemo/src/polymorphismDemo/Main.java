package polymorphismDemo;  //POLIMORPHISM, �NHERITANNCE �LE KULLANILAB�L�R. YAN� �RNEK OLARAKK EMA�L LOGGER VE F�LE LOGGER ARASINDA �NHER�TANCE BA�LANTISI OLURSA POLIMORPHISM OLAB�L�R.


public class Main {

	public static void main(String[] args) {
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		//for (BaseLogger logger:loggers) {
			//logger.Log("Log Mesaj�");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		}
	
	
	}



