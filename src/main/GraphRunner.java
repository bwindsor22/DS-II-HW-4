package main;

import java.util.*;

class GNode {
    int val;
    boolean visited = false;
    List<GNode> children = new ArrayList<>();

    public GNode(int val) {
        this.val = val;
    }

    public void addChild(GNode node) {
        this.children.add(node);
    }

    public List<GNode> getChildren() {
        return this.children;
    }
}

class Graph {
    Map<Integer, GNode> nodes = new HashMap<>();

    Graph(int numberOfNodes) {
        for(int i = 0; i < numberOfNodes; i ++) {
            nodes.put(i, new GNode(i));
        }
    }

    void addEdge(int firstNodeNumber, int secondNodeNumber) {
        GNode firstNode = nodes.get(firstNodeNumber);
        GNode secondNode = nodes.get(secondNodeNumber);

        firstNode.addChild(secondNode);
        secondNode.addChild(firstNode);
    }

    GNode getNode(int nodeNumber) {
        return nodes.get(nodeNumber);
    }
}


// Modified from https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
class GraphRunner
{
    void BFS(GNode start)
    {

        // Create a queue for BFS
        LinkedList<GNode> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        start.visited = true;
        queue.add(start);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            start = queue.poll();
            System.out.print(start.val + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for(GNode n: start.getChildren())
            {
                if (!n.visited)
                {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to run
    public static void main(String args[])
    {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(0, 6);


        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 0)");

        new GraphRunner().BFS(g.getNode(0));
    }
}