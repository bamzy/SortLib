

/**
 * Created by Bamdad on 9/5/2015.
 */
class SolutionMissNum {
    public int solve(int[] A) {
        long length = A.length;
        long fullSum = ( (1+ (length + 1)) * (length+1)) /2;
        long missSum = 0L;
        for (int i=0;i<length;i++){
            missSum+= A[i];
        }
        return (int)(fullSum-missSum);

    }
}