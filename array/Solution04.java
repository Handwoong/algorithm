import java.util.*;

public class Solution04 {

	public static void main(String[] args) {
		Solution04 S = new Solution04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(S.solution(n));
	}

	private String solution(final int n) {
		StringBuilder sb = new StringBuilder();
		int[] nums = new int[n];

		for (int i = 0; i < 2; i++) {
			nums[i] = 1;
			sb.append(nums[i]).append(" ");
		}

		for (int i = 2; i < n; i++) {
			nums[i] = nums[i - 2] + nums[i - 1];
			sb.append(nums[i]).append(" ");
		}
		return sb.toString().trim();
	}

}
