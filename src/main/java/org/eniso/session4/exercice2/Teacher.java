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
class Teacher extends User {
    private Long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, Long cin, Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher Info: hIndex - " + hIndex);
    }

    public void displayCoursesContent() {
        if (courses != null) {
            System.out.println("Courses Taught:");
            courses.forEach(course -> System.out.println("Course: " + course.getName() +
                    ", Contents: " + course.getContents() + ", Coefficient: " + course.getCoef()));
        }
    }
}
