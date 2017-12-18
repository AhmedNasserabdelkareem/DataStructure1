package eg.edu.alexu.csd.datastructure.calculator.cs09;

import static org.junit.Assert.*;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

/**
 * @author Ahmednasser
 *
 */
public class Tester {
/**
 * @author Ahmednasser
 *
 */
private Calculator TestRunner;
/**
 * @author Ahmednasser
 *
 */
private final int var2 = 2;
/**
 * @author Ahmednasser
 *
 */
private final int var3 = 3;
/**
 * @author Ahmednasser
 *
 */
private final int var4 = 4;
/**
 * @author Ahmednasser
 *
 */
private final int var5 = 5;
/**
 * @author Ahmednasser
 *
 */
private final int var7 = 7;
/**
 * @author Ahmednasser
 *
 */
private final int var1000 = 1000;
/**
 * @author Ahmednasser
 *
 */
private final double varten1 = 0.0000001;
/**
 * @author Ahmednasser
 *
 */
private final double varten75 = 0.75;
/**
 * @author Ahmednasser
 *
 */
private final double varten25 = 2.5;
/**
 * @author Ahmednasser
 *
 */
@org.junit.Test
	public void testAdd() {
		ICalculator instance = (ICalculator) TestRunner;
		try {
			int result = instance.add(var3, var4);
	assertEquals("Addition doesn't work '3+4'", var7, result);
		} catch (Throwable e) {
		}
	}
/**
 * @author Ahmednasser
 *
 */
@org.junit.Test(timeout = var1000)
	public void testDivide() {
		ICalculator instance = (ICalculator) TestRunner;
		try {
			float result = instance.divide(var3, var4);
	assertEquals("Division doesn't work '3/4'", varten75, result, varten1);
		} catch (Throwable e) {
		}
		try {
			float result = instance.divide(var5, var2);
	assertEquals("Division doesn't work '5/2'", varten25, result, varten1);
		} catch (Throwable e) {
		}
	}

}
