import java.util.*;
class Solution {
    public int solution(int[][] targets) {
            Arrays.sort(targets, (o1, o2) -> {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                else return o1[1] - o2[1];
            });

            int end = 0;
            int answer = 0;
            for (int[] target : targets) {
                if (target[0] >= end) {
                    end = target[1];
                    answer++;
                }
            }
        return answer;
    }
}