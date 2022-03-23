package test;

import main.MinBST;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Tests {

    @Test
    public void testTree0() {
        assertEquals(10, new MinBST().findMin(Util.getTree0()));
    }

    @Test
    public void testTree1() {
        assertEquals(16, new MinBST().findMin(Util.getTree1()));
    }

    @Test
    public void testTree2() {
        assertEquals(4, new MinBST().findMin(Util.getTree2()));
    }
}
