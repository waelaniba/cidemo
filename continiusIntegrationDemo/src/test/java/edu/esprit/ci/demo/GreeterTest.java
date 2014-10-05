package edu.esprit.ci.demo;

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
	public void itShouldSayHello() {

		Assert.assertEquals("Hello world", greeter.sayHello("world"));

	}

	@Test
	public void itShouldSayGoodBye() {

		Assert.assertEquals("GoodBye worldy", greeter.sayGoodBye("worldy"));

	}

}
