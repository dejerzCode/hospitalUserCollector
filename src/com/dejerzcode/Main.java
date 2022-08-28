package com.dejerzcode;

import com.dejerzcode.data.UserData;
import com.dejerzcode.entities.Doctor;
import com.dejerzcode.entities.Nurse;
import com.dejerzcode.entities.Patient;
import com.dejerzcode.entities.User;
import com.dejerzcode.utilities.MyActions;

public class Main extends MyActions {
    public static void main(String[] args) {
        UserData userDataList = new UserData();
        Doctor newDoctor = new Doctor();
        Nurse newNurse = new Nurse();
        Patient newPatient = new Patient();
        boolean exit = false;
        do {
            switch (menu()){
                case 0:
                    print("Bye bye");
                    exit = true;
                    break;
                case 1:
                    setUser(newDoctor);
                    print("Ingrese Especialidad");
                    newDoctor.setSpeciality(scanString());
                    userDataList.addToList(newDoctor);
                    break;
                case 2:
                    setUser(newNurse);
                    print("Ingrese Especialidad");
                    newNurse.setSpeciality(scanString());
                    userDataList.addToList(newNurse);
                    break;
                case 3:
                    setUser(newPatient);
                    print("Ingrese Nacimiento");
                    newPatient.setBirthday(scanString());
                    print("Ingrese Peso");
                    newPatient.setWeight(Double.parseDouble(scanString()));
                    print("Ingrese Altura");
                    newPatient.setHeight(Double.parseDouble(scanString()));
                    print("Ingrese Tipo de sangre");
                    newPatient.setBloodType(scanString());
                    userDataList.addToList(newPatient);
                    break;
                case 4:
                    if (userDataList.getAllUsers().size() != 0) {
                        for (User user : userDataList.getAllUsers()){
                            print(user.toString());
                        }
                    } else {
                        print("No hay usuarios");
                    }

                    break;
                default:
                    print("I'm not here");
            }
        } while (!exit);
    }
}
