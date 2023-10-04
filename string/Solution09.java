import java.util.*;

/**
 * 9. 문자열에서 숫자만 추출하여 그 순서대로 자연수를 만든다.
 */
public class Solution09 {
    public int solution(String str) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                sb.append(c);
            }
        }

        answer = Integer.parseInt(sb.toString());
        return answer;
    }

    public static void main(String args[]) {
        Solution09 S = new Solution09();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        System.out.print(S.solution(str));
    }
}
