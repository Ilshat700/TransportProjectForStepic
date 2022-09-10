package com.transport.military;
// танк
public class Tank implements ShotService{
    @Override
    public void makeAShot() {
        System.out.println("пальнуть из танка");
    }
}
