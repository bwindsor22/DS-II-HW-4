package test;

import main.MinPath;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class Problem3Tests {

    @Test
    public void testTree0() {
        assertEquals(78, new MinPath().minPath(Util.getTree0()));

    }

    @Test
    public void testTree1() {
        assertEquals(40, new MinPath().minPath(Util.getTree1()));

    }

    @Test
    public void testTree2() {
        assertEquals(20, new MinPath().minPath(Util.getTree2()));

    }

    @Test
    public void testTree3() {
        assertEquals(24, new MinPath().minPath(Util.getTree3()));

    }

}
