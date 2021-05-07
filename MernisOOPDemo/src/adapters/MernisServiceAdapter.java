package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkRealPerson(User user) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = true;
		try{
			result=kpsPublic.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalityId()),
					user.getFirstName(),
					user.getLastName(),
                    user.getBirthDate().getYear());
			
		}
		catch(RemoteException e) {
			e.printStackTrace();
			
		}
		if(result) {
			return true;
		}
		else {
			return false;
		}
	}

}
