package com.gmail.parasmn4.simulator.gate;

public class XnorGate extends Gate {
	
	public XnorGate(boolean input1, boolean input2) {
		super(input1, input2);
	}
	
	public boolean getOutput()
	{
		return !(isInput1() ^ isInput2()) ;
	}

}