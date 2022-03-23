package lecture;


public class SumTree {
    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int sum_left = sum(node.left);
        int sum_right = sum(node.right);
        return node.val + sum_left + sum_right;
    }
    public static void main(String[] args) {
        Node root = new Node(2, new Node(1), new Node(3));
        System.out.println(SumTree.sum(root)); // 6

        root = new Node(2, new Node(1), new Node(4, new Node(3), new Node(5)));
        System.out.println(SumTree.sum(root)); // 15
    }
}
