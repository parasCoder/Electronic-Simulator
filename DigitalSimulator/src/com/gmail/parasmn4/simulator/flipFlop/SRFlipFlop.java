package com.gmail.parasmn4.simulator.flipFlop;

import com.gmail.parasmn4.simulator.gate.NandGate;

/**
 * @author Paras Mani
 *
 */
public class SRFlipFlop {

	private boolean s ;
	private boolean r ;
	private boolean clk ;
	private boolean tempQ = false ;
	private boolean tempQBar = false ;
	
	/**
	 * @return the tempQBar
	 */
	public boolean isTempQBar() {
		return tempQBar;
	}
	/**
	 * @param tempQBar the tempQBar to set
	 */
	public void setTempQBar(boolean tempQBar) {
		this.tempQBar = tempQBar;
	}
	/**
	 * @return the tempQ
	 */
	public boolean isTempQ() {
		return tempQ;
	}
	/**
	 * @param tempQ the tempQ to set
	 */
	public void setTempQ(boolean tempQ) {
		this.tempQ = tempQ;
	}
	/**
	 * @param s The s value of flip flop
	 * @param r The r value of flip flop
	 */
	public SRFlipFlop(boolean s , boolean r)
	{
		this.s = s ;
		this.r = r ;
	}
	/**
	 * @return the s
	 */
	public boolean isS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(boolean s) {
		this.s = s;
	}
	/**
	 * @return the r
	 */
	public boolean isR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(boolean r) {
		this.r = r;
	}
	/**
	 * @return the clk
	 */
	public boolean isClk() {
		return clk;
	}
	/**
	 * @param clk the clk to set
	 */
	public void setClk(boolean clk) {
		this.clk = clk;
	}
	
	/**
	 * @return Output of the Q
	 */
	
		public boolean getQ() {

		        	
		 NandGate a1 = new NandGate(isS() , isClk()) ;
		 if(!a1.getOutput())  
			return (tempQ = true) ;
		 
		 else {			 
		 NandGate a2 = new NandGate(a1.getOutput() , tempQBar) ;
				 return (tempQ = a2.getOutput()) ;
	      } 
	}	 
	
	/**
	 * @return Output of the Q bar 
	 */
	public boolean getQBar()
	{

			NandGate a1 = new NandGate(this.r , this.clk) ;
			if(!a1.getOutput()) 
				return (tempQBar = true) ;
			
			else {
		 NandGate a2 = new NandGate(a1.getOutput() , tempQ) ;		 
		 return (tempQBar = a2.getOutput()) ;
		}
	}
	
}
