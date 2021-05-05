package interfaceAbstractDemo;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
}
