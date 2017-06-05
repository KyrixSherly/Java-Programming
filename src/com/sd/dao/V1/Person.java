package com.sd.dao.V1;

public class Person {
    private int id;
    private String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
}