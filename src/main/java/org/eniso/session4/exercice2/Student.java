/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session4.exercice2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author bobmarley
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Student extends User {
    private Double average;
    private Classe classe;
    private Status status;

    public Student(String firstName, String lastName, String email, Long cin, Double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Info: Average - " + average + ", Class - " + classe + ", Status - " + status);
    }
}
