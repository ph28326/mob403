package com.ph28326.shoppingapp;

public class ItemModel {
    String username;
    String phoneNumber;
    String group;

    public ItemModel(String username, String phoneNumber, String group) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public ItemModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
