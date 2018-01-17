

public class Solution420 {

	public static void main(String[] args) {

		Solution420 o = new Solution420();
		System.out.println(o.strongPasswordChecker("ABABABABABABABABABAB1"));
		System.out.println(o.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaa"));
		System.out.println(o.strongPasswordChecker("1010101010aaaB10101010"));
		System.out.println(o.strongPasswordChecker("aaa123"));
		System.out.println(o.strongPasswordChecker("aaa111"));
	}

	public int strongPasswordChecker(String s) {

		int exp = 0;
		if (s.length() < 6)
			return 6 - s.length();
		if (s.length() > 20)
			exp = s.length() - 20;

		char _A = 'A';
		char _a = 'a';
		char _0 = '0';

		int join = 0;
		for (int i = 2; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
				int continuous = 3;
				while (i + 1 < s.length() && s.charAt(i) == s.charAt(++i)) {
					continuous++;
					if (i + 1 == 20)
						exp -= 1;
				}
				join += continuous / 3;
			}
		}

		int change = 3;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= _A && s.charAt(i) <= (_A + 25)) {
				change--;
				break;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= _a && s.charAt(i) <= (_a + 25)) {
				change--;
				break;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= _0 && s.charAt(i) <= (_0 + 9)) {
				change--;
				break;
			}
		}

		return Math.max(change, join) + exp;
	}
}