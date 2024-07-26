package com.example.demo.model;

public class Role {
    private int id;
    private String name;
    private int level;
    
    public Role(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
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
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    
}
