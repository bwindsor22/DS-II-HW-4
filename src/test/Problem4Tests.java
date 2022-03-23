package test;

import main.SourceLeafSkipPaths;
import org.junit.Test;
import test.Util;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class Problem4Tests {

    @Test
    public void testTree0Skip() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("101620")
                .collect(Collectors.toSet());

        assertEquals(expected, paths.findPathsSkip(Util.getTree0()));
    }

    @Test
    public void testTree1Skip() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("1016")
                .collect(Collectors.toSet());

        assertEquals(expected, paths.findPathsSkip(Util.getTree1()));
    }

    @Test
    public void testTree2Skip() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("104", "108", "1012", "1016")
                .collect(Collectors.toSet());

        assertEquals(expected, paths.findPathsSkip(Util.getTree2()));
    }

    @Test
    public void testTree0N() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("1014161820").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree0(), 0));

        expected = Stream.of("101620").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree0(), 1));

        expected = Stream.of("1018").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree0(), 2));

    }

    @Test
    public void testTree1N() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("101416").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree1(), 0));

        expected = Stream.of("1016").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree1(), 1));

        expected = Stream.of("10").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree1(), 2));
    }

    @Test
    public void testTree2N() {
        SourceLeafSkipPaths paths = new SourceLeafSkipPaths();

        Set<String> expected = Stream.of("10141213", "1068", "10141211", "1064", "101416").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree2(), 0));

        expected = Stream.of("1016", "104", "1012", "108").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree2(), 1));

        expected = Stream.of("1013", "1011", "10").collect(Collectors.toSet());
        assertEquals(expected, paths.findPaths(Util.getTree2(), 2));
    }

}
