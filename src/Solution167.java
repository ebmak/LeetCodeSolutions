

import java.util.Arrays;

public class Solution167 {

	public static void main(String[] args) {

		Solution167 o = new Solution167();
		System.out.println(Arrays.toString(o.twoSum(new int[] { 3, 2, 4 }, 6)));
	}

	public int[] twoSum(int[] numbers, int target) {
		int lo = 0, hi = numbers.length - 1;
		while (lo < hi) {
			if (numbers[lo] + numbers[hi] == target)
				break;

			if (numbers[lo] + numbers[hi] < target)
				lo++;
			else
				hi--;

			if (hi == lo)
				hi++;
		}

		return new int[] { lo + 1, hi + 1 };
	}

}
