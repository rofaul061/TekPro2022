package com.polban.tekpro.monopoly;

public class GoCell extends Cell {
	private boolean available = true;
	protected Player owner;

	public GoCell() {
		super.setName("Go");
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}
}
