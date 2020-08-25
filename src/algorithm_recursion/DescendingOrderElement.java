package algorithm_recursion;

/*write recurrsion programe to print element in decending order
 * like eg. 3 2 1......
 * 
 * */

public class DescendingOrderElement {

	public void fun1(int n) {

		if (n > 0) {
			System.out.println(n);
			fun1(n - 1);
		}

	}

	public static void main(String[] args) {

		int x = 3;

		new DescendingOrderElement().fun1(x);

	}

}
/* Time Complexity for SYSOUT statment is O(n) */