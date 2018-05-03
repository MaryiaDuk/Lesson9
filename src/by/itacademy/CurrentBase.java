package by.itacademy;

import by.itacademy.OfflineBase.OfflinePatientBase;
import by.itacademy.OnlineBase.OnlinePatientBase;

import java.util.HashSet;


public class CurrentBase {
    private HashSet<Patient> list;

    public HashSet<Patient> getCurrentBase(){
        OnlinePatientBase onlinePatientBase = new OnlinePatientBase();
        OfflinePatientBase offlinePatientBase = new OfflinePatientBase();
        list = offlinePatientBase.readData();
        list.addAll(onlinePatientBase.getOnlineBase());
        return list;
    }
}