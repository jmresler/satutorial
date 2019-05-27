/**
 * 
 */
package org.jmresler.sakila.io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author John
 *
 */
public class DevNull extends OutputStream {

	/**
	 * 
	 */
	public DevNull() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * @see java.io.OutputStream#write(int)
	 */
	@Override
	public void write(int b) throws IOException {}
	
	/*
	 * @see java.io.OutputStream#write(byte[])
	 */
	@Override
	public void write(byte[] b) throws IOException {}
	
	/*
	 * @see java.io.OutputStream#write(byte[], int, int)
	 */
	@Override
	public void write(byte[] b, int start, int offset) throws IOException {}

}
