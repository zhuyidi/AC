package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 3/29/18.
 */
public class 在递增二维数组中查找数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean mark = find(num, arr);
        System.out.println(mark);
    }

    public static boolean find(int target, int[][] array) {
        boolean mark = false;
        if (array != null && array[0].length > 0 && array.length > 0) {
            int row = 0;
            int col = array[0].length-1;

            while (row <= array.length-1 && col >= 0) {
                if (target == array[row][col]) {
                    mark = true;
                    return mark;
                } else if (target > array[row][col]) {
                    // 如果大于的话, 那就应该向下一行
                    row++;
                } else if (target < array[row][col]) {
                    // 如果小于的话,那就应该向左一列
                    col--;
                }
            }
            return mark;
        }
        return mark;
    }
}
