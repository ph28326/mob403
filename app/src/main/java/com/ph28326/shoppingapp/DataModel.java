package com.ph28326.shoppingapp;

public class DataModel {
    String username, password;

    public DataModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public DataModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
