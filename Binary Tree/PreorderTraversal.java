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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> st=new  Stack<>();
        List<Integer> list=new ArrayList<>();
        while(true)
        {
            while(root!=null)
            {
                st.push(root);
                list.add(root.val);
                root=root.left;
            }
            if(st.empty())
                break;
            root=st.pop();
            root=root.right;
        }
        return list;
    }
}