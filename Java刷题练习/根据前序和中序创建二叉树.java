package Java刷题练习;

/**
 * Created by dela on 3/31/18.
 */
public class 根据前序和中序创建二叉树 {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(pre, in);
        printTree(root);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        return constructTree(pre, in, 0, pre.length-1, 0, in.length-1);
    }

    public static TreeNode constructTree(int[] pre, int[] in, int preBegin, int preEnd, int inBegin, int inEnd) {
        TreeNode root = new TreeNode(pre[preBegin]);
        root.left = null;
        root.right = null;

        // 当前序已经遍历到最后一个节点, 说明所有节点已经创建完
        if (preBegin == preEnd) {
            if (inBegin == inEnd && pre[preBegin] == in[inBegin]) {
                return root;
            }
        }

        // 在中序遍历中找到根结点的值, 然后将中序序列分为左右子树两个序列
        int i = inBegin;
        while (in[i] != pre[preBegin] && i != inEnd) {
            i++;
        }
        System.out.println("根节点为:" + in[i]);

        int leftLength = i - inBegin;
        System.out.println("左子树的长度:" + leftLength);
        int rightLength = inEnd - i;
        System.out.println("右子树的长度:" + rightLength);

        if (leftLength > 0) {
            System.out.println("构建左子树");
            System.out.println("preBegin:" + (preBegin+1));
            root.left = constructTree(pre, in, preBegin+1, preEnd, inBegin, i-1);
        }

        if (rightLength > 0) {
            System.out.println("构建右子树");
            System.out.println("preBegin:" + (preBegin+leftLength));
            root.right = constructTree(pre, in, preBegin+leftLength+1, preEnd, i+1, inEnd);
        }

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
