package org.example.csc_325_mod5_assignment;

import javafx.scene.image.Image;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String major;
    private String email;
    private Image imageUrl;

    public Student(int id, String firstName, String lastName, String department, String major, String email, Image imageUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.major = major;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Image getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(Image imageUrl) {
        this.imageUrl = imageUrl;
    }
}
