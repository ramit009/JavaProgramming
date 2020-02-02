package programmingKnowldege;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesttwoResults {

	@Test
	public void TesttwoNumbers() {
		TestResults checkNumbers=new TestResults();
		int result=checkNumbers.addTwoNumbers(12, 13);
		assertEquals(21, result);
		
	}

}
