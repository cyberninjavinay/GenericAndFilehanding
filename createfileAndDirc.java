package javaproject.filehanding;

import java.io.File;
import java.io.IOException;

public class createfileAndDirc {
    public static void main(String[] args) throws IOException{
        // we create a file 
        File file1 = new File("vinay.txt");
        //if the file physically already exits then refer to that fale 
        //if tha file doest exist physically then create a file using inbuild method
        System.out.println(file1.exists());
        System.out.println("*****************");
        //after using inbuild mthod
        file1.createNewFile(); // here possible to show Exception sho we have to duck the exception 
        System.out.println(file1.exists());
        //also create a directory 
        File dtr = new File("college");
        dtr.mkdir();
        System.out.println(dtr.exists());
            }
}
