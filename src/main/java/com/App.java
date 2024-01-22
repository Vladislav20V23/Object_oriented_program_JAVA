package com;

import com.Users.User;
import com.treePhone.myAbstractTelephone.Telephone;
import com.treePhone.myAbstractTelephone.realizationPhone.WiredPhone;
import com.treePhone.myAbstractTelephone.realizationPhone.WirelessPhone;
import com.treePhone.myAbstractTelephone.realizationPhone.varietyWiredPhone.PushButton;
import com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone.Radiotelephone;
import com.treePhone.myAbstractTelephone.realizationPhone.varietyWirelessPhone.varietyMobile.BasicModel;



public class App
{
    public static void main( String[] args )
    {

        User userVlad = new User("Vlad");
        Telephone telephoneWiredPhone = new WiredPhone();
        WiredPhone wiredPhone = new WiredPhone();
        Telephone telephoneWirelessPhone = new WirelessPhone();
        PushButton pushButton = new PushButton();
        Telephone radiotelephoneTelephone = new Radiotelephone(55);
        Radiotelephone radiotelephone = new Radiotelephone(98733);
        Telephone basicModelTelephone = new BasicModel();
        BasicModel basicModel = new BasicModel();


        userVlad.callAnotherUser(794932494, basicModel);
        userVlad.callAnotherUser(796484365, pushButton);
        System.out.println(" ");

        telephoneWiredPhone.disable();
        telephoneWiredPhone.call(999);
        telephoneWiredPhone.turnOn();
        System.out.println(" ");

        wiredPhone.disable();
        wiredPhone.call(5666);
        wiredPhone.turnOn();
        System.out.println(" ");

        telephoneWirelessPhone.call(876);
        telephoneWirelessPhone.disable();
        telephoneWirelessPhone.turnOn();
        System.out.println(" ");

        pushButton.screenLock();
        pushButton.cableBreakageSearch();
        pushButton.call(991);
        System.out.println(" ");

        radiotelephoneTelephone.disable();
        radiotelephoneTelephone.call(113);
        radiotelephoneTelephone.turnOn();
            radiotelephone.frequencySetting(8888888);
        System.out.println(" ");

            basicModelTelephone.call(984);
        basicModel.checkingSIMCard();
        basicModel.deleteContactData();
        basicModel.disable();
        basicModel.MessageTelegram();
        basicModel.downloadFile();
        basicModel.VideoCall();
        System.out.println(" ");



    }
}
