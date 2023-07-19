package cn.leetcode.java;

/**
 * @desc : https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @author : cm
 * @createTime : 2020-7-2 16:34:53
 * @version : v1.0
 */
public class _700_二叉搜索树中的搜索 {

    public static void main(String[] args) {
        _700_二叉搜索树中的搜索 p = new _700_二叉搜索树中的搜索();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(p.searchBST(root, 2).val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val) {
            return root;
        }
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

}