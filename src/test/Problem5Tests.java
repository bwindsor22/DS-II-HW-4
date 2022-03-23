package test;

import main.CNode;
import main.CTree;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Problem5Tests {
    @Test
    public void testTree0() {
        CNode node = new CNode("+", new CNode("1"), new CNode("2"));

        assertEquals(3, CTree.compute(node));
    }

    @Test
    public void testTree1() {
        CNode node = new CNode("*", new CNode("1"), new CNode("2"));

        assertEquals(2, CTree.compute(node));
    }

    @Test
    public void testTree3() {
        CNode subtree = new CNode("*", new CNode("3"), new CNode("2"));
        CNode node = new CNode("+", subtree, new CNode("2"));

        assertEquals(8, CTree.compute(node));
    }

    @Test
    public void testTree4() {
        CNode subtree1 = new CNode("*", new CNode("3"), new CNode("2"));
        CNode subtree2 = new CNode("*", new CNode("3"), new CNode("3"));
        CNode node = new CNode("+", subtree1, subtree2);

        assertEquals(15, CTree.compute(node));
    }


    @Test
    public void testTree5() {
        CNode subtree1 = new CNode("*", new CNode("3"), new CNode("+", new CNode("1"), new CNode("1")));
        CNode subtree2 = new CNode("*", new CNode("3"), new CNode("*", new CNode("1"), new CNode("3")));
        CNode node = new CNode("+", subtree1, subtree2);

        assertEquals(15, CTree.compute(node));
    }

}
