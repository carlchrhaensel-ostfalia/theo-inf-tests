package de.vfh.theoinf.automat;

import static org.junit.Assert.*;

import org.junit.Test;

import de.vfh.theoinf.lang.Language1;

public class Automat1Test {

	@Test
	public void testNextState() {
		int[][] dest = {{1, 1, 1, 3, 4},{0, 2, 0, 3, 4},{0, 0, 3, 3, 4},{4,4,4,4,4}};
		for (int s=0; s<=4; s++) {
			for (char c = 'a'; c <= 'd'; c++) {
				assertEquals("transition für "+s+" und '"+c+"' :",
						Automat1.nextState(s, c),dest[c-'a'][s]);
			}
		}
	}

	@Test
	public void testAccepts() {
		String[] tests = {
				"abc",
				"aabc",
				"aababc",
				"abcab",
				"abcabc",
				"aaababbaabbbcacacbaccacccabcaaa"
		};
		for (String s : tests) {
			assertTrue("Wort <"+s+"> sollte akzeptiert werden!", Automat1.accept(s));
		}
	}

	@Test
	public void testNotAccepts() {
		String[] tests = {
				"",
				"a",
				"b",
				"c",
				"0",
				"ab",
				"ac",
				"bc",
				"d",
				"abcd",
				"0abc",
				"abacbc",
				"aaababbaabbbcacacbaccaccc"
		};
		for (String s : tests) {
			assertFalse("Wort <"+s+"> sollte nicht akzeptiert werden!", Automat1.accept(s));
		}
	}

}
