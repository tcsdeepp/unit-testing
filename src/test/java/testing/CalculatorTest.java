package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
//A - Arrange - arrange before you act
//A - Act , A- Assert
	Calculator calculator;//share the reference. //sharing same object with multiple classes.We are not isolating.
	@BeforeEach
	void init() {
		calculator = new Calculator();//but create the different object.
		System.out.println("init");
	}
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		//Calculator calculator = new Calculator();//arrange
		int result = calculator.add(1,3);//act
		assertEquals(4,result);//assert//customized the failed message "Test failed"
	}
	@Test
	void testAddFloat() {
		//Calculator calculator = new Calculator();
		float result = calculator.add(3.4F,1F);
		assertEquals(4.4,result,0.0000009536732);//delta
	}

	@Test
	void testNegativeInteger() {
		//Calculator calculator = new Calculator();
		int result = calculator.negativeInteger(-4,-3);
		assertEquals(-1,result);
	}
	@Test
	void divide() {
		//Calculator calculator = new Calculator();
		float result = calculator.divide(12, 4);
		assertEquals(3,result);
	}
	@Test
	void testWhenDenominatorIsZero() {
		//Calculator calculator = new Calculator();
		try {
			calculator.divide(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
		}
	
	}
}
