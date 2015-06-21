/**
 * 
 */
package com.gmail.parasmn4.test;

import com.gmail.parasmn4.simulator.util.SevenSegmentDecoder;

/**
 * @author Paras Mani
 *
 */
public class SevenSegmentTest {
	
	SevenSegmentDecoder s1 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s1) ;
	SevenSegmentDecoder s2 = new SevenSegmentDecoder(false,false, false, true ) ;
	getDetails(s2) ;
	SevenSegmentDecoder s3 = new SevenSegmentDecoder(false,false, true, false ) ;
	getDetails(s3) ;
	SevenSegmentDecoder s4 = new SevenSegmentDecoder(false,false, true, true ) ;
	getDetails(s4) ;
	SevenSegmentDecoder s5 = new SevenSegmentDecoder(false,true, false, false ) ;
	getDetails(s5) ;
	SevenSegmentDecoder s6 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s6) ;
	SevenSegmentDecoder s7 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s7) ;
	SevenSegmentDecoder s8 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s8) ;
	SevenSegmentDecoder s9 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s9) ;
	SevenSegmentDecoder s10 = new SevenSegmentDecoder(false,false, false, false ) ;
	getDetails(s10) ;
}

