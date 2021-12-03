package com.roq.test_harness_example.driver;

import com.roq.test_harness_example.interfaces.Reindeer;
import com.roq.test_harness_example.xmas.Kiddie;
import com.roq.test_harness_example.xmas.Krampus;

public class ReindeerImpl implements Reindeer {
	private Kiddie kidEaten;
	
	public void feed(Krampus krampus) {
		kidEaten = krampus.getTheNextNaughtyKid();	
		kidEaten.isEaten();
	}
	
	public Kiddie getEatenChild() {
		return this.kidEaten;
	}
}
