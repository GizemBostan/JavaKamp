package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			save(customer);
		}
		else {
			System.out.println("kiþi gecerli deðil");

		}
		
		
		
		
	}
}
