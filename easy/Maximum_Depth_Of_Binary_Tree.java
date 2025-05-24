/*
Intuition:
Initially, I tried to solve the problem by only traversing either the left or right subtree depending on which child existed. 
However, this approach was flawed because it didn’t account for all possible tree structures and would miss the actual maximum 
depth in cases where both children existed. I realized that I needed to explore both subtrees to get an accurate measure of the depth.
*/
/*
Approach:
This problem can be solved using recursion. 
The key idea is to compute the maximum depth of both left and right subtrees, and then add 1 for the current root node.
The base case is when the node is null, in which case we return 0. For any non-null node, 
we recursively compute the depth of its left and right subtrees and return the larger of the two plus one.
*/
/*
Complexity
Time complexity:
O(n), each node is visited once.

Space complexity:
In the worst case (unbalanced tree), the space used by the recursion stack will be the height h of the tree. 
In the average case for a balanced tree, this will be O(logn)
*/

//Code:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) 
            return 0;
        else 
            return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
        
    }
}
