package com.treePhone.myAbstractTelephone.realizationPhone;

import com.treePhone.myAbstractTelephone.Telephone;
import lombok.Data;

@Data
public class WiredPhone extends Telephone {

    @Override
    public void call(int number) {System.out.println("wiredPhone вызывает номер " + number);}


    public void disable() {
        System.out.println("wiredPhone отключен");
    }

    public void cableBreakageSearch(){
        System.out.println("Поиск повреждений кабеля");
    }

}
