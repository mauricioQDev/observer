package com.umanizales.model;

public class Notification {

    private String description;

    @Override
    public String toString() {
        return "\n" + CYAN +
                "\nNotificación!!! " + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final String CYAN = "\u001B[36m";
}
