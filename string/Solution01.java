import java.util.*;

/**
 * 1. 문자열을 입력 받아 문자 찾기
 * - 첫번째 줄에 문자열을 입력받는다.
 * - 두번째 줄에 문자를 입력받는다.
 * - 대소문자를 구분하지 않는다.
 * - 찾은 문자의 개수를 출력한다.
 */
public class Solution01 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution01 S = new Solution01();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(S.solution(str, c));
    }
}