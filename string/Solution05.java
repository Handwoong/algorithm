import java.util.*;

/**
 * 5. 영어 알파벳과 특수문자로 이루어진 문자열이 주어지면 알파벳만 뒤집는다.
 */
public class Solution05 {
    public String solution(String str) {
        String answer = "";
        char[] cArray = str.toCharArray();
        int posL = 0, posR = str.length() - 1;

        while(posL < posR) {
            if (!Character.isAlphabetic(cArray[posL])) {
                posL++;
                continue;
            }

            if (!Character.isAlphabetic(cArray[posR])) {
                posR--;
                continue;
            }

            char curL = cArray[posL];
            char curR = cArray[posR];

            cArray[posL] = curR;
            cArray[posR] = curL;

            posL++;
            posR--;
        }

        answer = String.valueOf(cArray);
        return answer;
    }

    public static void main(String args[]) {
        Solution05 S = new Solution05();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        System.out.print(S.solution(str));
    }
}
