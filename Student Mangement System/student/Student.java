package student;

public class Student {
    private int id;
    private String name;
    private int age;
    private int marks;


    //Constructors
    public Student(int id,String name,int age,int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getRollno(){
        return age;
    }

    public int getMarks(){
        return marks;
    }

    //setter
    public void setMarks(int marks){
        this.marks = marks;
    }

    public void getStudentDetails(){
        System.out.println("-------------");
        System.out.println("Name :"+this.name);
        System.out.println("Id :"+this.id);
        System.out.println("Age :"+this.age);
        System.out.println("Marks :"+this.marks);
        System.out.println("-------------");
    }
}
