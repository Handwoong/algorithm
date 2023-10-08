import java.util.*;

public class Solution12 {
	public static void main(String[] args) {
		Solution12 S = new Solution12();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str = sc.next();
		System.out.print(S.solution(cnt, str));
	}

	public String solution(int cnt, String str) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		int start = 0;
		for (int i = 0; i < cnt; i++) {
			String temp = str.substring(start, start + 7);
			start += 7;
			temp = temp.replaceAll("#", "1");
			temp = temp.replaceAll("[*]", "0");
			sb.append((char) Integer.parseInt(temp, 2));
		}

		answer = sb.toString();
		return answer;
	}
}
