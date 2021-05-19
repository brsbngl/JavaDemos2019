package interfaces;

//но KODLARI YAZILIR BU ALANA.
public class CustomerManager {

	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.Add();

	}

}
