package com.gmail.parasmn4.simulator.gate;

public class XorGate extends Gate{
	
	public XorGate(boolean input1, boolean input2) {
		super(input1, input2);
	}
	
	public boolean getOutput()
	{
		return isInput1() ^ isInput2() ;
	}

}
