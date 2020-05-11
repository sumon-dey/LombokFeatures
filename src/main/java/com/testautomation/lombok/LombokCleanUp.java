package com.testautomation.lombok;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Cleanup;

/*We can use @Cleanup to ensure a given resource is automatically cleaned up before the code 
execution path exits our current scope. 
 * We can do this by annotating any local variable declaration with the @Cleanup annotation like:
@Cleanup InputStream in = new FileInputStream("some/file");
As a result, at the end of the scope we are in, in.close() is called. 
This call is guaranteed to run by way of a try/finally construct.*/

/*If the type of object we would like to cleanup does not have a close() method, 
 * but some other no-argument method, we can specify the name of this method like so:
@Cleanup("dispose") org.eclipse.swt.widgets.CoolBar bar = new CoolBar(parent, 0);
By default, the cleanup method is presumed to be close(). 
A cleanup method that takes 1 or more arguments cannot be called via @Cleanup. */
public class LombokCleanUp {

	public static void main(String[] args) throws IOException {
		@Cleanup
		InputStream in = new FileInputStream(args[0]);
		@Cleanup
		OutputStream out = new FileOutputStream(args[1]);
		byte[] b = new byte[10000];
		while (true) {
			int r = in.read(b);
			if (r == -1)
				break;
			out.write(b, 0, r);
		}
	}

}
