package de.vfh.theoinf.lang;

import static org.junit.Assert.*;

import org.junit.Test;

public class Language1Test {

    @Test
    public void testAccept() {
        String[] tests = {
                "",
                "b",
                "c",
                "ab",
                "abc",
                "abb",
                "abab",
                "bab",
                "cab",
                "bc",
                "bcb",
                "bcababcbab",
                "abcabcabcabcabcabc"
        };
        for (String s : tests) {
            assertTrue("Wort <"+s+"> sollte akzeptiert werden!", Language1.accept(s));
        }
    }

    @Test
    public void testNotAccept() {
        String[] tests = {
                "a",
                "aa",
                "ac",
                "ba",
                "d",
                "e",
                "0",
                "ca",
                "aba",
                "abcd",
                "baa",
                "bac",
                "cba",
                "abcabcabcabcabca"
        };
        for (String s : tests) {
            assertFalse("Wort <"+s+"> sollte nicht akzeptiert werden!", Language1.accept(s));
        }
    }

}
