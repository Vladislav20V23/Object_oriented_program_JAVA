package com.treePhone.myAbstractTelephone.realizationPhone.varietyWiredPhone;

import com.treePhone.myAbstractTelephone.realizationPhone.WiredPhone;

public class Disk extends WiredPhone {
    @Override
    public void call(int number) {
        System.out.println("Disk вызывает номер " + number);
    }

    public void disable() {
        System.out.println("Disk отключен");
    }

    public void writingToDisk(){
        System.out.println("Запись на диск");}

}
