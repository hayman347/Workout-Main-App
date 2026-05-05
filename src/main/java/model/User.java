/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haydnmaneval
 */
public class User {

    public User() {
    }

    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String passwd;
    private int dob;
    private double height;
    private double weight;
    private String goals;
    private String gender;
    
    //Updated info with genders added

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    public User(int id, String firstname, String lastname, String passwd, int dob, double height, double weight, String goals, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passwd = passwd;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
        this.gender = gender;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getDob() {
        return dob;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getGoals() {
        return goals;
    }

    //Constructors
    public User(int dob, double height, double weight, String goals) {
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
    }

    public User(int id, String username, String firstname, String lastname, String passwd) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passwd = passwd;
    }

    public User(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public User(int id, String username, String passwd) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
    }

    public User(int id, String username, String firstname, String lastname, String passwd, int dob, double height, double weight, String goals) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passwd = passwd;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
    }

    @Override
    public String toString() {
        return String.format(
                "users [id=%d, username=%s, passwd=%s, firstname=%s, lastname=%s, dob=%d, height=%.2f, weight=%.2f, goals=%s. gender=%s]",
                id, username, passwd, firstname, lastname, dob, height, weight, goals, gender
        );
    }

}
