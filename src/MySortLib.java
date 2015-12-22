import java.util.Arrays;

/**
 * Created by bamdad on 12/22/2015.
 */
public class MySortLib {
    int[] mergeSort(int[] input) {
        return divideAndCompare(input);
    }

    private int[] divideAndCompare(int[] input) {
        if (input.length == 2 ){
            if (input[0] > input[1]) {
                int temp = input[0];
                input[0] = input[1];
                input[1] = temp;
            }
            return input;
        }
        if (input.length == 1){
            return input;
        }
        int center=0;
        if (input.length % 2==1)
            center=input.length/2;
        else
            center=input.length/2-1;
        int[] firstHalf = divideAndCompare(Arrays.copyOfRange(input,0,center+1));
        int[] secondHalf = divideAndCompare(Arrays.copyOfRange(input,center+1,input.length));
        return merge(firstHalf,secondHalf,input.length);

    }

    private int[] merge(int[] firstHalf, int[] secondHalf,int len) {
        int[] result = new int[len];
        int firstPointer=0,secondPointer=0;
        for (int i=0;i<len;i++) {
            if (firstPointer == firstHalf.length){
                result[i] = secondHalf[secondPointer];
                secondPointer++;
            }
            else if (secondPointer == secondHalf.length) {
                result[i] = firstHalf[firstPointer];
                firstPointer++;
            }
            else if (firstPointer<firstHalf.length && secondPointer<secondHalf.length && firstHalf[firstPointer] > secondHalf[secondPointer]) {
                result[i] = secondHalf[secondPointer];
                secondPointer++;
            }
            else if (firstPointer<firstHalf.length && secondPointer<secondHalf.length && firstHalf[firstPointer] <= secondHalf[secondPointer]) {
                result[i] = firstHalf[firstPointer];
                firstPointer++;
            }
        }
        return result;
    }
}
