package concretes;

import abstracts.CustomerCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService {
	private CustomerCheckService ccs;
	

	public UserManager(CustomerCheckService ccs) {
		super();
		this.ccs = ccs;
	}

	@Override
	public void signupUser(User user) {
		// TODO Auto-generated method stub
		if(ccs.checkRealPerson(user)) {
			System.out.println("Kullanýcý kayýt oldu: " + user.getFirstName());
		}else {
			System.out.println("geçersiz kullanýcý");
		}
		
	}

	@Override
	public void loginUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý giriþ yaptý:" + user.getFirstName());
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý bilgileri güncellendi:" + user.getFirstName());
		
	}

}
