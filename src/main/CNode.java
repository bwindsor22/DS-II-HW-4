package main;


public class CNode {
    String val;
    CNode left;
    CNode right;
    public CNode(String val, CNode left, CNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public CNode(String val) {
        this.val = val;
    }
}
