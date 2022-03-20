package com.aoeivux.pojo;

public class UserT {
    private String name;


    public UserT(){
        System.out.println("创建了UserT");
    }

    public UserT(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getUser(){
        System.out.println("name: " + name);
    }
}
