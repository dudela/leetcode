package aws.onlineassesment;

//https://leetcode.com/problems/subtree-of-another-tree/
public class SubTreeOfAnotherTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuilder sb = new StringBuilder();
        preOrder(s, sb);
        String sourcePreOrderString = sb.toString();

        sb = new StringBuilder();
        preOrder(t, sb);
        String targetPreOrderString = sb.toString();

        return sourcePreOrderString.contains(targetPreOrderString);
    }

    public void preOrder(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null");
            return;
        }

        sb.append('#').append(node.val);

        preOrder(node.left, sb);

        preOrder(node.right, sb);
    }
}
