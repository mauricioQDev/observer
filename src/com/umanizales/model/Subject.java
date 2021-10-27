package com.umanizales.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observadores = new ArrayList<>();
    private Notification notification;

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
        notifyAllObserves();
    }

    public void add(Observer observer) {
        observadores.add(observer);
    }

    public void notifyAllObserves() {
        observadores.forEach(x -> x.update());
    }
}