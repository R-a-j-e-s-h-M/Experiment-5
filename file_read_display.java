import java.io.*;
class file_read_display {
    public static void main(String[] args) throws Exception {
    FileInputStream fin = new FileInputStream("javatext.txt");

    int i=1;
    int ch;

    System.out.print(i+"-");
    while((ch = fin.read())!=-1) {
        System.out.print((char)ch);
        if(ch=='\n')
            System.out.print(++i+"-");
    }
    fin.close();
    }
}
