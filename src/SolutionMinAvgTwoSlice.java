/**
 * Created by bamdad on 12/20/2015.
 */
public class SolutionMinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long len = A.length;
        if (len<2 || len >100000)
            return -1;
        long sum=0;
        int start=0,end=(int)len-1;
        for (int i : A) {
            sum = sum + i;
        }
        boolean endFix=false,startFix = false;
        for (int i : A) {
            if (i>10000 || i < -10000)
                return -1;
            if (  A[start] <=  A[end] && !endFix )
                if (sum-A[end]<sum) {
                    sum = sum - A[end];
                    end--;
                }
                else
                    endFix =true;
            else
                if (sum - A[start]< sum){
                    sum = sum - A[start];
                    start++;
                }
                else
                    startFix = true;
            if (end-start == 1 || (endFix && startFix ) )
                break;
        }
        return start;
    }
}
