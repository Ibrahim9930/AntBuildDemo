


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CalcTest {

	
	@Test
	public void testAdd_twoPoisitveInputs_positiveOutput() {
		int a = 5;
		int b = 6;
		Calc c= new Calc();
		int d = c.addNums(a,b);
		Assert.assertTrue(d==12);
	}

}
