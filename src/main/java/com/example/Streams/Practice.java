package com.example.Streams;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.List;

class Practice{
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mrinal",1));
        students.add(new Student("saurabh",2));
        students.add(new Student("Vaibhav",3));
        students.add(new Student("Giri",1));
        students.add(new Student("Tiwari",1));

        students.stream().filter(s-> s.getSem()==1).forEach(s->{s.setSem(s.getSem()+1);});
        students.forEach(student -> System.out.println(student.getName()+" -> Sem  "+ student.getSem()));

    }
}

class Student{
    public Student(String name) {
        this.name = name;
    }

    String name;

    public Student(String name, int sem) {
        this.name=name;
        this.sem=sem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }

    public Student(int sem) {
        this.sem = sem;
    }

    int sem;

}