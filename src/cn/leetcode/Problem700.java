package cn.leetcode;

/**
 * 
  *给定二叉搜索树（BST）的根节点和一个值。 
  *你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 
  *如果节点不存在，则返回 NULL。
  *例如，
  *给定二叉搜索树:
 *        4
 *       / \
 *      2   7
 *     / \
 *    1   3
  *和值: 2
 *
  *你应该返回如下子树:
 *      2     
 *     / \   
 *    1   3
  *在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 */
public class Problem700 {

    public static void main(String[] args) {
        Problem700 p = new Problem700();
        TreeNode root = p.new TreeNode(4);
        root.left = p.new TreeNode(2);
        root.right = p.new TreeNode(7);
        root.left.left = p.new TreeNode(1);
        root.left.right = p.new TreeNode(3);
        System.out.println(p.searchBST(root, 2).val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val)
            return root;

        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

}