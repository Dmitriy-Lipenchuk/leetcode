public class Task104MaximumDepthOfBinaryTree {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = root.left == null ? 0 : maxDepth(root.left);
            int right = root.right == null ? 0 : maxDepth(root.right);


            return Math.max(left, right) + 1;
        }
    }

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
}
