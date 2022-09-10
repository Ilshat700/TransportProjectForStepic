package com.transport.military;
// боевой вертолёт
public class CombatHelicopter implements ShotService{
    @Override
    public void makeAShot() {
        System.out.println("стрелять из вертолёта");
    }
}
