

public class Solution278 {

	public static void main(String[] args) {
		Solution278 o = new Solution278();
		System.out.println(o.firstBadVersion(2126753390));
	}

	// it is not a good binary search code sample
	public int firstBadVersion(int n) {

		int leftBound = 1;
		int rightBound = n;

		if (isBadVersion(1))
			return 1;

		int binaryPoint = (int) ((leftBound + rightBound) / 2);
		if (binaryPoint == leftBound)
			binaryPoint += 1;

		while (!(isBadVersion(binaryPoint) && !isBadVersion(binaryPoint - 1))) {

			binaryPoint = (int) ((leftBound + rightBound) / 2);
			if (binaryPoint == leftBound)
				binaryPoint += 1;

			if (isBadVersion(binaryPoint))
				rightBound = binaryPoint;
			else
				leftBound = binaryPoint;
		}

		return binaryPoint;
	}

	boolean isBadVersion(int version) {
		if (version >= 1702766719)
			return true;

		return false;
	}

}
