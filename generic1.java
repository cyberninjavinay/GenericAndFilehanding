package javaproject.filehanding;
  import java.util.*;
public class generic1 {
    
    public static void main(String[] args) {
        //using the string array
        String [] arr = new String[5];
        arr[0]="vinay";
        arr[1]="herry";
        arr[2]="viny";
        arr[3]="krishna";

        
        arr[4]="never";
        System.out.println(arr[0]);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " , ");
            
        }
        System.out.println();
        
        // if the we store the other type of data exception will throws like to solve this problem we use generic 
       // arr[4]=10;
    //    ArrayList ab = new ArrayList();
    //we want to store the data with typesafty using colection
     ArrayList<String>bn = new ArrayList<String>();
     bn.add("vinay");
     bn.add("shayam");
     bn.add(null);
     System.out.println(bn);
     
     System.out.println();




    }
    
}
