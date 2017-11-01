package com.employee.entity;

public class Employee {

    private int id;
    private String name;
    private boolean gender; // true - male
    private String skill;

    public Employee(int id, String name, boolean gender, String skill) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
    }

    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
