package eg.edu.alexu.csd.datastructure.stack.cs09;

import java.util.Scanner;

/**.
 * @author Ahmednasser
 *
 */
public class header {
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
	/**.
	 * @author Ahmednasser
	 *
	 */
	private boolean gets = true;
	/**.
	 * @author Ahmednasser
	 *
	 */
	public final void switcher() {
		Stack x = new Stack();
		Scanner input = new Scanner(System.in);
		while (gets) {
System.out.print("************************************\n");
System.out.print("*                                  *\n");
System.out.print("*         1 Add at index           *\n");
System.out.print("*                                  *\n");
System.out.print("*         2 Push                   *\n");
System.out.print("*                                  *\n");
System.out.print("*         3 Pop                    *\n");
	System.out.print("*                                  *\n");
	System.out.print("*         4 peek                   *\n");
	System.out.print("*                                  *\n");
	System.out.print("*         5 check empty            *\n");
	System.out.print("*                                  *\n");
	System.out.print("*         6 Get size               *\n");
	System.out.print("*                                  *\n");
	System.out.print("************************************\n");
		 int op = input.nextInt();
			if (op == 1) {
System.out.println("How many Object do you want to add?");
				int s = input.nextInt();
				for (int i = 0; i < s; i++) {
System.out.println("enter your number :");
					Object z = input.nextInt();
System.out.println("enter your index :");
					int l = input.nextInt();
					x.add(l, z);
				}
			} else if (op == 2) {
System.out.println("How many Object do you want to push?");

				int w = input.nextInt();
				for (int i = 0; i < w; i++) {
System.out.println("enter your number :");
					Object z = input.nextInt();
					x.push(z);
				}
			} else if (op == var3) {
System.out.println("How many Object do you want to pop?");
				int r = input.nextInt();
				for (int i = 0; i < r; i++) {
					System.out.println(x.pop());
				}
			} else if (op == var4) {
				System.out.println(x.peek());
			} else if (op == var5) {
				System.out.println(x.isEmpty());
			} else if (op == var6) {
				System.out.println(x.size());
			} else {
				System.out.println("please choose an option");
			}
System.out.println("Want to exit ? press (e) or  ant key to continue ");
			char d = input.next().charAt(0);
			if (d == 'e') {
				gets = false;
			} else {
				continue;
			}

		}
	}

}
