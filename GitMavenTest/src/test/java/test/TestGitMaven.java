package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGitMaven {

/*	@Test
	public void pass() {
		String s = "Aditi";
		boolean flag = false;
		if(s.length()>3){
			System.out.println("Length is greater then three");
			flag = true;
		}
		assertTrue(flag);
	}*/
	@Test
	public void fail() {
		String s = "Ad";
		boolean flag = false;
		if(s.length()>3){
			System.out.println("Length is greater then three");
			flag = true;
		}
		assertTrue(flag);
	}
}
