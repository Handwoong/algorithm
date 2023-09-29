import java.util.*;

/**
 * 4. N개의 단어가 주어지면 각 단어를 뒤집어 출력한다.
 * - 첫 줄에 자연수 N(3 <= N <= 20)
 * - 두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어진다.
 * - 단어는 영어 알파벳으로 이루어져있다.
 * - N개의 단어를 입력한 순서대로 뒤집어 출력한다.  
 */
public class Solution04 {
    public String[] solution(int n, String[] strArray) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(strArray[i]);
            answer[i] = sb.reverse().toString();
            sb.setLength(0);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution04 S = new Solution04();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.next();
        }
        
        String[] answer = S.solution(n, strArray);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
