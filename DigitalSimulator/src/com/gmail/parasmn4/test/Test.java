/**
 * 
 */
package com.gmail.parasmn4.test;

import com.gmail.parasmn4.simulator.gate.AndGate;
import com.gmail.parasmn4.simulator.gate.Gate;
import com.gmail.parasmn4.simulator.gate.OrGate;
import com.gmail.parasmn4.simulator.gate.XnorGate;
import com.gmail.parasmn4.simulator.gate.XorGate;

/**
 * @author Paras Mani
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AndGate and1 = new AndGate( true , true);
		printDetails("AND", and1);
		and1.setInput1(true);
		and1.setInput2(false);
		printDetails("AND", and1);
		
		OrGate orGate = new OrGate(true , true);
		printDetails("OR", orGate);
		orGate.setInput1(true);
		orGate.setInput2(false);
		printDetails("OR", orGate);
		orGate.setInput1(false);
		orGate.setInput2(false);
		printDetails("OR", orGate);
		
		XorGate xorGate = new XorGate(true , true);
		printDetails("XOR", xorGate);
		xorGate.setInput1(true);
		xorGate.setInput2(false);
		printDetails("XOR", xorGate);
		xorGate.setInput1(false);
		xorGate.setInput2(false);
		printDetails("XOR", xorGate);
		
		XnorGate xnorGate = new XnorGate(true , true);
		printDetails("XNOR", xnorGate);
		xnorGate.setInput1(true);
		xnorGate.setInput2(false);
		printDetails("XNOR", xnorGate);
		xnorGate.setInput1(false);
		xnorGate.setInput2(false);
		printDetails("XNOR", xnorGate);
		
	}
	
	static void printDetails(String gateTpe, Gate gate) {
		int i1 = gate.isInput1() ? 1 : 0;
		int i2 = gate.isInput2() ? 1 : 0;
		int result = gate.getOutput() ? 1 : 0;
		System.out.println("Gate :"+gateTpe+", Inputs: ["+i1+","+i2+"], Output -> "+result);
	}
}
