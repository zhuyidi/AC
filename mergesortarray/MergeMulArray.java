package mergesortarray;

/**
 * Created by dela on 3/17/18.
 */
public class MergeMulArray {
    /**
     * @param arrays: k sorted integer arrays
     * @return: a sorted array
     */
    public int[] mergekSortedArrays(int[][] arrays) {
        // write your code here

        if (arrays.length == 1) {
            return arrays[0];
        }

        int[] newArr = merge(arrays[0], arrays[1]);

        int i = 2;
        while (i < arrays.length) {
            newArr = merge(newArr, arrays[i++]);
        }

        return newArr;
    }

    public int[] merge(int[] A, int[] B) {
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
