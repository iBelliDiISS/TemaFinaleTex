package it.unibo.ing.iss.buttonledJava.tests;

import static org.junit.Assert.*;
import it.unibo.ing.iss.buttonledJava.impl.JavaButtonLed;
import it.unibo.ing.iss.buttonledJava.interfaces.IButtonLed;

import org.junit.Before;
import org.junit.Test;

public class ButtonLedTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void repeatedPushFromOff() {
		IButtonLed btLed = new JavaButtonLed(false,false);
		btLed.pushButton();
		assertTrue(btLed.getLedState());
		btLed.pushButton();
		assertTrue(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromOn() {
		IButtonLed btLed = new JavaButtonLed(true, false);
		btLed.pushButton();
		assertFalse(btLed.getLedState());
		btLed.pushButton();
		assertFalse(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromPressed() {
		IButtonLed btLed = new JavaButtonLed(false,true);
		btLed.pushButton();
		assertFalse(btLed.getLedState());
		btLed.pushButton();
		assertFalse(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromUnpressed() {
		IButtonLed btLed = new JavaButtonLed(false,false);
		btLed.pushButton();
		assertTrue(btLed.getLedState());
		btLed.pushButton();
		assertTrue(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromOnAndUnpressed() {
		IButtonLed btLed = new JavaButtonLed(true, false);
		btLed.pushButton();
		assertFalse(btLed.getLedState());
		btLed.pushButton();
		assertFalse(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromOnAndPressed() {
		IButtonLed btLed = new JavaButtonLed(true, true);
		btLed.pushButton();
		assertTrue(btLed.getLedState());
		btLed.pushButton();
		assertTrue(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromOffAndUnpressed() {
		IButtonLed btLed = new JavaButtonLed(false, false);
		btLed.pushButton();
		assertTrue(btLed.getLedState());
		btLed.pushButton();
		assertTrue(btLed.getLedState());
	}
	
	@Test
	public void repeatedPushFromOffAndPressed() {
		IButtonLed btLed = new JavaButtonLed(false, true);
		btLed.pushButton();
		assertFalse(btLed.getLedState());
		btLed.pushButton();
		assertFalse(btLed.getLedState());
	}
}
