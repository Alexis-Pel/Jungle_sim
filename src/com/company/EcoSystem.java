package com.company;

public class EcoSystem {
    int Width;
    int Height;
    private WaterSpot waterSpot;

    /***
     * Constructeur de la classe
     * L'écosystème est résponsable de la créationd des élements qu'il contient
     */
    public EcoSystem(){
        Height = 30;
        Width = 120;
        //On définit le WaterSpot pour qu'il fasse une taille du quart du terrain de l'écosystème
        waterSpot = new WaterSpot(500, Width/4, Height/4);
    }
}
