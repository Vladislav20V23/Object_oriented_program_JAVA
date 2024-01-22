package com.treePhone.myAbstractTelephone;

import lombok.Data;

@Data
public abstract class Telephone {

    private int charge;
    private String touchScreen;


    public void disable(){System.out.println("Телефон отключен");};

    public void turnOn(){System.out.println("Телефон включен");};

    public abstract void call(int number);


}
