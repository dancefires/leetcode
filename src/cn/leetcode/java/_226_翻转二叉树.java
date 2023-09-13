package cn.leetcode.java;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @desc : https://leetcode.cn/problems/invert-binary-tree/
 * @author : cm
 * @createTime : 2023-9-13 17:17:23
 * @version : v1.0
 */
public class _226_翻转二叉树 {

    public class TreeNode {
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

    // 前序遍历
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        // 交换左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        // 递归调用
        invertTree1(root.left);
        invertTree1(root.right);
        return root;
    }

    // 中序遍历
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return root;
        }
        // 递归调用
        invertTree2(root.left);
        invertTree2(root.right);
        // 交换左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }

    // 后序遍历
    public TreeNode invertTree3(TreeNode root) {
        if (root == null) {
            return root;
        }
        // 递归调用
        invertTree3(root.left);
        // 交换左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        // 递归调用
        invertTree3(root.left);
        return root;
    }

    // 层序遍历
    public TreeNode invertTree4(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // 将根节点入队
        queue.offer(root);
        // 迭代
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // 交换左右子树
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) {
                // 将左节点入队
                queue.offer(node.left);
            }
            if (node.right != null) {
                // 将右节点入队
                queue.offer(node.right);
            }
        }
        return root;
    }

}