package main;


public class Node {
    Integer val;
    Node left;
    Node right;
    public Node(Integer val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public Node(Integer val) {
        this.val = val;
    }
}
