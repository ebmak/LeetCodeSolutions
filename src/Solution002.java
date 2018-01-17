

public class Solution002 {

	public static void main(String[] args) {

		new Solution002().test();

	}

	public void test() {
		ListNode t1 = new ListNode(9);
		ListNode l1 = t1;
		for (int i = 0; i < 99; i++) {
			t1.next = new ListNode(9);
			t1 = t1.next;
		}
		ListNode l2 = new ListNode(1);

		ListNode node = addTwoNumbers(l1, l2);

		System.out.print("[");
		while (node != null) {
			System.out.print(node.val);
			node = node.next;
		}
		System.out.print("]");

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode root = new ListNode(-1);
		ListNode iterator = root;
		ListNode n1 = l1, n2 = l2;
		int carry = 0;
		while (n1 != null || n2 != null || carry == 1) {
			int sum = 0;
			if (n1 != null) {
				sum += n1.val;
				n1 = n1.next;
			}
			if (n2 != null) {
				sum += n2.val;
				n2 = n2.next;
			}

			sum += carry;
			carry = sum / 10;

			int mod = sum % 10;
			iterator.next = new ListNode(mod);
			iterator = iterator.next;
		}

		return root.next;
	}

}
