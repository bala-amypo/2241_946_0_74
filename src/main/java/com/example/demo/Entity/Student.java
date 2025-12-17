
package com.example.demo.entity;

@entity
public class Student{

    @id
    private int id;

    public class Student{

    
   
    private long id;
    private String name;
    private String email;
    private float cgpa;


    public void long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;

    }

    public String getname(){
        return name;

    }

    public String setname(String name){
        this.name=name;
    }

    public String getemail(){
        return email;
    }

    public String setemail(String email){
        this.email=email;
    }

    public void float getcgpa(){
        return cgpa;
    }

    public void setcgpa(float cgpa){
        this.cgpa=cgpa;

    }
    
    public Student(long id, String name, String email,float cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }

    public Student(){
        
    }
}
