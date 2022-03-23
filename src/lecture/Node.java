package lecture;


public class Node{
    Integer val;
    Node left;
    Node right;
    Node(Integer val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    Node(Integer val) {
        this.val = val;
    }
}
