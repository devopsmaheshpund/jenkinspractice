package javaprograms;

import org.testng.annotations.Test;

public class HelloWord {

	@Test
	public void helloWord() {
		System.out.println("Hello Word");
	}
	
	@Test
	public void additionOfTwoNumbers() {
		int i=10;
		int j=20;
		int addition=i+j;
		System.out.println("Addition of two Numbers: "+addition);
	}
}
