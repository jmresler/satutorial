package org.jmresler.sakila.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class StreamCopier {

	private static final int BUF_SIZE = 256;
	private static final int EOF = -1;
	
	private StreamCopier() {}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	/**
	 * 
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static void copy(InputStream in, OutputStream out) throws IOException {
		synchronized(in) {
			byte[] buffer = new byte[BUF_SIZE];
			int bytesRead = 0;
			while ((bytesRead = in.read(buffer)) != EOF)
				out.write(buffer, 0, bytesRead);
				
		}
	}
	
}
