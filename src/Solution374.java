

public class Solution374 implements AutoCloseable {

	public static void main(String[] args) throws Exception {
		try (Solution374 o = new Solution374()) {
			System.out.println(o.guessNumber(2126753390));
		}
	}

	public int guessNumber(int n) {
		int start = 1, end = n;
		int mid = start + (end - start) / 2;

		while (!(guess(mid) == 0)) {

			mid = start + (end - start) / 2;

			if (guess(mid) == -1)
				end = mid - 1;
			if (guess(mid) == 1)
				start = mid + 1;
		}

		return mid;
	}

	int guess(int num) {
		int g = 1702766719;
		if (num < g)
			return 1;
		if (num > g)
			return -1;
		return 0;
	}

	@Override
	public void close() throws Exception {
	}
}
