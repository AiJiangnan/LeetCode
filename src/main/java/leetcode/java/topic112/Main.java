package leetcode.java.topic112;

/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum。
 * <p>
 * 判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和targetSum。
 * 如果存在，返回true；否则，返回false。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class Main {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
