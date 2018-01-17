

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution001 {

	public static void main(String[] args) {

		Solution001 o = new Solution001();
		System.out.println(Arrays.toString(o.twoSum(new int[] { 3, 2, 4 }, 6)));
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		return null;
	}
}
