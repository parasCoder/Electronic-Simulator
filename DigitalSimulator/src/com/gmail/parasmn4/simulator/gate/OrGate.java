package com.gmail.parasmn4.simulator.gate;

public class OrGate extends Gate {
	
	public OrGate(boolean input1, boolean input2) {
		super(input1, input2);
	}
	
	/* (non-Javadoc)
	 * @see com.gmail.parasmn4.simulator.core.Gate#getOutput()
	 */
	public boolean getOutput() {
		return isInput1() || isInput2();
	}
 
}