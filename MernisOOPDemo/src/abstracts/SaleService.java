package abstracts;

import entities.Campaign;
import entities.Games;
import entities.User;

public interface SaleService {
	void sellGame(User user, Campaign campaign, Games games);

}
