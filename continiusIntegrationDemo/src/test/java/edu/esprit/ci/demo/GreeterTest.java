package edu.esprit.ci.demo;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter;

	@Before
	public void setUp() throws Exception {

		greeter = new Greeter();
	}

	@Test
	public void test() {
		
		Assert.assertEquals("Hello world", greeter.sayHello("world"));
		
	}

}
