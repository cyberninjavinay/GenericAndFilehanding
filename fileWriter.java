package javaproject.filehanding;
import java.io.*;
import java.io.IOException;
public class fileWriter {
    public static void main(String[] args) {
        File f = new File("HOSTEL"); // to create directory
        f.mkdir();
        File ff = new File(f,"student.txt"); // to create file inside the directory
        
        // perform the write operation on file
        try {
            FileWriter fw = new FileWriter(ff,true);  
            // if we wan to not overide old data use true keyword inside the constertor
            fw.write("hostel student details");
            fw.write(20);
            fw.write("\n");
            fw.write("vinay");
            fw.write("\n");
            fw.write(19);
            fw.write("\n");
            fw.write("abhishek");
            fw.write("\n");
            fw.write(18);
            fw.write("\n");
            fw.write("chandan");
            fw.write("\n");
            // after write operation we must be close the resource 
            fw.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("open the student.txt");

        
    }
    
}
