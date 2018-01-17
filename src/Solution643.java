

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution643 {

	public static void main(String[] args) {
		Solution643 o = new Solution643();
		System.out.println(o.findMaxAverage(new int[] { 5 }, 1));
	}

	public double findMaxAverage(int[] nums, int k) {

		List<Integer> results = new ArrayList<Integer>();

		for (int i = 0; i < nums.length - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += nums[j];
			}
			results.add(sum);
		}

		return (double) Collections.max(results) / k;
	}
}
