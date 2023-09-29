import java.util.*;

/**
 * 3. 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력한다.
 * - 문장은 영어 알파벳으로만 이뤄져있다.
 * - 가장 긴 단어가 여러 개일 경우 가장 앞쪽에 위치한 단어를 출력한다.
 */
public class Solution03 {
    public String solution(String str) {
        String answer = "";

        String[] strArray = str.split(" ");

        for (String s : strArray) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution03 S = new Solution03();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        System.out.print(S.solution(str));
    }
}
