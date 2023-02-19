import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNonRepeatedTest {

	// {1, 2, 3, 4, 5, 1 4}
	public static void main(String[] args) {

		// {1, 2, 3, 4, 5, 1 4}
		// {1, 1, 2, 3, 4, 4, 5}

		/*
		 * List<Integer> res = new ArrayList<>();
		 * 
		 * for(int i = 0 ; i < arry.length ; i++) {
		 * 
		 * if(arry[i] != arry[i + 1 ]) { res.add(arry[i]);//
		 * System.out.println("not repeated"); }else { i++; } } System.out.println(res);
		 */

		//int[] arry = { 1, 1, 2, 3, 4, 4, 5 };

		List<Integer> res = Arrays.asList( 1, 2, 3, 4, 5, 1, 4);
		
		List<Integer> sortedRes= res.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedRes);
		
	}

}
