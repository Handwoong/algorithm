import java.util.*;

/**
 * 8. 팰린드롬 검사.
 * - 대소문자를 구분하지 않는다.
 * - 알파벳 이외의 문자는 무시한다.
 */
public class Solution08 {
    public String solution(String str) {
        String answer = "";
        String alphabetString = makeAlphabetString(str);
        char[] charArray = alphabetString.toCharArray();
        int lPos = 0, rPos = alphabetString.length() - 1;

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

    public String makeAlphabetString(String str) {
        String temp = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : temp.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Solution08 S = new Solution08();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        System.out.print(S.solution(str));
    }
}
