package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("müşteri veritabanına eklendi");
	}
	
	

}
