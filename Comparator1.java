import java.util.*;
class student{
    int age;
    int marks;
    String name;
    public student(int age,int marks,String name){
        this.age=age;
        this.marks=marks;
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public int age(){
        return marks;
    }
    public String name(){
        return name;
    }
    //override the tostring methos that present inside object class
    public String toString(){
        return "" +age+"-"+ marks+"-"+ name;
    }
    // we have to create a class to implement comparator interface method
}
class alpha implements Comparator<student>{
    public int compare(student a,student b){
        if(a.age>b.age)
        return 1;
        else
        return -1;
    }
}
public class Comparator1 {
    public static void main(String[] args) {
        //we create three object with different data type
        student st1 = new student(20, 85, "vinay");
        student st2 = new student(18, 90, "chandan");
        student st3 = new student(15, 98, "abhishek");
        //we add all three object in collection 
        List<student>list =new ArrayList<student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);
        System.out.println("******************************");
        //sort that collection 
       // Collections.sort(list); here get error because multiple  datatype value is store
       //we have to use comparator interface and theair method
       alpha a = new alpha();
       Collections.sort(list, a);
       System.out.println("after sort the collection");
       System.out.println("********************************");
       System.out.println(list);
       
    }
}