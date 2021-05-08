import java.time.LocalDate;

import abstracts.UserService;
import adapters.MernisServiceAdapter;
import concretes.SaleManager;
import concretes.UserManager;
import entities.Campaign;
import entities.Games;
import entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User user1 = new User(1, "Sefer Ceyhun", "Çiftçi", LocalDate.of(1999, 11, 9), "987654321");
		
		UserService userService = new UserManager(new MernisServiceAdapter());
		userService.signupUser(user1);
		
		
		
		Games game1 = new Games(1, "Skyrim", 150);
		Games game2 = new Games(2, " MGS5 ", 30);
		
		Campaign campaign1 = new Campaign(1, "Kiş indirimleri", 0.3);
		
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellGame(user1, campaign1, game2);

	}

}
