

public class Solution091 {

	public static void main(String[] args) {
		Solution091 o = new Solution091();
		System.out.println(o.numDecodings("1201"));
	}

	public int numDecodings(String s) {

		if (s.length() == 0) {
			return 0;
		}
		int n = s.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) != '0' ? 1 : 0;
		for (int i = 2; i <= n; i++) {
			int digit1 = s.charAt(i - 1) - '0';
			int digit2 = 10 * (s.charAt(i - 2) - '0') + digit1;
			if (digit1 >= 1 && digit1 <= 9) {
				dp[i] += dp[i - 1];
			}
			if (digit2 >= 10 && digit2 <= 26) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[n];
	}

}
