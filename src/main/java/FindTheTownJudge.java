import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {

    public static void main(String[] args) {
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        int n = 3;
        System.out.println(findJudge(n, trust));

    }

    public static int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < trust.length; i++) {
            int[] elm = trust[i];
            if (!map.containsKey(elm[1])) {
                map.put(elm[1], 1);
            } else {
                map.put(elm[1], map.get(elm[1]) + 1);
            }

        }
        if ((n - 1) == Collections.max(map.values())) {
            return n;
        } else {
            return -1;
        }

    }
}
