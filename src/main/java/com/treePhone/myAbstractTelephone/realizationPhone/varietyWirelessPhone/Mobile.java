package com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone;

import com.treePhone.myAbstractTelephone.realizationPhone.WirelessPhone;

public class Mobile extends WirelessPhone {

    protected String operator;

    public void call(int number){
        System.out.println("Mobile вызывает  номер " + number);
    }

    public void checkingSIMCard(){
        System.out.println("Mobile проверяет состояние сим карты");
    }


}
