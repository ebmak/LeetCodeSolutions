

import java.util.List;

public class Solution751 {

	public List<String> ipToCIDR(String ip, int n) {

		String[] ipsStrList = ip.split(",");
		int length = ipsStrList.length;
		int[] ips = new int[length];
		for (int i = 0; i < length; i++)
			ips[i] = Integer.parseInt(ipsStrList[i]);

		for (int j = 0; j < n; j++) {
			int t = ips[length - 1] + 1;
			if (t > 255) {

			}
		}

		return null;
	}
}
