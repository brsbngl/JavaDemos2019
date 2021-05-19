package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger Logger) {
		this.logger = Logger;
		
	}
	public void Add() {
		System.out.println("Müþteri Eklendi");
		this.logger.Log("Log Mesajý");
	
	}

}
