package dailyCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Day4ListPath {
    public static void main(String[] args) {
        //solved in LeetCode
        TreeNode root = new TreeNode(1,
                new TreeNode(3,null,null),
                new TreeNode(2,null,
                        new TreeNode(5,null,null)));

        System.out.println(binaryTreePaths(root));
    }




    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        paths = treePath(paths, root, "");
        return paths;
    }

    public static List<String> treePath(List<String> list, TreeNode node, String path) {
        if (path.equals("")) path = String.valueOf(node.val);
        else path = path + "->" + node.val;
        if (node.left == null && node.right == null) {
            list.add(path);
        }

        if (node.left != null) {
            treePath(list, node.left, path);
        }
        if (node.right != null) {
            treePath(list, node.right, path);
        }
        return list;
    }
}
