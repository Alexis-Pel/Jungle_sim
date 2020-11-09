package com.company;

public class Predator {
    static final int AgeMaxAll = 40;
    int Age;
    int AgeMax;

    static final int NbLifePointsMaxAll = 120;
    int NbLifePoints;
    int NbLifePointsMax;

    Smelling smelling;
    Vision vision;

    public void hunt(Prey prey){}
    public void mate(Predator predator){}
    public void eat(Prey prey){}
    public void drink(WaterSpot waterSpot){}
    public void move(){}
}
