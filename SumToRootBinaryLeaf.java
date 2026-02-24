/**
 *Problem Description:
 * You are given the root of a binary tree where each node has a value 0 or 1.
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * Return the sum of these numbers.
 */





public class SumToRootBinaryLeaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution
    {
        public int sumRootToLeaf(TreeNode root)
        {
            return dfs(root,"");
        }

        public int dfs(TreeNode root,String current)
        {
            if(root == null)
            {
                return 0;
            }

            current = current + root.val;

            if(root.left == null && root.right == null)
            {
                System.out.println("Final Current: " + current);
                return Integer.parseInt(current, 2);
            }
            int left = dfs(root.left,current);
            int right = dfs(root.right,current);
            return left+right;
        }

    }

}



