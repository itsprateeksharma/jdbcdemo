package exceptionsdemo;

import java.io.IOException;

public class OutOfMemoryErrorDemo {
	
	public void createArray(int size)
	{
		try
		{
			Integer[] a =new Integer[size];
		}
		catch(OutOfMemoryError e)
		{
			System.err.println("array size too large: "+e);
			System.out.println("max jvm memory:"+Runtime.getRuntime().maxMemory());
			System.out.println("Java version: "+Runtime.version());
		}
	}
	

	public static void main(String[] args) {
		 OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		 d1.createArray(1000*1000*1800);
		 //notepad
		 try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
