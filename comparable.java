import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class employee implements Comparable<employee>{
    int age;
    int marks;
    String name;
    public employee(int age,int marks,String name){
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
    public int compareTo(employee a){
        if(this.age<a.age)
        return 1;
        else
        return -1;
    }
    

}
public class comparable {
    public static void main(String[] args) {
        employee st1 = new employee(22, 85, "herry");
        employee st2 = new employee(50, 90, "chandu");
        employee st3 = new employee(30, 98, "abhi");
        List<employee> list1 = new ArrayList<employee>();
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
        Collections.sort(list1);
        System.out.println(list1);
    }
    
}
