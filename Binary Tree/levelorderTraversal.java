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
        
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
            return arr;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            int i=0;
            List<Integer> a=new ArrayList<Integer>();
            while(i<size)
            {
                TreeNode t=q.remove();
                a.add(t.val);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                i++;
            }
            arr.add(a);
            
        }
        return arr;
    }
}