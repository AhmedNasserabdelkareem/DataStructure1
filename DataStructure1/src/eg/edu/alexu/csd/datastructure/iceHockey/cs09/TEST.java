package eg.edu.alexu.csd.datastructure.iceHockey.cs09;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

/**
 * @author Ahmednasser
 *
 */
public class TEST {
/**.
 * @author Ahmednasser
 *
 */
private IceHockey test = new IceHockey();
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
private final int var7 = 7;
/**
 * @author Ahmednasser
 *
 */
private final int var8 = 8;
/**
 * @author Ahmednasser
 *
 */
private final int var9 = 9;
/**
 * @author Ahmednasser
 *
 */
private final int var10 = 10;
/**
 * @author Ahmednasser
 *
 */
private final int var11 = 11;
/**
 * @author Ahmednasser
 *
 */
private final int var12 = 12;
/**
 * @author Ahmednasser
 *
 */
private final int var13 = 13;
/**
 * @author Ahmednasser
 *
 */
private final int var14 = 14;
/**
 * @author Ahmednasser
 *
 */
private final int var15 = 15;
/**
 * @author Ahmednasser
 *
 */
private final int var16 = 16;
/**
 * @author Ahmednasser
 *
 */
private final int var17 = 17;
/**
 * @author Ahmednasser
 *
 */
private final int var18 = 18;
/**
 * @author Ahmednasser
 *
 */
private final int var19 = 19;
/**
 * @author Ahmednasser
 *
 */
private final int var20 = 20;
/**
 * @author Ahmednasser
 *
 */
private final int var21 = 21;
/**
 * @author Ahmednasser
 *
 */
private final int var22 = 22;
/**
 * @author Ahmednasser
 *
 */
private final int var23 = 23;
/**
 * @author Ahmednasser
 *
 */
private final int var24 = 24;
/**
 * @author Ahmednasser
 *
 */
private final int var25 = 25;
/**
 * @author Ahmednasser
 *
 */
private final int var26 = 26;
/**
 * @author Ahmednasser
 *
 */
private final int var27 = 27;
/**
 * @author Ahmednasser
 *
 */
private final int var28 = 28;
/**
 * @author Ahmednasser
 *
 */
private final int var29 = 29;
/**
 * @author Ahmednasser
 *
 */
private final int var30 = 30;

@Test
public void test1() {

String[]ex = {"33JUBU33", "3U3O4433", "O33P44NB", "PO3NSDP3", "VNDSD333", "OINFD33X"};
		Point[] answer = new Point[var3];
		answer[0] = new Point(var4, var5);
		answer[var1] = new Point(var13, var9);
		answer[var2] = new Point(var14, var2);
		Point[] expect = test.findPlayers(ex, var3, var16);
		for (int i = 0; i < var3; i++) {
			assertEquals(answer[i], expect[i]);
		}

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test2() {

		IceHockey tester = new IceHockey();
String[] ex = {"44444H44S4", "K444K4L444", "4LJ44T44XH", "444O4VIF44", "44C4D4U444", "4V4Y4KB4M4",
"G4W4HP4O4W", "4444ZDQ4S4", "4BR4Y4A444", "4G4V4T4444" };
		Point[] answer = new Point[var6];
		answer[0] = new Point(var3, var8);
		answer[var1] = new Point(var4, var16);
		answer[var2] = new Point(var5, var4);
		answer[var3] = new Point(var16, var3);
		answer[var4] = new Point(var16, var17);
		answer[var5] = new Point(var17, var9);

		Point[] expect = tester.findPlayers(ex, var4, var16);

		for (int i = 0; i < var6; i++) {
			assertEquals(answer[i], expect[i]);
		}

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test3() {

		IceHockey tester = new IceHockey();
String[] ex = {"8D88888J8L8E888", "88NKMG8N8E8JI88", "888NS8EU88HN8EO", "LUQ888A8TH8OIH8", "888QJ88R8SG88TY",
"88ZQV88B88OUZ8O", "FQ88WF8Q8GG88B8","8S888HGSB8FT8S8","8MX88D88888T8K8", "8S8A88MGVDG8XK8",
"M88S8B8I8M88J8N", "8W88X88ZT8KA8I8", "88SQGB8I8J88W88", "U88H8NI8CZB88B8", "8PK8H8T8888TQR8" };

		Point[] answer = {new Point(var1, var17), new Point(var3, var3), new Point(var3, var10), new Point(var3, var25), new Point(var5, var21),
				new Point(var8, var17), new Point(var9, var2), new Point(var10, var9), new Point(var12, var23), new Point(var17, var16),
				new Point(var18, var3), new Point(var18, var11), new Point(var18, var28), new Point(var22, var20), new Point(var23, var26),
				new Point(var24, var15), new Point(var27, var2), new Point(var28, var26), new Point(var29, var16) };

		Point[] expect = tester.findPlayers(ex, var8, var9);

		for (int i = 0; i < var19; i++) {
			assertEquals(answer[i], expect[i]);
		}

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test4() {

		IceHockey tester = new IceHockey();
		String[] ex = {"11111", "1AAA1", "1A1A1", "1AAA1", "11111" };
		Point[] answer = new Point[2];
		answer[0] = new Point(var5, var5);
		answer[var1] = new Point(var5, var5);

		Point[] expect = tester.findPlayers(ex, 1, var3);

		for (int i = 0; i < 2; i++) {
			assertEquals(answer[i], expect[i]);
		}

	}
	/**
	 * @author Ahmednasser
	 *
	 */
	@Test
	public void test5() {

		IceHockey tester = new IceHockey();
		String[] ex = {"0000", "0000", "0000", "0000" };
		Point[] answer = new Point[1];
		answer[0] = new Point(var4, var4);

		Point[] expect = tester.findPlayers(ex, 0, var16);

		for (int i = 0; i < 1; i++) {
			assertEquals(answer[i], expect[i]);
		}
	}
}
