package javaproject.filehanding;
class employee{
    private int age;
    private int id;
    private String name;
    public employee(int age , int id , String name){
        this.age=age;
        this.id=id;
        this.name=name;
        
    }
    //tostring value used to print the ref object value if not use this tostring method only hash value printed
    public String toString(){
        return age + " - "+ id + " - " + name;
    }
}
public class iinputoutput {
    public static void main(String[] args) {
        employee e = new employee(19,1049,"vinay");
        System.out.println(e);
        employee e1 = new employee(20, 10020, "abhishek");
        System.out.println(e1);
    }
    
}
