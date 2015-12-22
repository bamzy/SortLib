import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bamdad on 12/19/2015.
 */
public class SolutionMaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        long n = N, len = A.length;
        if (n > 100000 || n < 1 || len >100000 || len < 1)
            return null;
        int[] result = new int[N];
        Map<Integer, Integer> results = new HashMap<Integer, Integer>();
        long currentMax = 0, finalSum = 0;
        for (int i = 0; i < len; i++){
            if (A[i]<=N && A[i] >=1) {
//                result[A[i] - 1]++;
                if (results.get(A[i]) != null)
                    results.put(A[i],results.get(A[i])+1);
                else
                    results.put(A[i],1);
                if (results.get(A[i])> currentMax)
                    currentMax = results.get(A[i]);
            } else if (A[i] == n +1 ) {
                finalSum = finalSum + currentMax;
                currentMax = 0;
                results.clear();
            }
        }
        for (int i = 0; i < n; i++){
            if (results.get(i+1) != null )
                result[i] = (int)(results.get(i+1) + finalSum);
            else
                result[i] = (int) finalSum;
        }
        return result;
    }
}
