package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger Logger) {
		this.logger = Logger;
		
	}
	public void Add() {
		System.out.println("M��teri Eklendi");
		this.logger.Log("Log Mesaj�");
	
	}

}
