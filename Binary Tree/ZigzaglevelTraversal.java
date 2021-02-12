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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
            return arr;
        q.add(root);
        int flag=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int i=0;
            List<Integer> a=new ArrayList<Integer>();
            if(flag==0)
            {
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
                flag=1;
            }
            else{
                while(i<size)
            {
                TreeNode t=q.remove();
                a.add(0,t.val);
                
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                i++;
            }
                flag=0;
            }
            
            arr.add(a);
            
        }
        return arr;
    }
}