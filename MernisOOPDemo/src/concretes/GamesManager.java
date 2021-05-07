package concretes;

import abstracts.GamesServices;
import entities.Games;

public class GamesManager implements GamesServices {

	@Override
	public void addGame(Games games) {
		// TODO Auto-generated method stub
		System.out.println("Oyun eklendi : " + games.getGameName());
		
	}

	@Override
	public void deleteGame(Games games) {
		// TODO Auto-generated method stub
		System.out.println("Oyun silindi : " + games.getGameName());
		
	}

}
