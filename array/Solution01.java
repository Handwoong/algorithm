import java.util.*;

public class Solution01 {
	public static void main(String[] args) {
		Solution01 S = new Solution01();
		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		int[] arr = new int[my];
		for (int i = 0; i < my; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(S.solution(my, arr));
	}

	public String solution(int my, int[] target) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		int temp = target[0];
		sb.append(target[0] + " ");
		for (int i = 1; i < my; i++) {
			if (temp < target[i]) {
				sb.append(target[i] + " ");
			}
			temp = target[i];
		}
		answer = sb.toString().trim();
		return answer;
	}
}
