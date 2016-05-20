package com.i.poec.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HelloJUnitTest {

	@Test
	public void helloshouldReturnHello() {
		
		//given
		HelloJUnit helloJUnit = new HelloJUnit();
		//when
		String result = helloJUnit.hello();
		//then
		//je dois garantir que "hello".equals(result);
		assertEquals("helloJUnit.hello() should equals hello", "hello",result);
		assertTrue("helloJUnit.hello() should equals hello", "hello".equals(result));
		//fail("Not yet implemented");
	}

}
