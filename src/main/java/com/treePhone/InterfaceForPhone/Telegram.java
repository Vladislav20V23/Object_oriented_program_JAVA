package com.treePhone.InterfaceForPhone;

public interface Telegram {
    public void MessageTelegram();

    public default void VideoCall(){
        System.out.println("Видеозвонок Telegram");
    }
}
