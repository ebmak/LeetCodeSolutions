

import java.util.ArrayList;
import java.util.List;

public class Solution215 {

	public static void main(String[] args) {
		System.out.println(new Solution215().findKthLargest(new int[] { -1, -1 }, 2));

	}

	public int findKthLargest(int[] nums, int k) {
		List<Integer> sort = new ArrayList<Integer>();
		int cur = Integer.MIN_VALUE;

		for (int j = 0; j < k; j++) {
			cur = Integer.MIN_VALUE;
			sort.add(cur);
		}

		return sort.get(k - 1);
	}
}
