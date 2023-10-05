import java.util.*;

/**
 * 10. 가장 짧은 문자거리
 */
public class Solution10 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
	int p = 1000;

	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == c) {
			p = 0;
		} else {
			p++;
		}
		answer[i] = p;
	}

	p = 1000;
	for (int i = str.length() - 1; i >= 0; i--) {
		if (str.charAt(i) == c) {
			p = 0;
		} else {
			p++;
		}
		
		answer[i] = Math.min(answer[i], p);
	}

        return answer;
    }

    public static void main(String args[]) {
        Solution10 S = new Solution10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);
    
	for (int x : S.solution(str, c)) {
		System.out.print(x + " ");
	}
    }
}
