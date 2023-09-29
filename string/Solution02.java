import java.util.*;

/**
 * 2. 대소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력한다.
 */
public class Solution02 {
    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);        
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution02 S = new Solution02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        System.out.print(S.solution(str));
    }
}
