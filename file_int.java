import java.io.*;
import java.util.*;
public class file_int {
    public static void main(String[] args) throws Exception {

	try {

    FileInputStream fin = new FileInputStream("integers.txt");
    int ch;
	String a;int sum=0;
	System.out.println("The Numbers in the file are : ");
	while( (ch = fin.read())!=-1 )  
    {
		String s=Character.toString((char)ch);
		StringTokenizer st = new StringTokenizer(s);
		while( st.hasMoreTokens()) 
		{
			a = st.nextToken();
			int b = Integer.parseInt(a);
			System.out.println(b);
			sum = sum + b; 
		}
	}
	fin.close();
	System.out.println("The sum is " + sum);
	}
	catch(Exception e) {System.out.print(e);}
	}

}
    
