package com.i.poec.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	@BeforeClass
	public void beforAll(){
		System.out.println("avant tous");
		
	}
	
	@AfterClass
	public void afterAll(){
		System.out.println("après tous");
	}
	
	@Before
	public void beforEach(){
		System.out.println("avant");
		
	}
	
	@After
	public void afterEach(){
		System.out.println("après");
	}
	

	@Test
	public void fiboN() {
	
		assertEquals("0 => 0", 0, Fibo.fib(0));
		assertEquals("1 => 1", 1, Fibo.fib(1));
		assertEquals("2 => 1", 1, Fibo.fib(2));
		assertEquals("3 => 2", 2, Fibo.fib(3));
		assertEquals("4 => 3", 3, Fibo.fib(4));
		assertEquals("14 => 377", 377, Fibo.fib(14));
		assertEquals("46 => 1836311903  ", 1836311903  , Fibo.fib(46));
		
		// nb negatif ?
		// fib(n) > Integer.MAX_VALUE
	

	}
	
	
	@Test(expected=IllegalArgumentException.class )
	public void fiboNegatif(){
		Fibo.fib(-1);
	}
	
	@Test(expected=IllegalArgumentException.class )
	public void fiboTooBigN(){
		Fibo.fib(47);
	}
	

}
