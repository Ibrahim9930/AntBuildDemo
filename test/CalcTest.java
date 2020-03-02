
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CalcTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAdd_twoPoisitveInputs_positiveOutput() {
		int a = 5;
		int b = 6;
		Calc c= new Calc();
		int d = c.addNums(a,b);
		Assert.assertTrue(d==12);
	}

}
