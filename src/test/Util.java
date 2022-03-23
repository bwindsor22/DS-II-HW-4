package test;

import main.Node;

public class Util {
    /**
     *              10
     *                  14
     *                     16
     *                        18
     *                           20
     */
    public static Node getTree0() {
        Node root = new Node(10, null, new Node(14, null,
                new  Node(16, null, new Node(18, null, new Node(20)))));
        return root;
    }

    /**
     *              10
     *         14
     *     16
     */
    public static Node getTree1() {
        Node root = new Node(10, new Node(14, new Node(16), null), null);
        return root;
    }

    /**
     *              10
     *      6             14
     * 4       8      12      16
     *              11  13
     *
     */
    public static Node getTree2() {

        Node subtree1 = new Node(6, new Node(4), new Node(8));
        Node subtree2 = new Node(12, new Node(11), new Node(13));
        Node subtree3 = new Node(14, subtree2, new Node(16));

        Node root = new Node(10, subtree1, subtree3);
        return root;
    }

    /**
     *              10
     *      6             14
     * 1       8       12      16
     *   50           1  0
     * 2   4
     */
    public static Node getTree3() {
        Node subtree0 = new Node(50, new Node(2), new Node(4));
        Node subtree1 = new Node(6, subtree0, new Node(8));
        Node subtree2 = new Node(12, new Node(1), new Node(0));
        Node subtree3 = new Node(14, subtree2, new Node(16));

        Node root = new Node(10, subtree1, subtree3);
        return root;
    }

}
