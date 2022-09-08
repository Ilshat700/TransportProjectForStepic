package com.transport.MilitaryTransport;
// артиллерия
public class Artillery implements ShotService{
    @Override
    public void makeAShot() {
        System.out.println("Выпустить ракеты");
    }
}
