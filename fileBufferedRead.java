package javaproject.filehanding;
import java.io.*;
public class fileBufferedRead {
    public static void main(String[] args) throws Exception {
        File dir = new File("VINAYjv");
        File file = new File(dir,"vinayjv.txt");
        FileWriter fw = new FileWriter(file);
        // bufferedwriter is used to increase their performance 
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("vinay");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write("abhishek");
        bw.newLine();
        bw.write(75);
        bw.newLine();
        bw.write("chandan");
    // its must be close the resource
        bw.close();
        System.out.println("open the vinayjv.txt :");
    }
    
}
