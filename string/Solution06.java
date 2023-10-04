import java.util.*;

/**
 * 6. 소문자로 된 하나의 문자열을 입력받고, 중복된 문자를 제거한다.
 */
public class Solution06 {
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String args[]) {
        Solution06 S = new Solution06();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        System.out.print(S.solution(str));
    }
}