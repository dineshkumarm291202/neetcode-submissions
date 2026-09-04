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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        ser(root,sb);
        return sb.toString();
    }
    public StringBuilder ser(TreeNode root,StringBuilder sb){
          if(root==null){
            sb.append("null,");
            return sb;
        }
        sb.append(root.val).append(",");
        ser(root.left,sb);
        ser(root.right,sb);
        return sb;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        int[] index = {0};
        return deser(str,index);
    }
    public TreeNode deser(String[] values,int[] index){
        if(values[index[0]].equals("null")){
            index[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(values[index[0]]));
        index[0]++;
        node.left = deser(values,index);
        node.right = deser(values,index);
        return node;
    }
}
