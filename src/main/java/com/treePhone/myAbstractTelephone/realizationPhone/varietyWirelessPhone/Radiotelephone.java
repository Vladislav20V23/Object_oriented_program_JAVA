package com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone;

import com.treePhone.myAbstractTelephone.realizationPhone.WirelessPhone;
import lombok.Data;

@Data
public class Radiotelephone extends WirelessPhone {

    protected int power;

    public void frequencySetting(int frequency){
        System.out.println("radiotelephone настройка частоты " + frequency);
    }

    @Override
    public void call(int number) {
        System.out.println("radiotelephone вызывает номер " + number + " мощность = " + power);
    }


    public Radiotelephone(int power) {
        this.power = power;
    }

    public Radiotelephone() {
    }
}
