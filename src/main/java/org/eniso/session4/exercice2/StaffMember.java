/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session4.exercice2;

import java.util.List;
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
class StaffMember extends User {

    public StaffMember(String firstName, String lastName, String email, Long cin, String qualification, Integer experience, List<String> tasks) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }

    private String qualification;
    private Integer experience;
    private List<String> tasks;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff Member Info: Qualification - " + this.qualification + ", Experience - " + this.experience);
    }

    public void finishTask(String task) {
        if (this.tasks != null) {
            this.tasks.remove(task);
            System.out.println("Task finished: " + task);
        }
    }
}
