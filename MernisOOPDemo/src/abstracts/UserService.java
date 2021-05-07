package abstracts;

import entities.User;

public interface UserService {
	void signupUser(User user);
	void loginUser(User user);
	void updateUser(User user);

}
