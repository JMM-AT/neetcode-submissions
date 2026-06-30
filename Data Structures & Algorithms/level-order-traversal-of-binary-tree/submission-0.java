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
    public List<List<Integer>> levelOrder(TreeNode root) {

        
        List<List<Integer>> solution=new ArrayList<>();
        if (root==null)
            return solution;
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while(queue.size()!=0){
            List currentLevel=new ArrayList();
            int taille=queue.size();
            for(int i=0 ; i<taille; i++){
                TreeNode noeud=queue.poll();
                if(noeud.left!=null) queue.add(noeud.left);
                if(noeud.right!=null) queue.add(noeud.right);
                currentLevel.add(noeud.val);
            }
            solution.add(currentLevel);
        }
        return solution;
    }
}
