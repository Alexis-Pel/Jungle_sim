package com.company;

public class WaterSpot {
    int WaterQuantity;
    int Width;
    int Height;
    Coords coords;

    public WaterSpot(int p_WaterQuantity, int p_Width, int p_Height){
        WaterQuantity = p_WaterQuantity;
        Width = p_Width;
        Height = p_Height;
        coords = new Coords();
    }
}
