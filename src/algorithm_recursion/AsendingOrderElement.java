package algorithm_recursion;

/*write recurrsion programe to print element in decending order
 * like eg. 1 2 3 ......
 * 
 * */
public class AsendingOrderElement {

	public void fun2(int n) {

		if (n > 0) {
			fun2(n - 1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {

		int x = 3;

		new AsendingOrderElement().fun2(x);
	}

}
/* Time Complexity for SYSOUT statment is O(n) */