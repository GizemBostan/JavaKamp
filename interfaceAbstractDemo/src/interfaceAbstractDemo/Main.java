package interfaceAbstractDemo;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"gizem","bostan",new Date(1996,7,7),"1234567"));
	}

}
