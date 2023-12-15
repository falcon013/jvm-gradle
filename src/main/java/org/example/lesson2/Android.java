package org.example.lesson2;

abstract class Android extends Phone {
    public void move(){
        System.out.println("Move...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending SMS...");
    }
}

