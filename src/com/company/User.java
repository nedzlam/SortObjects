package com.company;

import java.util.Collections;
import java.util.Objects;

class User implements java.lang.Comparable<User> {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public int compareTo(User coUser){
        int coId = coUser.getId();
        return this.id - coId;
    }

    @Override
    public String toString() {
        return "[ ID:" + id + ", name=" + name + "]";
    }
}

