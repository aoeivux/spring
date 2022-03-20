package com.aoeivux.pojo;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
            ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void show(){
        System.out.println("this is:" +this.name);
    }
}
