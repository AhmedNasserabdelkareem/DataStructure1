package eg.edu.alexu.csd.datastructure.linkedList.cs09;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

/**
 * @author Ahmednasser
 *
 */
public class Polynomial implements IPolynomialSolver {
/**
 * @author Ahmednasser
 *
*/	
	SinglyLinkedList[] A = new SinglyLinkedList[2];
	/**
	 * @author Ahmednasser
	 *
	 */
	SinglyLinkedList[] B = new SinglyLinkedList[2];
	/**
	 * @author Ahmednasser
	 *
	 */
	SinglyLinkedList[] C = new SinglyLinkedList[2];
	/**
	 * @author Ahmednasser
	 *
	 */
	SinglyLinkedList[] R = new SinglyLinkedList[2];
	/**
	 * @author Ahmednasser
	 *
	 */
public int as = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
public int bs = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
public int cs = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
public int rs = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
public boolean a = false, b = false, c = false, r = false;

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void setPolynomial(final char poly, final int[][] terms) {
		for (int i = 0; i < terms.length; i++) {

			if (i + 1 < terms.length) {
				int j;
				j = i + 1;
if (terms[i][1] < 0 || terms[j][1] > terms[i][1]) {
					throw new RuntimeException();
				}
			} else {
				if (terms[i][1] < 0) {
					throw new RuntimeException();
				}
			}

		}
		if (poly != 'A' && poly != 'B' && poly != 'C' && poly != 'R') {
			throw new RuntimeException();
		}
		if (poly == 'A') {
			if (A[0] == null) {
				A[0] = new SinglyLinkedList();
				A[1] = new SinglyLinkedList();
			}
			a = true;
			for (int i = 0; i < terms.length; i++) {
				for (int j = 0; j < 2; j++) {
					A[j].add(terms[i][j]);
				}
			}
			this.as = terms.length;
		} else if (poly == 'B') {
			if (B[0] == null) {
				B[0] = new SinglyLinkedList();
				B[1] = new SinglyLinkedList();
			}
			b = true;
			for (int i = 0; i < terms.length; i++) {
				for (int j = 0; j < 2; j++) {
					B[j].add(terms[i][j]);
				}
			}
			this.bs = terms.length;
		} else if (poly == 'C') {
			if (C[0] == null) {
				C[0] = new SinglyLinkedList();
				C[1] = new SinglyLinkedList();
			}
			c = true;
			for (int i = 0; i < terms.length; i++) {
				for (int j = 0; j < 2; j++) {
					C[j].add(terms[i][j]);
				}
			}
			this.cs = terms.length;
		} else if (poly == 'R') {
			if (R[0] == null) {
				R[0] = new SinglyLinkedList();
				R[1] = new SinglyLinkedList();
			}
			if (r == true) {
				throw new RuntimeException();
			}
			r = true;
			for (int i = 0; i < terms.length; i++) {
				for (int j = 0; j < 2; j++) {
					R[j].add(terms[i][j]);
				}
			}
		}

	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public String print(final char poly) {
		String equation;
		StringBuilder stringBuilder = new StringBuilder();
		if (poly == 'A' && a) {
			for (int i = 0; i < A[0].size; i++) {
				for (int j = 0; j < 2; j++) {
					if (j == 0) {
						if (A[0].get(i).equals(0)) {
						} else {
if (A[0].get(i).equals(1) || A[0].get(i).equals(-1)) {
if (A[0].get(i).equals(-1)) {
stringBuilder.append("-");
if (A[1].get(i).equals(0)) {
stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								} else {
stringBuilder.append("+");
if (A[1].get(i).equals(0)) {
stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								}
							} else {
if (A[1].get(i).equals(0)) {
stringBuilder.append("+" + A[j].get(i));
								} else {
stringBuilder.append("+" + A[j].get(i) + "X");
								}
							}
						}
					} else if (j == 1) {
if (A[0].get(i).equals(0) || A[1].get(i).equals(0) || A[1].get(i).equals(1)) {
						} else {
stringBuilder.append("^" + A[j].get(i) + "");
						}
					}
				}

			}
		} else if (poly == 'B' && b) {
			for (int i = 0; i < B[0].size; i++) {
				for (int j = 0; j < 2; j++) {
					if (j == 0) {
						if (B[0].get(i).equals(0)) {
						} else {
if (B[0].get(i).equals(1) || B[0].get(i).equals(-1)) {
	if (B[0].get(i).equals(-1)) {
	stringBuilder.append("-");
if (B[1].get(i).equals(0)) {
stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								} else {
stringBuilder.append("+");
if (B[1].get(i).equals(0)) {
stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								}
							} else {
if (B[1].get(i).equals(0)) {
stringBuilder.append("+" + B[j].get(i));
								} else {
stringBuilder.append("+" + B[j].get(i) + "X");
								}
							}
						}
					} else if (j == 1) {
if (B[0].get(i).equals(0) || B[1].get(i).equals(0) || B[1].get(i).equals(1)) {
						} else {
stringBuilder.append("^" + B[j].get(i) + "");
						}
					}
				}

			}

		} else if (poly == 'C' && c) {
			for (int i = 0; i < C[0].size; i++) {
				for (int j = 0; j < 2; j++) {
					if (j == 0) {
						if (C[0].get(i).equals(0)) {
						} else {
if (C[0].get(i).equals(1) || C[0].get(i).equals(-1)) {
if (C[0].get(i).equals(-1)) {
stringBuilder.append("-");
if (C[1].get(i).equals(0)) {
stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								} else {
stringBuilder.append("+");
if (C[1].get(i).equals(0)) {
	stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								}
							} else {
if (C[1].get(i).equals(0)) {
stringBuilder.append("+" + C[j].get(i));
								} else {
stringBuilder.append("+" + C[j].get(i) + "X");
								}
							}
						}
					} else if (j == 1) {
if (C[0].get(i).equals(0) || C[1].get(i).equals(0) || C[1].get(i).equals(1)) {
						} else {
stringBuilder.append("^" + C[j].get(i) + "");
						}
					}
				}

			}

		} else if (poly == 'R' && R[0] != null) {
			for (int i = 0; i < R[0].size; i++) {
				for (int j = 0; j < 2; j++) {
					if (j == 0) {
						if (R[0].get(i).equals(0)) {
						} else {
if (R[0].get(i).equals(1) || R[0].get(i).equals(-1)) {
	if (R[0].get(i).equals(-1)) {
	stringBuilder.append("-");
	if (R[1].get(i).equals(0)) {
	stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								} else {
	stringBuilder.append("+");
	if (R[1].get(i).equals(0)) {
		stringBuilder.append("1");
									} else {
stringBuilder.append("x");
									}
								}
							} else {
if (R[1].get(i).equals(0)) {
stringBuilder.append("+" + R[j].get(i));
								} else {
stringBuilder.append("+" + R[j].get(i) + "X");
								}
							}
						}
					} else if (j == 1) {
if (R[0].get(i).equals(0) || R[1].get(i).equals(0) || R[1].get(i).equals(1)) {
						} else {
stringBuilder.append("^" + R[j].get(i) + "");
						}
					}
				}

			}

		} else {
			return null;
		}
		equation = String.valueOf(stringBuilder);
		boolean flag = false;
		int index = 0;
		int numberOfdel = 0;
		for (int i = 0; i < equation.length(); i++) {
			if (numberOfdel == 0 && equation.charAt(0) == '+') {
				stringBuilder.deleteCharAt(index);
				equation = String.valueOf(stringBuilder);
				numberOfdel++;
				i = 0;
			} else if (equation.charAt(i) == '+') {
				flag = true;
				index = i;
			} else if (equation.charAt(i) == '-' && flag) {
				stringBuilder.deleteCharAt(index);
				equation = String.valueOf(stringBuilder);
				flag = false;
			} else if (flag) {
				flag = false;
			}
		}
		equation = String.valueOf(stringBuilder);
		return equation;
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void clearPolynomial(final char poly) {
		if (poly != 'A' && poly != 'B' && poly != 'C' && poly != 'R') {
			throw new RuntimeException();
		}
		if (poly == 'A') {
			if (a == false) {
				throw new RuntimeException();
			}
			a = false;
			A[0] = new SinglyLinkedList();
			A[1] = new SinglyLinkedList();
			for (int j = 0; j < 2; j++) {
				A[j].clear();

			}
		} else if (poly == 'B') {
			if (b == false) {
				throw new RuntimeException();
			}
			b = false;
			B[0] = new SinglyLinkedList();
			B[1] = new SinglyLinkedList();
			for (int j = 0; j < 2; j++) {
				B[j].clear();
			}

		} else if (poly == 'C') {
			C[0] = new SinglyLinkedList();
			C[1] = new SinglyLinkedList();
			if (c == false) {
				throw new RuntimeException();
			}
			c = false;
			for (int j = 0; j < 2; j++) {
				C[j].clear();

			}
		} else if (poly == 'R') {
			R[0] = new SinglyLinkedList();
			R[1] = new SinglyLinkedList();
			if (r == false) {
				throw new RuntimeException();
			}
			r = false;
			for (int j = 0; j < 2; j++) {
				R[j].clear();

			}
		}
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public float evaluatePolynomial(final char poly, final float value) {
		float Result = 0;

		if (poly == 'A' && A != null) {
			Result = 0;
			for (int i = 0; i < A[0].size; i++) {
Result += (float) ((int) A[0].get(i) * Math.pow(value, (int) A[1].get(i)));
			}
		} else if (poly == 'B' && B != null) {
			Result = 0;
			for (int i = 0; i < B[0].size; i++) {
Result += (float) ((int) B[0].get(i) * Math.pow(value, (int) B[1].get(i)));
			}
		} else if (poly == 'C' && C != null) {
			Result = 0;
			for (int i = 0; i < C[0].size; i++) {
Result += (float) (((int) C[0].get(i)) * Math.pow(value, (int) C[1].get(i)));
			}
		} else if (poly == 'R' && R != null) {
			Result = 0;
			for (int i = 0; i < R[0].size; i++) {
Result += (float) ((int) R[0].get(i) * Math.pow(value, (int) R[1].get(i)));
			}
		} else {
			return (Float) null;
		}
		return Result;
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public int[][] add(final char poly1, final char poly2) {
		if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
			throw null;
		}
		if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
			throw null;
		}
		if (A[0] == null) {
			A[0] = new SinglyLinkedList();
			A[1] = new SinglyLinkedList();
		}
		if (B[0] == null) {
			B[0] = new SinglyLinkedList();
			B[1] = new SinglyLinkedList();
		}
		if (C[0] == null) {
			C[0] = new SinglyLinkedList();
			C[1] = new SinglyLinkedList();
		}
int[][] additions = new int[A[0].size() + B[0].size() + C[0].size()][2];
		int maloc = 0;
		int saloc = 0;
		int baloc = 0;
		if (poly1 == 'A' || poly2 == 'A') {
			if (a == false) {
				throw null;
			}
			for (int i = 0; i < A[0].size(); i++) {
				for (int j = 0; j < 2; j++) {
					int z = (int) A[j].get(i);
					additions[i + saloc + baloc][j] = z;
				}
				maloc++;
			}

		}
		if (poly1 == 'B' || poly2 == 'B') {
			if (b == false) {
				throw null;
			}
			for (int i = 0; i < B[0].size(); i++) {
				for (int j = 0; j < 2; j++) {
					int x = (int) B[j].get(i);
					additions[i + maloc + baloc][j] = x;
				}
				saloc++;
			}
		}

		if (poly1 == 'C' || poly2 == 'C') {
			if (c == false) {
				throw null;
			}
			for (int i = 0; i < C[0].size(); i++) {
				for (int j = 0; j < 2; j++) {
					int x = (int) C[j].get(i);
					additions[i + maloc + saloc][j] = x;
				}
			}
			baloc++;
		}

		for (int i = 0; i < additions.length; i++) {
			for (int j = i + 1; j < additions.length; j++) {
				if (additions[i][1] == additions[j][1]) {
					additions[i][0] += additions[j][0];
					additions[j][0] = 0;

				}
			}
		}
		int n = 0;
		for (int i = 0; i < additions.length; i++) {
			if (additions[i][0] != 0){
				n++;
			}
		}

		int[][] newArray = new int[n][2];
		int j = 0;

		for (int i = 0; i < additions.length; i++) {
			if (additions[i][0] != 0) {
				newArray[j][0] = additions[i][0];
				newArray[j][1] = additions[i][1];

				j++;
			}
		}
		if ((poly1 == 'A' && poly2 == 'A') || (poly1 == 'B' && poly2 == 'B') || (poly1 == 'C' && poly2 == 'C')) {

			for (int i = 0; i < newArray.length; i++) {
				newArray[i][0] *= 2;
			}

		}
		if (r == true) {
			this.clearPolynomial('R');
		}
		this.setPolynomial('R', newArray);
		return newArray;
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public int[][] subtract(final char poly1, final char poly2) {
		if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
			return null;
		}
		if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
			return null;
		}
		if (A[0] == null) {
			A[0] = new SinglyLinkedList();
			A[1] = new SinglyLinkedList();
		}
		if (B[0] == null) {
			B[0] = new SinglyLinkedList();
			B[1] = new SinglyLinkedList();
		}
		if (C[0] == null) {
			C[0] = new SinglyLinkedList();
			C[1] = new SinglyLinkedList();
		}
		int as = A[0].size();
		int bs = B[0].size();
		int cs = C[0].size();
		int[][] substractions = new int[as + bs + cs][2];

		int maloc = 0;
		int saloc = 0;
		int baloc = 0;
		if (poly1 == 'A' || poly2 == 'A') {
			if (a == false) {
				return null;
			}
			if (poly2 == 'A') {
				for (int i = 0; i < as; i++) {
					for (int j = 0; j < 2; j++) {
						int z = (int) A[j].get(i);
						if (j == 0) {
substractions[i + saloc + baloc][j] = -z;

						} else {
substractions[i + saloc + baloc][j] = z;

						}
					}
					maloc++;
				}
			} else {
				for (int i = 0; i < as; i++) {
					for (int j = 0; j < 2; j++) {
						int z = (int) A[j].get(i);
substractions[i + saloc + baloc][j] = z;
					}
					maloc++;
				}
			}

		}
		if (poly1 == 'B' || poly2 == 'B') {
			if (b == false) {
				return null;
			}
			if (poly2 == 'B') {
				for (int i = 0; i < bs; i++) {
					for (int j = 0; j < 2; j++) {
						int x = (int) B[j].get(i);
						if (j == 0) {
substractions[i + maloc + baloc][j] = -x;

						} else {
substractions[i + maloc + baloc][j] = x;

						}
					}
					saloc++;}
			} else {
				for (int i = 0; i < bs; i++) {
					for (int j = 0; j < 2; j++) {
						int x = (int) B[j].get(i);
substractions[i + maloc + baloc][j] = x;}
					saloc++;}
				}
			}
		if (poly1 == 'C' || poly2 == 'C') {
			if (c == false) {
				return null;
				}
			if (poly2 == 'C') {
				for (int i = 0; i < cs; i++) {
					for (int j = 0; j < 2; j++) {
						int x = (int) C[j].get(i);
						if (j == 0) {
substractions[i + maloc + saloc][j] = -x;
						} else {
substractions[i + maloc + saloc][j] = x;
}
						}
					baloc++;}
			} else {
				for (int i = 0; i < cs; i++) {
					for (int j = 0; j < 2; j++) {
						int x = (int) C[j].get(i);
substractions[i + maloc + saloc][j] = x;
}
					baloc++;
					}
				}
			}
		int eq = 0;
		for (int i = 0; i < substractions.length; i++) {
			for (int j = i + 1; j < substractions.length; j++) {
if (substractions[i][1] == substractions[j][1]) {
substractions[i][0] += substractions[j][0];
					substractions[j][0] = 0;
					}
}
			}
		int subsize = as + bs + cs;
		for (int i = 0; i < (subsize / 2); i++) {
if ((substractions[i][0] + substractions[i + (subsize / 2)][0]) == 0) {
				eq++;
}
}
		if (eq == (subsize / 2)) {
			int[][] zeros = {{0, 0 }};
			return zeros;
		}
		int n = 0;
		for (int i = 0; i < substractions.length; i++) {
			if (substractions[i][0] != 0) {
				n++;
		}	
			}
		int[][] newArray = new int[n][2];
		int j = 0;
		for (int i = 0; i < substractions.length; i++) {
			if (substractions[i][0] != 0) {
				newArray[j][0] = substractions[i][0];
				newArray[j][1] = substractions[i][1];
				j++;
			}
		}
if ((poly1 == 'A' && poly2 == 'A') || (poly1 == 'B' && poly2 == 'B') || (poly1 == 'C' && poly2 == 'C')) {
			int[][] zeros = {{0, 0 }};
			return zeros;
		}
		if (r == true) {
			this.clearPolynomial('R');
		}
		this.setPolynomial('R', newArray);
		return newArray;
	}
	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public int[][] multiply(final char poly1, final char poly2) {
		if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
			return null;
		}
		if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
			return null;
		}
		int as = 0, cs = 0, bs = 0;
		if (A[0] == null) {
			A[0] = new SinglyLinkedList();
			A[1] = new SinglyLinkedList();
			as = 1;
		} else {
			as = A[0].size();
		}
		if (B[0] == null) {
			B[0] = new SinglyLinkedList();
			B[1] = new SinglyLinkedList();
			bs = 1;
		} else {
			bs = B[0].size();
		}
		if (C[0] == null) {
			C[0] = new SinglyLinkedList();
			C[1] = new SinglyLinkedList();
			cs = 1;
		} else {
			cs = C[0].size();
		}

		if (as == 0) {
			as = 1;
		}
		if (bs == 0) {
			bs = 1;
		}
		if (cs == 0) {
			cs = 1;
		}
		int[][] multiplictions = new int[as * cs * bs][2];
		int[][] multia = new int[as][2];
		int[][] multib = new int[bs][2];
		int[][] multic = new int[cs][2];
		if (poly1 == 'A' ^ poly2 == 'A') {
			if (a == false) {
				return null;
			}
			for (int i = 0; i < as; i++) {
				for (int j = 0; j < 2; j++) {
					int z = (int) A[j].get(i);
					multia[i][j] = z;
				}
			}

		} else if ((poly1 == 'A') && (poly2 == 'A')) {
			if (a == false) {
				return null;
			}
			for (int i = 0; i < as; i++) {
				for (int j = 0; j < 2; j++) {
					int z = (int) A[j].get(i);
					multia[i][j] = z;
				}
			}
			int k = 0;
			for (int i = 0; i < as; i++) {
				for (int j = 0; j < as; j++) {
multiplictions[k][0] = multia[i][0] * multia[j][0];
multiplictions[k][1] = multia[i][1] + multia[j][1];
					if (k < (as * as)) {
						k++;
					}

				}

			}
			for (int i = 0; i < multiplictions.length; i++) {
for (int j = i + 1; j < multiplictions.length; j++) {
if (multiplictions[i][1] == multiplictions[j][1]) {
multiplictions[i][0] += multiplictions[j][0];
						multiplictions[j][0] = 0;

					}
				}
			}
			int n = 0;
			for (int i = 0; i < multiplictions.length; i++) {
if (multiplictions[i][0] != 0){
					n++;
}
			}

			int[][] newArray = new int[n][2];
			int j = 0;

			for (int i = 0; i < multiplictions.length; i++) {
				if (multiplictions[i][0] != 0) {
					newArray[j][0] = multiplictions[i][0];
					newArray[j][1] = multiplictions[i][1];

					j++;
				}
			}
			return newArray;

		}
		if (poly1 == 'B' ^ poly2 == 'B') {
			if (b == false) {
				return null;
			}
			for (int i = 0; i < bs; i++) {
				for (int j = 0; j < 2; j++) {
					int x = (int) B[j].get(i);
					multib[i][j] = x;
				}
			}
		} else if ((poly1 == 'B') && (poly2 == 'B')) {
			if (b == false) {
				return null;
			}
			for (int i = 0; i < bs; i++) {
				for (int j = 0; j < 2; j++) {
					int z = (int) B[j].get(i);
					multib[i][j] = z;
				}
			}
			int k = 0;
			for (int i = 0; i < bs; i++) {
				for (int j = 0; j < bs; j++) {
multiplictions[k][0] = multib[i][0] * multib[j][0];
multiplictions[k][1] = multib[i][1] + multib[j][1];
					if (k < (bs * bs)) {
						k++;
					}

				}

			}
			for (int i = 0; i < multiplictions.length; i++) {
for (int j = i + 1; j < multiplictions.length; j++) {
if (multiplictions[i][1] == multiplictions[j][1]) {
multiplictions[i][0] += multiplictions[j][0];
						multiplictions[j][0] = 0;

					}
				}
			}
			int n = 0;
			for (int i = 0; i < multiplictions.length; i++) {
if (multiplictions[i][0] != 0){
					n++;
}
			}

			int[][] newArray = new int[n][2];
			int j = 0;

			for (int i = 0; i < multiplictions.length; i++) {
				if (multiplictions[i][0] != 0) {
					newArray[j][0] = multiplictions[i][0];
					newArray[j][1] = multiplictions[i][1];

					j++;
				}
			}
			return newArray;

		}

		if (poly1 == 'C' ^ poly2 == 'C') {
			if (c == false) {
				return null;
			}
			for (int i = 0; i < cs; i++) {
				for (int j = 0; j < 2; j++) {
					int x = (int) C[j].get(i);
					multic[i][j] = x;
				}
			}
		} else if ((poly1 == 'C') && (poly2 == 'C')) {
			if (c == false) {
				return null;
			}
			for (int i = 0; i < cs; i++) {
				for (int j = 0; j < 2; j++) {
					int z = (int) C[j].get(i);
					multic[i][j] = z;
				}
			}
			int k = 0;
			for (int i = 0; i < cs; i++) {
				for (int j = 0; j < cs; j++) {
multiplictions[k][0] = multic[i][0] * multic[j][0];
multiplictions[k][1] = multic[i][1] + multic[j][1];
					if (k < (cs * cs)) {
						k++;
					}

				}

			}
			for (int i = 0; i < multiplictions.length; i++) {
for (int j = i + 1; j < multiplictions.length; j++) {
if (multiplictions[i][1] == multiplictions[j][1]) {
multiplictions[i][0] += multiplictions[j][0];
						multiplictions[j][0] = 0;

					}
				}
			}
			int n = 0;
			for (int i = 0; i < multiplictions.length; i++) {
if (multiplictions[i][0] != 0) {
					n++;
}
			}

			int[][] newArray = new int[n][2];
			int j = 0;

			for (int i = 0; i < multiplictions.length; i++) {
				if (multiplictions[i][0] != 0) {
					newArray[j][0] = multiplictions[i][0];
					newArray[j][1] = multiplictions[i][1];

					j++;
				}
			}
			return newArray;

		}

if ((poly1 == 'A' || poly2 == 'A') && (poly1 == 'B' || poly2 == 'B')) {
			int k = 0;
			for (int i = 0; i < as; i++) {
				for (int j = 0; j < bs; j++) {
multiplictions[k][0] = multia[i][0] * multib[j][0];
multiplictions[k][1] = multia[i][1] + multib[j][1];
					if (k < (bs * as)) {
						k++;
					}

				}

			}

		}
if ((poly1 == 'C' || poly2 == 'C') && (poly1 == 'B' || poly2 == 'B')) {
			int k = 0;
			for (int i = 0; i < cs; i++) {
				for (int j = 0; j < bs; j++) {
multiplictions[k][0] = multic[i][0] * multib[j][0];
multiplictions[k][1] = multic[i][1] + multib[j][1];
					if (k < (cs * bs)) {
						k++;
					}

				}

			}

		}
if ((poly1 == 'C' || poly2 == 'C') && (poly1 == 'A' || poly2 == 'A')) {
			int k = 0;
			for (int i = 0; i < cs; i++) {
				for (int j = 0; j < as; j++) {
multiplictions[k][0] = multic[i][0] * multia[j][0];
multiplictions[k][1] = multic[i][1] + multia[j][1];
					if (k < (cs * as)) {
						k++;
					}

				}

			}
		}
		for (int i = 0; i < multiplictions.length; i++) {
			for (int j = i + 1; j < multiplictions.length; j++) {
	if (multiplictions[i][1] == multiplictions[j][1]) {
	multiplictions[i][0] += multiplictions[j][0];
					multiplictions[j][0] = 0;

				}
			}
		}
		int n = 0;
		for (int i = 0; i < multiplictions.length; i++) {
			if (multiplictions[i][0] != 0){
				n++;
			}
		}

		int[][] newArray = new int[n][2];
		int j = 0;

		for (int i = 0; i < multiplictions.length; i++) {
			if (multiplictions[i][0] != 0) {
				newArray[j][0] = multiplictions[i][0];
				newArray[j][1] = multiplictions[i][1];

				j++;
			}
		}
		if (r == true) {
			this.clearPolynomial('R');
		}
		this.setPolynomial('R', newArray);
		return newArray;
	}
	/**
	 * @author Ahmednasser
	 * @param x
	 *
	 */
	public void printUnreadable(final SinglyLinkedList[] x) {
		for (int i = 0; i < x[0].size; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(x[j].get(i) + " ");
			}

			System.out.println();
		}
	}

}
