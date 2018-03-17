package mergesortarray;

/**
 * Created by dela on 3/17/18.
 */
public class MergeTwoArray {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[A.length + B.length];

        while(i != A.length && j != B.length) {
            if (A[i] < B[j]) {
                newArr[k++] = A[i++];
            } else {
                newArr[k++] = B[j++];
            }
        }

        if (i != A.length) {
            for (; i < A.length; i++) {
                newArr[k++] = A[i];
            }
        } else {
            for (; j < B.length; j++) {
                newArr[k++] = B[j];
            }
        }

        return newArr;
    }
}
