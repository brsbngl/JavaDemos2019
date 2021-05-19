package interfaces;
// Dal = data access layer
public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void Add() {
		System.out.println("My sql eklendi.");
		
	}

}
