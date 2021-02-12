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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s=new Stack<>();
        TreeNode prev=null;
        List<Integer> l=new LinkedList<>();
        if(root==null)
            return l;
        do{
            while(root!=null)
            {
                s.push(root);
                root=root.left;
            }
            while(root==null&&!s.isEmpty())
            {
                root=s.peek();
                if(root.right==null||root.right==prev)
                {
                    l.add(root.val);
                    s.pop();
                    prev=root;
                    root=null;
                }
                else{
                    root=root.right;
                }
            }
        }while(!s.isEmpty());
        return l;
    }
}