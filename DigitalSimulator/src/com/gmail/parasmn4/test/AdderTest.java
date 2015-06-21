package com.gmail.parasmn4.test;

import com.gmail.parasmn4.simulator.adder.FullAdder;

public class AdderTest {
	
	public static void main(String[] args)
	{
		FullAdder f1 = new FullAdder(true , true) ;
		f1.setCarryIn(true);
		printDetails(f1) ;
		
		f1.setInput1(false);
		f1.setInput2(true);
		f1.setCarryIn(false);
		printDetails(f1) ;
		
		f1.setInput1(false);
		f1.setInput2(false);
		f1.setCarryIn(true);
		printDetails(f1) ;
		
		f1.setInput1(false);
		f1.setInput2(false);
		f1.setCarryIn(false);
		printDetails(f1) ;
		
		f1.setInput1(false);
		f1.setInput2(true);
		f1.setCarryIn(true);
		printDetails(f1) ;
		
		f1.setInput1(true);
		f1.setInput2(true);
		f1.setCarryIn(false);
		printDetails(f1) ;
		
		f1.setInput1(true);
		f1.setInput2(false);
		f1.setCarryIn(true);
		printDetails(f1) ;
		
		f1.setInput1(true);
		f1.setInput2(false);
		f1.setCarryIn(false);
		printDetails(f1) ;
		
		
		
	}
	   public static void printDetails(FullAdder f1 ) {
		
		int i1 = f1.isInput1() ? 1 : 0;
		int i2 = f1.isInput2() ? 1 : 0;
		int i3 = f1.isCarryIn() ? 1 : 0 ;
		int result1 = f1.getSumOutput() ? 1 : 0;
		int result2 = f1.getCarryOutput() ? 1 : 0 ;
		System.out.println("Inputs: ["+i1+","+i2+","+i3+"], Output -> "+result2 +result1);
	}
}
