/*
Problem: 
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
*/

/*
Intuition
After understanding the problem I knew developing a recursive algorithm would be the simplest approach. 
My algorithm would have to recursively navigate the entirety of the tree, subtract the value of the current node from the targetSum until I reach a leaf node and the current value of targetSum is 0.
*/

/*
Appraoch:
My approach involves: first checking if the current node is null, at which point it returns false. 
If the tree is not empty, I subtract the value of the current node from target sum and determine whether the current node is a leaf node (by checking if it has any children to its left or right) 
and determine whether the current value of the target sum is 0. 
If none of these conditions are met, the return statement of the method calls itself twice, the first method call passes the left child of the current node and the current value of the target sum as arguments 
and the second method call passes the right child of the current node and the current value of target sum as arguments. 
These two method calls are evaluated against each other using the XOR operator, as long as one of the method calls evaluates to true, the method returns true.
*/

/*
Complexity: 
Time complexity:
O(n)

Space complexity:
O(n)
*/

//Solution:
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        targetSum =- root.val;

        if(root.left == null && root.right == null && targetSum == 0) return true;

        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);


    }
}
