package com.codingdojo.web.models;

import java.util.ArrayList;

public class Team {
	private String name;
	public ArrayList<Player> players;
	
	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<Player>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

}
