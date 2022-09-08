package com.transport.MilitaryTransport;
// танк
public class Tank implements ShotService{
    @Override
    public void makeAShot() {
        System.out.println("пальнуть из танка");
    }
}
