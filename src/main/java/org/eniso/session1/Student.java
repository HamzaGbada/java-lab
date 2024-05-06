package org.eniso.session1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bobmarley
 */
public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void changeName(String name1){
        this.name = name1;
    }
    
    
    public void changeAge(int age1){
        this.age = age1;
    }
    
    public void display(){
        System.out.println("the Sudent Name is "+name+"and the age is "+age);
    }
    
}
