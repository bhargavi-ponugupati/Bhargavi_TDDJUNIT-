package com.epam.Remove2A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_Test {
/*
 * 1.ABCD => BCD
   2.AACD => CD 
   3.BACD => BCD
   4.BBAA => BBAA       
   5.AABAA => BAA
   6.AA    =>" "
   7." "   =>" "

 */
	Remove2_A r=new Remove2_A();
	@BeforeEach
	void setUp() {
		Remove2_A r=new Remove2_A();
	}
	@Test
	void testRemove2A1() {
		assertEquals("BCD",r.remove1("ABCD"));
	}

	@Test
	void testRemove2A2() {
		assertEquals("CD",r.remove1("AACD"));
	}

	@Test
	void testRemove2A3() {
		assertEquals("BCD",r.remove1("BACD"));
	}

	@Test
	void testRemove2A4() {
		assertEquals("BBAA",r.remove1("BBAA"));
	}

	@Test
	void testRemove2A5() {
		assertEquals("BAA",r.remove1("AABAA"));
	}
	@Test
	void testRemove2A6() {
		assertEquals(" ",r.remove1("A"));
	}
	@Test
	void testRemove2A7() {
		assertEquals(" ",r.remove1(""));
	}
	@Test
	void testRemove2A8() {
		assertEquals("B",r.remove1("B"));
	}

}
