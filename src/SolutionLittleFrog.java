/**
 * Created by Bamdad on 9/8/2015.
 */
public class SolutionLittleFrog {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        if (A.length == 0)
            return -1;
        if (X > A.length)
            return -1;
        long position = X;
        boolean[] fallen = new boolean[X];
        long arraySize = A.length;

        long duration = 0;
        boolean solutionExist = false;
        long result = -1;
        for (int i=0;i<arraySize;i++) {
            if (A[i] <= position && fallen[A[i]-1] == false) {
                fallen[A[i]-1] = true;
                duration = i;
            }
        }
        for (int i=0; i< position;i++)
            if (!(fallen[i]))
                return -1;
        return (int)duration;
    }
}
