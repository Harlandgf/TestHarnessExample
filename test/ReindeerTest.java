import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.roq.test_harness_example.driver.ReindeerImpl;
import com.roq.test_harness_example.driver.WorkshopDriver;
import com.roq.test_harness_example.interfaces.Deserving;
import com.roq.test_harness_example.interfaces.Reindeer;
import com.roq.test_harness_example.interfaces.Workshop;
import com.roq.test_harness_example.xmas.Kiddie;

class ReindeerTest {

	@Test
	void test() {
		Reindeer reindeer = new ReindeerImpl();
		Workshop workshop = new WorkshopDriver();
		
		List <Reindeer> reindeerList = new ArrayList<Reindeer>();
		reindeerList.add(reindeer);
		
//		Kiddie kid = new Kiddie("John boy", Deserving.Naughty, true);
//		List<Kiddie> kidList = new ArrayList<Kiddie>();
//		kidList.add(kid);
		
		workshop.feed(reindeerList);
		
		assert(reindeer.getEatenChild().isAlive() == false);
	}

}
