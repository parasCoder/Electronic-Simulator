package com.gmail.parasmn4.test;

import com.gmail.parasmn4.simulator.flipFlop.SRFlipFlop;

public class FFTest {

	public static void main(String[] args){
		
		SRFlipFlop ff1 = new SRFlipFlop(true , false) ;
		ff1.setClk(true);
		printDetails(ff1) ;
		
		 ff1.setClk(false);
		 ff1.setS(true);
		 ff1.setR(false);
		 printDetails(ff1) ;
		 
		 ff1.setClk(true) ;
		 ff1.setS(false);
		 ff1.setR(false);
		 printDetails(ff1) ;
		 
		 ff1.setClk(false);
		 ff1.setS(false);
		 ff1.setR(true);
		 printDetails(ff1) ;
		 
		 ff1.setClk(true);
			// ff1.setR(true);
			// ff1.setS(false);
			 printDetails(ff1) ;
			 
			 ff1.setClk(true);
				// ff1.setR(true);
				// ff1.setS(false);
				 printDetails(ff1) ;
	}
	
	 public static void printDetails(SRFlipFlop ff1 ) {
			
			int i1 = ff1.isS() ? 1 : 0;
			int i2 = ff1.isR() ? 1 : 0;
			int i3 = ff1.isClk() ? 1 : 0 ;
			int result1 = ff1.getQ() ? 1 : 0;
			int result2 = ff1.getQBar() ? 1 : 0 ;
			int res1 = ff1.isTempQ() ? 1 : 0 ;
			int res2 = ff1.isTempQBar() ? 1 : 0 ;
			System.out.println("Inputs: ["+i1+","+i2+","+i3+"], Output -> "+result1 +result2 + " tempQ = " +res1 + " tempQBar = " +res2);
		}
}
