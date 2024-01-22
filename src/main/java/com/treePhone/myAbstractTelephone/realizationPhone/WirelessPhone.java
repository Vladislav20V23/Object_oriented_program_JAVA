package com.treePhone.myAbstractTelephone.realizationPhone;

import com.treePhone.myAbstractTelephone.Telephone;
import lombok.Data;

@Data
public class WirelessPhone extends Telephone {

    @Override
    public void call(int number) {
        System.out.println("WirelessPhone вызывает номер " + number);
    }

    public void disable() {
        System.out.println("WirelessPhone отключен");
    }

    protected void reboot() {
        System.out.println("WirelessPhone перезагрузка");
    }

}
