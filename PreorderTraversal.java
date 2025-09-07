import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
     public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(preorderTraversal(root));
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public static void preorder(TreeNode root,List<Integer> res){
        if(root==null) return ;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
class TreeNode {
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