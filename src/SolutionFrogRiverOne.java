/**
 * Created by bamdad on 12/18/2015.
 */
public class SolutionFrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        long x = X, remainingNodes = X;
        long length = A.length;
        if (x < 1 || x > 100000 || length < 1 || length > 100000 )
            return -1;
        boolean[] locations = new boolean[(int)length+1];
        for (int i=0;i<length+1;i++)
            locations[i]=false;

        for ( int i=0; i< length ; i++ ){
            if (A[i] <= x && A[i] < length && locations[A[i]] == false ){
                remainingNodes--;
                locations[A[i]] = true;
                if (remainingNodes == 0)
                    return i;
            }

        }
        return -1;
    }
}
