package com.epam.tddjunitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapCharsTest {
	SwapChars swapChars;
	@BeforeEach
	void setUp() {
		swapChars= new SwapChars();
	}
	@Test
	void test2Chars() {
		assertEquals("",swapChars.modify("AA"));
	}
	@Test
	void test3Chars() {
		assertEquals("BA",swapChars.modify("ABA"));
	}
	@Test
	void test4Chars() {
		assertEquals("BBAA",swapChars.modify("BBAA"));
	}
	@Test
	void testnChars() {
		assertEquals("BABABA",swapChars.modify("ABABABA"));
	}

}
