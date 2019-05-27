package org.jmresler.sakila.util;

import java.util.Random;

public final class PerformanceConstants {

	/*
	 * Review of various code bases indicate that the most common reused
	 * values are 0, 1 and 10. This is anecdotal only but cacheing the values
	 * does speed things up...
	 */
	public static final long LONG_ZERO = Long.valueOf(0);
	public static final long LONG_ONE = Long.valueOf(1);
	public static final long LONG_TEN = Long.valueOf(10);
	
	public static final int INT_ZERO = Integer.valueOf(0);
	public static final int INT_ONE = Integer.valueOf(1);
	public static final int INT_TEN = Integer.valueOf(10);
	
	public static final short SHORT_ZERO = Short.valueOf("0");
	public static final short SHORT_ONE = Short.valueOf("1");
	public static final short SHORT_TEN = Short.valueOf("10");
	
	public static final byte BYTE_ZERO = Byte.valueOf("0");
	public static final byte BYTE_ONE = Byte.valueOf("1");
	public static final byte BYTE_TEN = Byte.valueOf("10");
	
	static {
		
		Random numGen = new Random();
		
		// we'll initialize the rest of the number cache's with random values 
		// that will be looked up in the cache, rather than constructed
		for (long l = 11; l < 256; l++)
			Long.valueOf(numGen.nextLong());
		
		for (int i = 11; i < 256; i++)
			Integer.valueOf(numGen.nextInt());
	
		for (short s = Short.valueOf("11"); s < 256; s++)
			Short.valueOf(s);

		for (byte b = Byte.valueOf("11"); b < Byte.MAX_VALUE; b++)
			Byte.valueOf(b);
	}
	
	public static final String EMPTY_STRING = "";
	public static final String SPACE = " ";
	public static final String CR = "\r";
	public static final String NL = "\n";
	public static final String CR_NL = "\r\n";
	
	/*
	 * 
	 */
	private PerformanceConstants() {}
	
	
	/*
	 * 
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
