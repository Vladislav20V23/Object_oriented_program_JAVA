package com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone.varietyMobile;

import com.treePhone.InterfaceForPhone.Telegram;
import com.treePhone.InterfaceForPhone.Viber;
import com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone.Mobile;

public class BasicModel extends Mobile implements Viber, Telegram {

    public int cache;

    public void checkingSIMCard(){
        System.out.println("Mobile BasicModel проверяет состояние сим карты");
    }

    public void deleteContactData(){System.out.println("Mobile BasicModel очищает кэш данных");}

    @Override
    public void MessageTelegram() {
        System.out.println("Получение сообщения Telegram");
    }

    @Override
    public void downloadFile() {
        System.out.println("Загрузка файла downloadFile");
    }
}
