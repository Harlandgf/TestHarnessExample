package com.roq.test_harness_example.interfaces;

import java.util.List;

import com.roq.test_harness_example.xmas.Kiddie;
import com.roq.test_harness_example.xmas.Krampus;

public interface Workshop {
	
	public Krampus conjure(List<Kiddie> kid);
	
	public void feed(List<Reindeer> reindeer);
}
