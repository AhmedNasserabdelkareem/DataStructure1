package eg.edu.alexu.csd.datastructure.maze.cs09;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import eg.edu.alexu.csd.datastructure.maze.IMazeSolver;

/**
 * @author Ahmednasser
 *
 */
public class maze implements IMazeSolver {
	/**
	 * @author Ahmednasser
	 *
	 */
	public BufferedReader br = null;
	/**
	 * @author Ahmednasser
	 *
	 */
	public FileInputStream fr = null;
	/**
	 * @author Ahmednasser
	 *
	 */
	private SinglyLinkedList m = new SinglyLinkedList();

	@Override
	public final int[][] solveBFS(final File maze) {
		try {

			fr = new FileInputStream(maze);
			br = new BufferedReader(new InputStreamReader(fr));

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				m.add(sCurrentLine);
			}

		} catch (Exception e) {
			throw null;

		} finally {

			try {

				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}

			} catch (Exception e) {
				throw null;
			}
		}

		String e = (String) m.get(0);
		String[] ad = e.split(" ");
		int[] array = new int[ad.length];
		for (int y = 0; y < array.length; y++) {
			array[y] = Integer.parseInt(ad[y]);
		}
		int xd = array[0];
		int yd = array[1];
		if (xd == 0 || yd == 0) {
			throw null;
		}

		String[] b = new String[xd];
		for (int i = 1; i < m.size(); i++) {
			b[i - 1] = (String) m.get(i);

		}
		char[][] c = new char[xd][yd];
		for (int i = 0; i < xd; i++) {
			for (int j = 0; j < yd; j++) {
				c[i][j] = b[i].charAt(j);
			}
		}
		Point start = new Point();
		Point end = new Point();
		int countx = 0;
		int county = 0;
		for (int i = 0; i < xd; i++) {
			for (int j = 0; j < yd; j++) {
				if (c[i][j] == 'S') {
					start.x = i;
					start.y = j;
					countx++;
				}

				if (c[i][j] == 'E') {
					end.x = i;
					end.y = j;
					county++;
				}

			}

		}

		if (countx != 1 || county != 1) {
			throw null;
		}
		if (end.x == start.x || end.y == start.y) {
			int counter = 0;
			if (end.x == start.x) {
int[][] hello = new int[Math.abs(end.y - start.y) + 1][2];

				if (end.y > start.y) {
for (int i = start.y + 1; i < end.y; i++) {
						if (c[end.x][i] == '.') {
							counter++;
						}
					}
					if (counter == (end.y - start.y - 1)) {
for (int i = 0; i <= (end.y - start.y); i++) {
							hello[i][0] = end.x;
hello[i][1] = i + start.y;
						}
						return hello;
					}

				}

				if (end.y < start.y) {
for (int i = end.y + 1; i < start.y; i++) {
						if (c[end.x][i] == '.') {
							counter++;
						}
					}
					if (counter == (start.y - end.y - 1)) {
for (int i = 0; i <= (start.y - end.y); i++) {
							hello[i][0] = end.x;
							hello[i][1] = i + end.y;
						}
						return hello;
					}

				}
			}

			if (end.y == start.y) {
int[][] hello = new int[Math.abs(end.x - start.x) + 1][2];

				if (end.x > start.x) {
for (int i = start.x + 1; i < end.x; i++) {
						if (c[i][end.y] == '.') {
							counter++;
						}
					}
					if (counter == (end.x - start.x - 1)) {
for (int i = 0; i <= (end.x - start.x); i++) {
hello[i][0] = i + start.x;
							hello[i][1] = end.y;
						}
						return hello;
					}

				}
				if (end.x < start.x) {
for (int i = end.x + 1; i < start.x; i++) {
						if (c[i][end.y] == '.') {
							counter++;
						}
					}
					if (counter == (start.x - end.x - 1)) {
for (int i = 0; i <= (start.x - end.x); i++) {
							hello[i][0] = i + end.x;
							hello[i][1] = end.y;
						}
						return hello;
					}
				}
			}
		}
		linkqueue n = new linkqueue();
		int[][] visited = new int[xd][yd];
		Point[][] result = new Point[xd][yd];
		n.enqueue(start);
		visited[start.y][start.x] = 1;

		/*** hna kant x bdl y **/
		Point k = new Point();
		boolean done = false;

		while (!n.isEmpty()) {
			k = (Point) n.dequeue();
			if (k.x == end.x && k.y == end.y) {
				done = true;
				break;
			}
			visited[k.y][k.x] = 1;
if (k.x + 1 < yd && visited[k.y][k.x + 1] == 0 && c[k.y][k.x + 1] != '#') {
				result[k.y][k.x + 1] = new Point(k.x, k.y);
				n.enqueue(new Point(k.x + 1, k.y));
			}
if (k.x - 1 >= 0 && visited[k.y][k.x - 1] == 0 && c[k.y][k.x - 1] != '#') {
				result[k.y][k.x - 1] = new Point(k.x, k.y);
				n.enqueue(new Point(k.x - 1, k.y));
			}
if (k.y + 1 < xd && visited[k.y + 1][k.x] == 0 && c[k.y + 1][k.x] != '#') {
				result[k.y + 1][k.x] = new Point(k.x, k.y);
				n.enqueue(new Point(k.x, k.y + 1));
			}

if (k.y - 1 >= 0 && visited[k.y - 1][k.x] == 0 && c[k.y - 1][k.x] != '#') {
				result[k.y - 1][k.x] = new Point(k.x, k.y);
				n.enqueue(new Point(k.x, k.y - 1));
			}

		}

		if (done == false) {
			return null;
		}
		SinglyLinkedList x = new SinglyLinkedList();
		while (result[k.y][k.x] != null) {
			x.add(0, new Point(k.x, k.y));
			k = result[k.y][k.x];
		}
		x.add(0, new Point(k.x, k.y));
		int[][] arr = new int[x.size][2];
		for (int i = 0; i < x.size; i++) {
			Point d = (Point) x.get(i);
			arr[i][0] = d.x;
			arr[i][1] = d.y;

		}

		return arr;
	}

	@Override
	public final int[][] solveDFS(final File maze) {
		try {
			fr = new FileInputStream(maze);
			br = new BufferedReader(new InputStreamReader(fr));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				m.add(sCurrentLine);
			}
		} catch (Exception e) {
			throw null;
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				throw null;
			}
		}
		String e = (String) m.get(0);
		String[] ad = e.split(" ");
		int[] array = new int[ad.length];
		final int var1 = 1;
		final int var2 = 2;
		final int var3 = 3;
		final int var4 = 4;
		for (int y = 0; y < array.length; y++) {
			array[y] = Integer.parseInt(ad[y]);
		}
		int xd = array[0];
		int yd = array[1];
		if (xd == 0 || yd == 0) {
			throw null;
		}
		String[] b = new String[xd];
		for (int i = 0; i < xd; i++) {
			b[i] = (String) m.get(i + 1);
		}
		char[][] c = new char[xd][yd];
		for (int i = 0; i < xd; i++) {
			for (int j = 0; j < yd; j++) {
				c[i][j] = b[i].charAt(j);
			}
		}
		Point start = new Point();
		Point end = new Point();
		int countx = 0;
		int county = 0;
		for (int i = 0; i < xd; i++) {
			for (int j = 0; j < yd; j++) {
				if (c[i][j] == 'S') {
					start.x = i;
					start.y = j;
					countx++;
			}
				if (c[i][j] == 'E') {
					end.x = i;
					end.y = j;
					county++;
				}
			}
		}
		if (countx != 1 || county != 1) {
			throw null;
		}
		if (end.x == start.x || end.y == start.y) {
			int counter = 0;
			if (end.x == start.x) {
int[][] hello = new int[Math.abs(end.y - start.y) + 1][2];
				if (end.y > start.y) {
for (int i = start.y + 1; i < end.y; i++) {
						if (c[end.x][i] == '.') {
							counter++;
						}
					}
					if (counter == (end.y - start.y - 1)) {
for (int i = 0; i <= (end.y - start.y); i++) {
							hello[i][0] = end.x;
hello[i][1] = i + start.y;
						}
						return hello;
					}
				}
				if (end.y < start.y) {
for (int i = end.y + 1; i < start.y; i++) {
						if (c[end.x][i] == '.') {
							counter++;
						}
					}
					if (counter == (start.y - end.y - 1)) {
for (int i = 0; i <= (start.y - end.y); i++) {
							hello[i][0] = end.x;
							hello[i][1] = i + end.y;
						}
						return hello;
					}
				}
			}
			if (end.y == start.y) {
int[][] hello = new int[Math.abs(end.x - start.x) + 1][2];
				if (end.x > start.x) {
for (int i = start.x + 1; i < end.x; i++) {
						if (c[i][end.y] == '.') {
							counter++;
						}
					}
					if (counter == (end.x - start.x - 1)) {
for (int i = 0; i <= (end.x - start.x); i++) {
hello[i][0] = i + start.x;
							hello[i][1] = end.y;
						}
						return hello;
					}
				}
				if (end.x < start.x) {
for (int i = end.x + 1; i < start.x; i++) {
						if (c[i][end.y] == '.') {
							counter++;
						}
					}
					if (counter == (start.x - end.x - 1)) {
for (int i = 0; i <= (start.x - end.x); i++) {
							hello[i][0] = i + end.x;
							hello[i][1] = end.y;
						}
						return hello;
					}
				}
			}
		}
		Stack n = new Stack();
		int[][] visited = new int[xd][yd];
		Point[][] result = new Point[xd][yd];
		boolean done = false;
		n.push(start);
		Point k = new Point();
		while (!n.isEmpty()) {
			k = (Point) n.pop();
			if (k.x == end.x && k.y == end.y) {
				n.push(k);
				done = true;
				break;
			} else {
				if (visited[k.x][k.y] == 0) {
					visited[k.x][k.y] = 1;
if (k.x + 1 < xd && c[k.x + 1][k.y] != '#' && visited[k.x + 1][k.y] == 0) {
						n.push(k);
						Point s = new Point();
						s.x = k.x + 1;
						s.y = k.y;
						n.push(s);
						result[s.x][s.y] = k;
						continue;
					}
				}
				if (visited[k.x][k.y] == var1) {
					visited[k.x][k.y] = var2;
if (k.x - 1 >= 0 && c[k.x - 1][k.y] != '#' && visited[k.x - 1][k.y] == 0) {
						n.push(k);
						Point s = new Point();
						s.x = k.x - 1;
						s.y = k.y;
						n.push(s);
						result[s.x][s.y] = k;
						continue;
					}
				}
				if (visited[k.x][k.y] == var2) {
					visited[k.x][k.y] = var3;
if (k.y + 1 < yd && c[k.x][k.y + 1] != '#' && visited[k.x][k.y + 1] == 0) {
						n.push(k);
						Point s = new Point();
						s.x = k.x;
						s.y = k.y + 1;
						n.push(s);
						result[s.x][s.y] = k;
						continue;
					}
				}
				if (visited[k.x][k.y] == var3) {
					visited[k.x][k.y] = var4;
if (k.y - 1 >= 0 && c[k.x][k.y - 1] != '#' && visited[k.x][k.y - 1] == 0) {
						n.push(k);
						Point s = new Point();
						s.x = k.x;
						s.y = k.y - 1;
						n.push(s);
						result[s.x][s.y] = k;
						continue;
					}
				}

			}
		}
		if (done == true) {
			SinglyLinkedList x = new SinglyLinkedList();
			x = reverse(n, result);
			int[][] arr = new int[x.size][2];
			for (int i = 0; i < x.size; i++) {
				Point d = (Point) x.get(i);
				arr[i][0] = d.y;
				arr[i][1] = d.x;

			}
			return arr;

		} else {
			return null;
		}

	}
	/**
	 * @author Ahmednasser
	 * @param d
	 * @param g
	 * @return list
	 *
	 */
public SinglyLinkedList reverse(final Stack n, final Point[][] result) {
		SinglyLinkedList list = new SinglyLinkedList();
		Point a = new Point();
		a = (Point) n.pop();
		while (result[a.x][a.y] != null) {
			list.add(0, new Point(a.y, a.x));
			a = result[a.x][a.y];
		}
		list.add(0, new Point(a.y, a.x));
		return list;
	}

}
