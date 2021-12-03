package com.roq.test_harness_example.xmas;


import com.roq.test_harness_example.interfaces.Deserving;

public class Kiddie {
	private String name;
	private Deserving deserving;
	private boolean alive = true;
	
	public Kiddie(String name, Deserving deserving, boolean alive) {
		this.name = name;
		this.deserving = deserving;
		this.setAlive(alive);
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public boolean isNice() {
		return this.deserving == Deserving.Nice;
	}
	
	public boolean isNaughty() {
		return this.deserving == Deserving.Naughty;
	}
	
	public void isEaten() {
		this.setAlive(false);
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
