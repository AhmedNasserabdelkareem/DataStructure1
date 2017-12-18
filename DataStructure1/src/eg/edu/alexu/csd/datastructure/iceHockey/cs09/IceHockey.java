package eg.edu.alexu.csd.datastructure.iceHockey.cs09;

import java.awt.Point;
//import java.util.Arrays;
//import java.util.Comparator;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

/**
 * @author Ahmednasser
 *
 */
public class IceHockey implements IPlayersFinder {
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var100 = 100;
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var4 = 4;
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var48 = 48;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private char[][] arr;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private String[] x;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private boolean[][] visited;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int count = 0;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int counter = 0;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private char teamchar;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int mini;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int minj;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int maxi;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int maxj;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private Point[] center;
	/**
	 * .
	 * 
	 * @author Ahmednasser
	 *
	 */
	private int[][] point = new int[var100][var100];

	/**
	 * .
	 * 
	 * @author Ahmednasser
	 * @param q
	 * @param r
	 * @param w
	 * @return dfs
	 *
	 */

public void dfs(final boolean[][] visitArray0, final int i, final int j) {
if ((j + 1) < x[0].length() && arr[i][j + 1] == teamchar && visited[i][j + 1] == false) {
visited[i][j + 1] = true;
count++;
if (j + 1 > maxj) {
maxj = j + 1;
}
dfs(visited, i, j + 1);
}
if ((j - 1) >= 0 && arr[i][j - 1] == teamchar && visited[i][j - 1] == false) {
visited[i][j - 1] = true;
if (j - 1 < minj) {
minj = j - 1;
}
count++;
dfs(visited, i, j - 1);
}
if ((i - 1) >= 0 && arr[i - 1][j] == teamchar && visited[i - 1][j] == false) {
visited[i - 1][j] = true;
if (i - 1 < mini) {
mini = i - 1;
}
count++;
dfs(visited, i - 1, j);
}
if ((i + 1) < x.length && arr[i + 1][j] == teamchar && visited[i + 1][j] == false) {
visited[i + 1][j] = true;
if (i + 1 > maxi) {
maxi = i + 1;
}
count++;
dfs(visited, i + 1, j);
}
}

	@Override
	public final Point[] findPlayers(final String[] photo,final  int team,final int threshold) {
		this.x = photo;
		int xlen = photo.length;
		int ylen = photo[0].length();
		this.teamchar = (char) (team + var48);
		this.arr = new char[xlen][ylen];
		visited = new boolean[xlen][ylen];
		count = 0;
		counter = 0;

		for (int i = 0; i < xlen; i++) {
			arr[i] = x[i].toCharArray();
		}
		for (int a = 0; a < xlen; a++) {
			for (int b = 0; b < ylen; b++) {
				visited[a][b] = false;
			}
		}

		for (int a = 0; a < xlen; a++) {
			for (int b = 0; b < ylen; b++) {
				count = 0;
if (arr[a][b] == teamchar && visited[a][b] == false) {
					count++;
					visited[a][b] = true;
					mini = a;
					maxi = a;
					minj = b;
					maxj = b;
					dfs(visited, a, b);
				}
				if (count * var4 >= threshold) {
					maxi++;
					maxj++;
					point[counter][0] = minj + maxj;
					point[counter][1] = mini + maxi;
					counter++;
				}

			}

		}

		int temp = 0;
		int swap = 0;
		for (int i = 0; i < counter; i++) {
			for (int j = i + 1; j < counter; j++) {
				if (point[i][0] >= point[j][0]) {
					temp = point[i][0];
					point[i][0] = point[j][0];
					point[j][0] = temp;
					temp = point[i][1];
					point[i][1] = point[j][1];
					point[j][1] = temp;
				}
			}
		}
		for (int y = 0; y < counter; y++) {
			if (point[y][0] == point[y + 1][0]) {
				for (int i = y; i < counter; i++) {
					for (int j = y + 1; j < counter; j++) {
	if (point[i][1] > point[j][1] && point[i][0] == point[j][0]) {
							swap = point[i][1];
		point[i][1] = point[j][1];
							point[j][1] = swap;
							swap = point[i][0];
		point[i][0] = point[j][0];
							point[j][0] = swap;
						}
					}
				}
			}
		}
		center = new Point[counter];
		for (int n = 0; n < counter; n++) {
			center[n] = new Point();
		}
		for (int n = 0; n < counter; n++) {
			center[n].x = point[n][0];
			center[n].y = point[n][1];
		}
		return center;

	}
}
