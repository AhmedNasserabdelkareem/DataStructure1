package eg.edu.alexu.csd.datastructure.calculator.cs09;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

/**
 * @author Ahmednasser
 *
 */
public class Calculator implements ICalculator {

	@Override
	public final int add(final int x, final int y) {
		int z = x + y;
		return z;
	}

	@Override
	public final float divide(final int x, final int y) {

		return (float) x / (float) y;
	}
}
