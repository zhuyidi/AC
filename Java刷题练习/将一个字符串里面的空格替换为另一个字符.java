package Java刷题练习;

import java.util.Scanner;

/**
 * Created by dela on 3/30/18.
 */
public class 将一个字符串里面的空格替换为另一个字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println(replaceSpace(sb));
    }

    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        return s.replaceAll(" ", "%20");
    }
}
