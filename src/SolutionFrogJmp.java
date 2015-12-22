

/**
 * Created by Bamdad on 9/5/2015.
 */
class SolutionFrogJmp {
    public int solve(int X, int Y, int D) {

        if (X > Y || D == 0)
            return -1;
        long distance = Y - X;
        long step = D;
        if (distance % step != 0)
            return (int)Math.abs(distance/step)+1;
        else
            return (int)Math.abs(distance/step);
    }
}