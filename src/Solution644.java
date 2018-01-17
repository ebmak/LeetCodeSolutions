

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution644 {

	public static void main(String[] args) {
		Solution644 o = new Solution644();
		System.out.println(o.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
	}

	public double findMaxAverage(int[] nums, int k) {

		List<Double> results = new ArrayList<Double>();

		for (int i = 0; i < nums.length - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++)
				sum += nums[j];
			double left = (double) sum;

			sum = 0;
			int rightMax = 0;
			int rightIndex = 0;
			for (int j = i + k; j < nums.length; j++) {
				sum += nums[j];
				if (sum > rightMax) {
					rightIndex = j;
					rightMax = sum;
				}
			}

			double total;
			if (rightMax > 0) {
				total = (left + rightMax) / (k + rightIndex + 1);
			} else {
				total = left / k;
			}

			results.add(total);
		}

		return Collections.max(results);
	}
}
