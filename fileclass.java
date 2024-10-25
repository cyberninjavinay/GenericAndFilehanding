package javaproject.filehanding;
 import java.io.*;
public class fileclass {
    public static void main(String[] args) {
        File dir = new File("VINAYJV");
        dir.mkdir();
        System.out.println(dir.isDirectory()); // to check directory is exists or not
       // we also create file inside the dirctory 
       File file1 = new File(dir,"vinayjv.pxt");
       try{
        file1.createNewFile();  // Exceotion possible to throws 
       }
       catch(Exception e){
        System.out.println("throwa the exception" + e);
       }
       
       System.out.println(file1.isFile());
    System.out.println("**********************************");
    int count =0;
String [] str=dir.list(); // list() is return to array String
for(String name : str){
    count++;
    System.out.println(name);

}
System.out.println(count);
    }
    
}
