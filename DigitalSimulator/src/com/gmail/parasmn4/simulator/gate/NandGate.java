package com.gmail.parasmn4.simulator.gate;

public class NandGate extends Gate {

	/** Represents a Nand Gate with specified inputs 
	 * @param input1 The first input
	 * @param input2 The second input
	 */
	public NandGate(boolean input1, boolean input2) {
		super(input1, input2);
	}
	
	/*(non-Javadoc)
	 * @see com.gmail.parasmn4.simulator.core.Gate#getOutput()
	 */
	public boolean getOutput() {
		return !(isInput1() && isInput2());
			
	}
	 
}