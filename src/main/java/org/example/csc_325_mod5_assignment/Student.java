package org.example.csc_325_mod5_assignment;

import javafx.scene.image.Image;

/**
 * Student class that represents students
 */
public class Student {
    /**
     * Member variables of the student class
     */
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String major;
    private String email;
    private Image imageUrl;

    /**
     * Constructor for student class
     * @param id student and table id number
     * @param firstName students first name
     * @param lastName students last name
     * @param department students department of study
     * @param major students major of study
     * @param email students email address
     * @param imageUrl imageURL for profile pic
     */
    public Student(int id, String firstName, String lastName, String department, String major, String email, Image imageUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.major = major;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    /**
     * Getters and setters for student member variables
     * @return gets a member variable or sets a member variable
     */
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
