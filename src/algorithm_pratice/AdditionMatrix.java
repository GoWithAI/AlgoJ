package algorithm_pratice;

public class AdditionMatrix {

	static int[][] c = new int[3][3]; // time=1, space= n*n

	public static void main(String[] args) {

		int[][] a = { { 4, 1, 2 }, { 1, 2, 1 }, { 2, 1, 0 } };// time=1, space= n*n

		int[][] b = { { 1, 1, 1 }, { 3, 2, 1 }, { 1, 0, 1 } };// time=1, space= n*n

		int lenght = a.length;//// time=1, space=1

		additionMatrix(a, b, lenght);// time=1

	}

	public static void additionMatrix(int[][] a, int[][] b, int lenght) {

		for (int i = 0; i < lenght; i++) {
			// 1 n+1 n = highest n+1
			for (int j = 0; j < lenght; j++) {
				// 1 n+1 n = (n+1) + outer loop n = n*n+ n
				c[i][j] = a[i][j] + b[i][j]; // n*n
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		// line 1 for loop : (n+1)
		// line 2 for loop : (n*n +n)
		// line 3 for loop : n*n
		// Time function f(n)= 2 n*n +2n +1
		// Time Complexity O(n*n

		/***** Sapce Complexity ******/
		// a [][] n*n
		// b [][] n*n
		// c [][] n*n
		// Length 1 unit
		// i 1 unit
		// j 1 unit
		// f(n) = 3n*n +3
		// Space complexity = O(n*n)
	}

}
