public class Main {

    public static void main(String[] args) {
//        int[] testInput = {-1,3,-4,5,1,-6,2,1};
//        int[] testInput =  {0, -2147483648, -2147483648};
//        int[] testInput = {2147483647, 2147483647, 2147483647};
//        int[] testInput = {1082132608, 0, 1082132608};
        int[] testInput = {5,1,0,2,7,0,6,6,1};
        int[] testInput1 = {3,3,3,7,3,3,3,3,4,4,7,1,2,3};
        int N=9,K=2;
//        int[] testInput1 =  {3};

        SolutionMaxCounters solver = new SolutionMaxCounters();
            int[] result = solver.solution(6,testInput1);
    }
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


}
