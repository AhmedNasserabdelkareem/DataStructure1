package eg.edu.alexu.csd.datastructure.stack.cs09;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

/**.
 * @author Ahmednasser
 *
 */
public class eva implements IExpressionEvaluator {
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var48 = 48;
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var97 = 97;
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var57 = 57;
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var122 = 122;
	/**.
	 * Using to convert from infix to postfix shape
	 *
	 */
	@Override
	public String infixToPostfix(final String expression) {
		if ((expression == null) || (expression.length() == 0)) {
			throw null;
		}
		Stack e = new Stack();
		int ob = 0;
		int cb = 0;
		String x = expression.replaceAll("\\s", "");
		String my = "";
		StringBuilder tmp = new StringBuilder();
		char[] chararr = x.toCharArray();
if ((chararr[x.length() - 1] == '*') || (chararr[x.length() - 1] == '/') || (chararr[x.length() - 1] == '-')
				|| (chararr[x.length() - 1] == '+')) {
			throw null;
		}
		int del = 0;
		while (del < chararr.length) {
if (((chararr[del] == '*') || (chararr[del] == '/') || (chararr[del] == '-') || (chararr[del] == '+'))
&& ((chararr[del + 1] == '*') || (chararr[del + 1] == '/') || (chararr[del + 1] == '-')
|| (chararr[del + 1] == '+'))) {
				throw null;

			}
			del++;
		}

		for (int i = 0; i < x.length(); i++) {
			if (chararr[i] == '(') {
				ob++;
			}
			if (chararr[i] == ')') {
				cb++;
			}
if (((chararr[i] >= var48) && (chararr[i] <= var57)) || ((chararr[i] >= var97) && (chararr[i] <= var122))) {
				my += chararr[i];
} else if ((chararr[i] == '*') || (chararr[i] == '/')
|| (chararr[i] == '-') || (chararr[i] == '+')) {
				if (e.size() == 0) {
					e.push((Object) chararr[i]);

				} else {
if ((chararr[i] == '+') || (chararr[i] == '-')) {
						while (e.size() > 0) {
							my += e.pop();
							// my+=" ";
						}
						e.push((Object) chararr[i]);
} else if ((chararr[i] == '*') || (chararr[i] == '/')) {
						boolean factor = false;
	for (int n = 0; n < e.size(); n++) {
		char y = (char) e.peekind(n);
	if ((y == '*') || (y == '/')) {
								factor = true;
							}
							if (factor == true) {
	for (int m = 0; m <= n; m++) {
	my += e.pop();
								}
								n = 0;

							}
						}
						e.push((Object) chararr[i]);

					}
				}

			}
		}
		if (e.size() != 0) {
			while (e.size() > 0) {
				my += e.pop();
				// my+=" ";
			}

		}
		if (ob != cb) {
			throw null;
		}

		for (int i = 0; i < my.length(); i++) {
			if (i == x.length() - 1) {
				tmp.append(my.charAt(i));

			} else {
				tmp.append(my.charAt(i));
				tmp.append(" ");
			}

		}
		String that = tmp.toString();

		return that;

	}

	/**.
	 * Using to evaluate an arthimitic operation at postfix shape
	 *
	 */
	@Override
	public int evaluate(final String expression) {
		if ((expression == null) || (expression.length() == 0)) {
			throw null;
		}
		int z = 0;
		while (z < expression.length()) {
if (expression.charAt(z) >= var97 && expression.charAt(z) <= var122) {
				throw null;
			}

			z++;
		}
		return 0;
	}
}
