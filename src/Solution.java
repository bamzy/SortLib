

/**
 * Created by Bamdad on 9/5/2015.
 */
class Solution {
    public int solve(int[] A) {

        if ( A.length == 0 ){
            return -1;

        }
        if ( A.length == 1 ){
            return 0;
        }
        int inputLength = A.length;
        long [] afterSum = new long[inputLength];
        long [] beforeSum = new long[inputLength];

        long afterSumIndex0 = 0;
        for (int i = 1; i < inputLength; i++)
            afterSumIndex0 += A[i];
        afterSum[0] = afterSumIndex0;
        beforeSum[0] = 0;
        for (int i = 1; i < inputLength; i++) {
            afterSum[i] = afterSum[i - 1] - A[i];
            beforeSum[i] = beforeSum[i - 1] + A[i - 1];

        }

        for (int i = 0; i < inputLength; i++) {
            if (beforeSum[i] == afterSum[i]) {

                return i;
            }
        }

        return -1;

    }
}