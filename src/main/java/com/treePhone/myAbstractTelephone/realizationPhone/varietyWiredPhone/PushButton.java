package com.treePhone.myAbstractTelephone.realizationPhone.varietyWiredPhone;

import com.treePhone.myAbstractTelephone.realizationPhone.WiredPhone;

public class PushButton extends WiredPhone {

    @Override
    public void cableBreakageSearch(){
        System.out.println("PushButton выполняет поиск повреждений кабеля");
    }

    public void screenLock(){
        System.out.println("PushButton блокирует экран");
    }


}
