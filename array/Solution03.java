import java.util.Scanner;

public class Solution03 {
	public static void main(String[] args) {
		Solution03 S = new Solution03();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		int[] b = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < cnt; i++) {
			b[i] = sc.nextInt();
		}

		for (char c : S.solution(a, b).toCharArray()) {
			System.out.println(c);
		}
	}

	private String solution(final int[] a, final int[] b) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			int temp = a[i] - b[i];
			if (temp == 0) {
				sb.append("D");
				continue;
			}

			if (temp == 1 || temp == -2) {
				sb.append("A");
				continue;
			}

			if (temp == 2 || temp == -1) {
				sb.append("B");
			}
		}
		return sb.toString();
	}
}
