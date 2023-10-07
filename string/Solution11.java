import java.util.*;

public class Solution11 {
	public static void main(String[] args) {
		Solution11 S = new Solution11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(S.solution(str));
	}

	public String solution(String str) {
		String answer = "";
		str = str + " ";
		StringBuilder sb = new StringBuilder();

		int cnt = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				sb.append(str.charAt(i));
				if (cnt > 1) {
					sb.append(cnt);
				}
				cnt = 1;
			}
		}

		answer = sb.toString();
		return answer;
	}
}
