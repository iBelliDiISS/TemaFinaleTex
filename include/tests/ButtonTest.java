package it.unibo.ing.iss.buttonledJava.tests;

import static org.junit.Assert.*;
import it.unibo.ing.iss.buttonledJava.impl.JavaButton;
import it.unibo.ing.iss.buttonledJava.interfaces.buttons.IDebuggableButton;

import org.junit.Test;

public class ButtonTest {
	@Test
	public void basicTest() {
		IDebuggableButton bt = new JavaButton(); 
		assertFalse(bt.isPressed());
		bt.press();
		assertTrue(bt.isPressed());
		bt.release();
		assertFalse(bt.isPressed());
		bt.release();
		assertFalse(bt.isPressed());
	}
	
	@Test
	public void advancedTest(){
		IDebuggableButton bt = new JavaButton();
		bt.press();
		bt.press();
		bt.press();
		assertTrue(bt.isPressed());
		bt.release();
		assertFalse(bt.isPressed());
		bt.release();
		assertFalse(bt.isPressed());
		bt.press();
		assertTrue(bt.isPressed());
	}

}
