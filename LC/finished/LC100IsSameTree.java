package finished;

import finished._TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LC100IsSameTree {
    /*

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pNodes=new LinkedList<>();
        pNodes.offer(p);
        while (!pNodes.isEmpty()){

        }
        return true;
    }

    boolean isSameNode(TreeNode p,TreeNode q){
        if (p.val==q.val&&p.left.val==q.left.val&&p.right.val==q.right.val){
            return true;
        }else return false;
    }





    public boolean isSameTreeLC(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTreeLC(p.left, q.left) && isSameTreeLC(p.right, q.right);
        }
    }

}
