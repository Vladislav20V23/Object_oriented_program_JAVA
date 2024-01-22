package com.Users;

import com.treePhone.InterfaceForPhone.Telegram;
import com.treePhone.myAbstractTelephone.Telephone;
import lombok.Data;

@Data
public class User {


    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, Telephone telephone){
        telephone.call(number);
    }

    public void aa(Telegram telegram){
        telegram.MessageTelegram();
    }
    
    


}
