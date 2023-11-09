import java.io.*;  
public class FileReading{    
 public static void main(String args[])throws Exception{ 
	 FileReader fr=new FileReader("read.txt");    
     BufferedReader br=new BufferedReader(fr);    
     System.out.println("bufferedreader");
     int i;    
     while((i=br.read())!=-1){  
     System.out.print((char)i);  
     }  
     br.close();    
     fr.close();  
	 
  try{    
    FileInputStream fin=new FileInputStream("sreenu.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);
    System.out.println("\nbufferedinputstream");
    int j;    
    while((j=bin.read())!=-1){    
     System.out.print((char)j);    
    }    
    bin.close();    
    fin.close();  
    
 }catch(Exception e){
	 System.out.println(e);
 }
	 InputStream input = new FileInputStream("testout.txt");  
	    DataInputStream inst = new DataInputStream(input); 
	    System.out.println("Datainputstream");
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k); 
	 
 }

}
}
 
