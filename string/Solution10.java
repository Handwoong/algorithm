import java.util.*;

/**
 * 10. 가장 짧은 문자거리
 */
public class Solution10 {
    public String solution(String str, char c) {
        int[] answer = new int[str.length()];
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                targetList.add(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int temp = -1;
            for (Integer j : targetList) {
                int d = Math.abs(j - i);
                if (temp == -1) {
                    temp = d;
                    continue;
                }

                if (temp > d) {
                    temp = d;
                }
            }
            answer[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String args[]) {
        Solution10 S = new Solution10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);
        
        System.out.print(S.solution(str, c));
    }
}
