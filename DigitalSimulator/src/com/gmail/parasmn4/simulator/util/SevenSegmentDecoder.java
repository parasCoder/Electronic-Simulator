/**
 * 
 */
package com.gmail.parasmn4.simulator.util;

/**
 * @author Paras Mani
 *
 */
public class SevenSegmentDecoder {
	
	private boolean d0 ;
	private boolean d1 ;
	private boolean d2 ;
	private boolean d3 ;
	
	public SevenSegmentDecoder(boolean d3, boolean d2, boolean d1 , boolean d0) {
		
		this.d0 = d0 ;
		this.d1 = d1 ;
		this.d2 = d2 ;
		this.d3 = d3 ;
	}
	/**
	 * @return the d0
	 */
	public boolean isD0() {
		return d0;
	}
	/**
	 * @param d0 the d0 to set
	 */
	public void setD0(boolean d0) {
		this.d0 = d0;
	}
	/**
	 * @return the d1
	 */
	public boolean isD1() {
		return d1;
	}
	/**
	 * @param d1 the d1 to set
	 */
	public void setD1(boolean d1) {
		this.d1 = d1;
	}
	/**
	 * @return the d2
	 */
	public boolean isD2() {
		return d2;
	}
	/**
	 * @param d2 the d2 to set
	 */
	public void setD2(boolean d2) {
		this.d2 = d2;
	}
	/**
	 * @return the d3
	 */
	public boolean isD3() {
		return d3;
	}
	/**
	 * @param d3 the d3 to set
	 */
	public void setD3(boolean d3) {
		this.d3 = d3;
	}
	
	public boolean getA() {
		
		return !(!d3 && (!d2 || !d0) && (d2 || d0) && !d1 ) ;
	}
	
	public boolean getB() {
		
		return !(d2 && (!d1 || !d0) && (d1 || d0)) ;
	}
	
	public boolean getC() {
		
		return !(!d2 && d1 && !d0) ;
	}
	
	public boolean getD() {
		
		return !(!d3 && (!d2 || d1 || !d0) && (d2 || !d1) && (d2 || d0) && (!d1 || d0) ) ;
	}
	
	public boolean getE() {
		
		return !( (d2 || d0) && (!d1 || d0) ) ;
	}
	
	public boolean getF() {
		
		return !(!d3 && (!d2 || d1) && (!d2 || d0) && (d1 || d0) ) ;
	}
	
	public boolean getG() {
		
		return !(!d3 && (!d2 || d1) && (!d2 || d0) && (d2 || !d1) ) ;
	}

}
