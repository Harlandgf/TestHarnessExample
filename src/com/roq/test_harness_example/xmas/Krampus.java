package com.roq.test_harness_example.xmas;

import java.util.List;


public class Krampus {
	private List<Kiddie> kid;
	
	public Krampus(List<Kiddie> kid) {
		this.kid = kid;
	}
	
	public Kiddie getTheNextNaughtyKid() {		
		Kiddie naughtyChild = null;
		
		while ((this.kid.size() > 0) && (naughtyChild == null)) {	
			Kiddie nextChild = this.kid.remove(0);
			
			if (nextChild.isNaughty()) {
				// Check it twice!
				if (nextChild.isNaughty()) {
					naughtyChild = nextChild;
				}
			}
		}
		
		return naughtyChild;
	}
}

