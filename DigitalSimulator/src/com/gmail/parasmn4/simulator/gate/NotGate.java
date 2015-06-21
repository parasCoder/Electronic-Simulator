package com.gmail.parasmn4.simulator.gate;

public class NotGate{
	
	private boolean input ;
	
	public NotGate(boolean input)
	{
		this.input = input ;
	}
	
	public void setInput(boolean in)
	{
		this.input = in ;
	}
	
	public boolean getInput()
	{
		return this.input ;
	}
	
	public boolean getOutput()
	{
	    return !this.input ;
	}

}
