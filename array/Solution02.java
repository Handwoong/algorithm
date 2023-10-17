import java.util.Scanner;

public class Solution02 {
	public static void main(String[] args) {
		Solution02 S = new Solution02();
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int[] arr = new int[students];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(S.solution(arr));
	}

	private int solution(final int[] arr) {
		int answer = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp < arr[i]) {
				answer++;
				temp = arr[i];
			}
		}
		return answer;
	}
}
