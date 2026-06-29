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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p==null || q==null ||p.val!=q.val)
            if(p==null && q==null)
                return true;
        else
                return false;
                    
        if(p.left!=null || q.left!=null)
            if(p.left!=null && q.left!=null)
                return isSameTree( p.left,  q.left);
            else
                return false;
        if(p.right!=null || q.right!=null)
            if(p.right!=null && q.right!=null)
                return isSameTree( p.right,  q.right);
            else
                return false;
        return true;

    }
}
