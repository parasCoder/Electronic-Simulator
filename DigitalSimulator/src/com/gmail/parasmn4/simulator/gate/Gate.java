package com.gmail.parasmn4.simulator.gate ;

/** Represents digital logic gate
 * @author Paras Mani
 * @author parasmn4@gmail.com
 * @version 1.0
 * @since 1.0
*/
 
 /**
 * @author Paras Mani
 *
 */
public abstract class Gate {
	 private boolean input1;
	 private boolean input2;
	 
	 public Gate(boolean input1, boolean input2) {
		 this.input1 = input1;
		 this.input2 = input2;
	 }

	/**
	 * @return the input1
	 */
	public boolean isInput1() {
		return input1;
	}

	/**
	 * @param input1 the input1 to set
	 */
	public void setInput1(boolean input1) {
		this.input1 = input1;
	}

	/**
	 * @return the input2
	 */
	public boolean isInput2() {
		return input2;
	}

	/**
	 * @param input2 the input2 to set
	 */
	public void setInput2(boolean input2) {
		this.input2 = input2;
	}
	
	public abstract boolean getOutput();
	
	
	 
 }