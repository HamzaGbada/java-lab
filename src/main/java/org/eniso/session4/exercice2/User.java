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
class User {
    private String firstName;
    private String lastName;
    private String email;
    private Long cin;

    public void displayInfo() {
        System.out.println("User Info: " + firstName + " " + lastName + ", Email: " + email);
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail) {
        this.setFirstName(newFirstName);
        this.setLastName(newLastName);
        this.setEmail(newEmail);
    }

    public boolean authenticate() {
        return true;
    }
}
