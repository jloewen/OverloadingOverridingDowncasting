package Downcasting;

public class Downcasting {
    public static void main(String[] args) {
        Person person=new Student("Jamo");       //upcasting
        Student student;

        //downcasting
        student=(Student)person;

        System.out.println(student.name);  
        student.grade="A";
    }
}