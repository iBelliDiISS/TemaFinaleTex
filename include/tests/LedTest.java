package it.unibo.ing.iss.buttonledJava.tests;

import static org.junit.Assert.*;
import it.unibo.ing.iss.buttonledJava.impl.JavaLed;
import it.unibo.ing.iss.buttonledJava.interfaces.leds.ILed;

import org.junit.Before;
import org.junit.Test;

public class LedTest {
	private ILed led = new JavaLed();
	@Before
	public void setUp() throws Exception {
		led = new JavaLed();
	}

	@Test
	public void test() {
		assertFalse(led.isOn());
		led.turnOn();
		assertTrue(led.isOn());
		led.turnOff();
		assertFalse(led.isOn());
	}

}
