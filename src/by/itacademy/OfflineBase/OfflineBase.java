package by.itacademy.OfflineBase;

import by.itacademy.Patient;

import java.util.HashSet;

public interface OfflineBase {
    void writeData(HashSet<Patient> patientsList);

    HashSet<Patient> readData();
}