import java.util.Arrays;

/**
 * Created by bamdad on 12/19/2015.
 */
public class SolutionGenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        long len = P.length;
        int[] ifArray = new int[S.length()];
        int[] result = new int[(int)len];
        Arrays.fill(result,999);
        for (int i=0;i<S.length();i++) {
            if (S.charAt(i) == 'A')
                ifArray[i] = 1;
            else if (S.charAt(i) == 'C')
                ifArray[i] = 2;
            else if (S.charAt(i) == 'G')
                ifArray[i] = 3;
            else if (S.charAt(i) == 'T')
                ifArray[i] = 4;
        }
        long min;
        for (int i =0; i< len ; i++ ){
            min = 999;
            for (int j=P[i];j<Q[i];j++)
                if (ifArray[j]<min)
                    min = ifArray[j];
            result[i] = (int)min;
//            if (i==0 || P[i]> Q[i-1] || Q[i]<P[i-1]) {
//                for (int j = P[i]; j <= Q[i]; j++)
//                    if (ifArray[j] < min)
//                        min = ifArray[j];
//                result[i] = (int) min;
//            } else if (){
//
//            }
        }
        return result;
    }
}
