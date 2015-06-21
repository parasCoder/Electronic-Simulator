package com.gmail.parasmn4.simulator.util ;		
/** Represents a input object
 * @author Paras Mani
 * @author parasmn4@gmail.com
 * @version 1.0
 * @since 1.0
*/
 public class Input
 {
	private boolean input1 , input2 ;
	
/** sets inputs
 * @param input1 The object's first input
 * @param input2 The object's second input 
*/
  public void setInputs(boolean in1 , boolean in2)
  {
	 this.input1 = in1 ;
	 this.input2 = in2 ;
  }
/** gets first input of object
 * @return A boolean according to input
*/ 
  public boolean getInput1()
  {
	  return this.input1 ;
  }
/** gets second input of object
 * @return A boolean according to input
*/   
   public boolean getInput2()
  {
	  return this.input2 ;
  }
 
 }