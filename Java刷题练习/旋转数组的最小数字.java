package Java刷题练习;

/**
 * Created by dela on 3/31/18.
 */
public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int[] arr = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,
                9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,
                1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,
                4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
//        int[] arr = {6, 7, 8, 0, 1, 2, 3, 4, 5};
//        int[] arr = {1, 1, 1, 0};
        System.out.println(minNumberInRotateArray(arr));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int begin = 0;
        int end = array.length - 1;
        int mid = begin;    // mid默认为第一个元素(针对一个没有旋转的数组)

        // 正常情况下应该是第一个元素大于等于最后一个元素
        while (array[begin] >= array[end]) {
            mid = (begin + end) / 2;

            // 如果只剩最后两个元素, 而且第一个元素大于第二个元素, 那么第二个元素就是最小的
            // 所以直接返回第二个元素然后返回.
            if (end - begin == 1) {
                mid = end;
                break;
            }

            // 如果第一个元素小于等于中间的元素, 说明前半段数组是有序的,
            // 说明最小的数字在后半段, 就将begin指针移至mid.

            // 如果第一个元素大于中间的元素, 说明前半段不有序,
            // 说明最小的元素就再前半段, 就将end指针移至mid
            if (array[begin] <= array[mid]) {
                begin = mid;
            } else {
                end = mid;
            }
        }

        return array[mid];
    }
}
