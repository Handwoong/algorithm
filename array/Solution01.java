import java.util.*;

public class Solution01 {
	public static void main(String[] args) {
		Solution01 S = new Solution01();
		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		sc.nextLine();
		String target = sc.nextLine();
		System.out.print(S.solution(my, target));
	}

	public String solution(int my, String target) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		String[] targetArr = target.split(" ");

		for (String s : targetArr) {
			int temp = Integer.parseInt(s);
			if (my <= temp) {
				sb.append(temp + " ");
			}
		}
		answer = sb.toString();
		return answer;
	}
}
