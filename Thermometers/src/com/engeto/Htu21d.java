package com.engeto;

public class Htu21d {

    private final int address = 0x40;
    private float lastTemperature;


    public float readTemperature(){
        lastTemperature = generateNumber(-40, 40);
        return lastTemperature;
    }

    private float generateNumber(int min, int max){
        return (float) Math.random() * (max - min) + min;
    }

    public int getAddress() {
        return address;
    }

    public float getLastTemperature() {
        return lastTemperature;
    }



}
