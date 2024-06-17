package junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	
	Addition a;
	
	@Before
	public void createObject() {
		a=new Addition();
	}
	
	@After
	public void objectValue() {
		a=null;
	}

	@Test
	public void test() {
		System.out.println("Hello Junit");	
	}
	
	@Test
	public void BothPositive() {
//		Addition a=new Addition();
		assertEquals(30,a.add(10, 20));
	}
	
	@Test
	public void OnePositive() {
//		Addition a=new Addition();
		assertEquals(-10,a.add(10, -20));
	}
	
	@Test
	public void BothNegative() {
//		Addition a=new Addition();
		assertEquals(-30,a.add(-10, -20));
	}
	
	@Test
	public void BothZero() {
		//Addition a=new Addition();
		assertEquals(0,a.add(0, 0));
	}
	
	@Test
	public void BothPositive1() {
//		Addition a=new Addition();
		assertEquals(-10,a.sub(10, 20));
	}
	
	@Test
	public void OnePositive1() {
//		Addition a=new Addition();
		assertEquals(30,a.sub(10, -20));
	}
	
	@Test
	public void BothNegative1() {
//		Addition a=new Addition();
		assertEquals(10,a.sub(-10, -20));
	}
	
	@Test
	public void BothZero1() {
		//Addition a=new Addition();
		assertEquals(0,a.sub(0, 0));
	}

}
