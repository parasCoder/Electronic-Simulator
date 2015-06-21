package com.gmail.parasmn4.simulator.adder;

import com.gmail.parasmn4.simulator.gate.AndGate;
import com.gmail.parasmn4.simulator.gate.OrGate;
import com.gmail.parasmn4.simulator.gate.XorGate;

/** Represents a single bit full adder
 * @author Paras Mani
 * @author parasmn4@gmail.com
 */
public class FullAdder {
	
	private boolean input1;
	private boolean input2 ;
	private boolean carryIn ;
	
	public FullAdder(boolean input1 , boolean input2 )
	{
		this.input1 = input1 ;
		this.input2 = input2 ;
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
	/**
	 * @return the carryIn
	 */
	public boolean isCarryIn() {
		return carryIn;
	}
	/**
	 * @param carryIn the carryIn to set
	 */
	public void setCarryIn(boolean carryIn) {
		this.carryIn = carryIn;
	}
	
	/**
	 * @return The Sum output
	 */
	public boolean getSumOutput() {
	 
		XorGate x1 = new XorGate(this.input1 , this.input2) ;
		boolean in =  x1.getOutput() ;
		XorGate x2 = new XorGate(this.carryIn , in) ;
	 
		return x2.getOutput() ; 
	}
	
	/**
	 * @return The carry output  
	 */
	public boolean getCarryOutput() {
		
		XorGate x1 = new XorGate(this.input1 , this.input2) ;
		boolean in =  x1.getOutput() ;
		AndGate a1 = new AndGate(in , this.carryIn) ;
		AndGate a2 = new AndGate(this.input1 , this.input2) ;
		OrGate o1 = new OrGate(a1.getOutput() , a2.getOutput()) ;
		
		return o1.getOutput() ;
	}

}
