package array.problems;

import java.util.ArrayList;
import java.util.List;

public class Test20 {

	public static void main(String[] args) {
		

	}
	
	 public int singleNumber(int[] nums) {
		    List<Integer> no_duplicate_list = new ArrayList<>();

		    for (int i : nums) {
		    	
		      if (!no_duplicate_list.contains(i)) {
		        no_duplicate_list.add(i);
		      } else {
		        no_duplicate_list.remove(new Integer(i));
		      }
		    }
		    return no_duplicate_list.get(0);
		  }

}
