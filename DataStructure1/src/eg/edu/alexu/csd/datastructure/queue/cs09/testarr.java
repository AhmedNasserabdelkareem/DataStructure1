package eg.edu.alexu.csd.datastructure.queue.cs09;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Ahmednasser
 *
 */
public class testarr {
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var1 = 1;
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
	private final int var6 = 6;
	/**
	 * @author Ahmednasser
	 *
	 */
	private arrqueue test = new arrqueue(var5);
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test1() {
		for (int i = 0; i < var3; i++) {
			test.enqueue(i);
			int x = test.size();
			assertEquals(x, i + 1);
		}

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test2() {

		assertEquals(test.isEmpty(), true);

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test3() {
		test.enqueue(var1);
		test.enqueue(var2);
		test.enqueue(var3);
		test.enqueue(var4);
		test.enqueue(var5);
		assertEquals(test.size(), var5);

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test4() {
		test.enqueue(var1);
		test.enqueue(var2);
		test.enqueue(var3);
		test.dequeue();
		test.enqueue(var4);
		test.enqueue(var5);
		test.dequeue();
		test.enqueue(var6);
		test.dequeue();
		assertEquals(test.size(), var3);

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test5() {
		try {

		} catch (Exception e) {

		}
	}

}
