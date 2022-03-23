package lecture;

import java.util.HashSet;
import java.util.Set;

public class SourceLeafPaths {

    Set<String> results = new HashSet<>();

    void allPaths(Node root, String pathSoFar){
        if (root == null) {
            return;
        }
        pathSoFar += root.val;
        if(root.left == null && root.right == null) {
            this.results.add(pathSoFar);
        } else {
            allPaths(root.left, pathSoFar);
            allPaths(root.right, pathSoFar);
        }
    }

    Set<String> findPaths(Node root) {
        this.results.clear();
        allPaths(root, "");
        return this.results;
    }


    public static void main(String[] args) {
        Node root = new Node(2, new Node(1), new Node(3));
        System.out.println(new SourceLeafPaths().findPaths(root)); // [21, 23]

        root = new Node(2, new Node(1), new Node(4, new Node(3), new Node(5)));
        System.out.println(new SourceLeafPaths().findPaths(root)); // [21, 243, 245]
    }
}
