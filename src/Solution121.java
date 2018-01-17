

public class Solution121 {
	public static void main(String[] args) {
		Solution121 o = new Solution121();

		System.out.println(o.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));

	}

	public int maxProfit(int[] prices) {

		if (prices.length == 0)
			return 0;
		int min = prices[0], profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}

			profit = Math.max(profit, prices[i] - min);
		}

		return profit;
	}
}
