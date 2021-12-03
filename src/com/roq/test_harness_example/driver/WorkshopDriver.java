package com.roq.test_harness_example.driver;

import java.util.ArrayList;
import java.util.List;

import com.roq.test_harness_example.interfaces.Deserving;
import com.roq.test_harness_example.interfaces.Reindeer;
import com.roq.test_harness_example.interfaces.Workshop;
import com.roq.test_harness_example.xmas.Kiddie;
import com.roq.test_harness_example.xmas.Krampus;


public class WorkshopDriver implements Workshop {
	
	public Krampus conjure(List<Kiddie> kid) {
		return null;
	}
	
	public void feed(List<Reindeer> reindeer) {		
		List<Kiddie> mockChildren = new ArrayList<Kiddie>();
		mockChildren.add(new Kiddie("Adam Driver", Deserving.Naughty, true));
		reindeer.get(0).feed(new Krampus(mockChildren));
	}
}
