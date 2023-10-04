import java.util.*;

/**
 * 7. 회문 문자열 이면 YES 아니면 NO
 */
public class Solution07 {
    public String solution(String str) {
        String answer = "";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int lPos = 0, rPos = str.length() - 1;

        while(lPos < rPos) {
            if (charArray[lPos] == charArray[rPos]) {
                answer = "YES";
                lPos++;
                rPos--;
            } else {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution07 S = new Solution07();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        System.out.print(S.solution(str));
    }
}
