import java.util.*;
import java.io.*;
class file_writer_file_reader {
public static void main(String[] args) throws Exception {
    try {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("javatext2.txt");
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        System.out.println("Enter the address :");
        String address = sc.nextLine();
        sc.close();
        fw.write(name+"\n");
        fw.write(address);
	    fw.close();
	    FileReader fr = new FileReader("javatext2.txt");
        int ch;
        while((ch=fr.read())!=-1) {

        System.out.print((char)ch);

        }
    
        fr.close();
    }
    catch(Exception e){System.out.println(e);}
    }
}
