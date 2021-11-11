package com.umanizales;

import com.umanizales.model.Costumer;
import com.umanizales.model.Notification;
import com.umanizales.model.Subject;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        var costumer1 = new Costumer(subject);
        costumer1.setName("Mauricio Quintero");
        costumer1.setEmail("mauroqr94@gmail.com");
        costumer1.setPhone_number("311 395 8043");

        new Costumer(subject);
        new Costumer(subject);
        new Costumer(subject);

        var notification = new Notification();
        notification.setDescription("Aprovecha el descuento del 15% en cilindros de 33lbr y 40lbr del 25 al 27 de octubre.");

        subject.setNotification(notification);

    }
}
