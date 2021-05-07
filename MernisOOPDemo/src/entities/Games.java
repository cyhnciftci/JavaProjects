package entities;

import abstracts.GamesEntity;

public class Games implements GamesEntity {
	private int id;
	private String gameName;
	private double unitPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Games(int id, String gameName, double unitPrice) {
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

}
