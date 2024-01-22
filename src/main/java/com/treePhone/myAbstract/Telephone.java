package com.myAbstract;

public abstract class Telephone {

    private int charge;
    private String touchScreen;


    public Telephone(int charge, String touchScreen) {
        this.charge = charge;
        this.touchScreen = touchScreen;
    }

    private void call(int number){System.out.println("Звонок по номеру " + number);}

}
