package com.umanizales.model;

public class Costumer extends Observer {

    private String name,
            phone_number,
            email;

    public Costumer(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("\n" + GREEN +
                "Name: " + name +
                "\nphone_number: " + phone_number +
                "\nemail: " + email +
                subject.getNotification().toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final String GREEN = "\u001B[32m";
}
