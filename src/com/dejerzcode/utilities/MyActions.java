package com.dejerzcode.utilities;

import com.dejerzcode.entities.User;

import java.util.Scanner;

public class MyActions {
    private static Scanner scan = new Scanner(System.in);
    public static int menu(){
        int opt;
        do {
            opt = 0;
            System.out.println("Menú:");
            System.out.println("1. Ingresar Doctor");
            System.out.println("2. Ingresar Enfermera");
            System.out.println("3. Ingresar Paciente");
            System.out.println("4. Mostrar personas");
            System.out.println("0. Salir");
            opt = scanInt(opt);
        }  while (opt == -999 );
        return opt;
    }
    public static int scanInt(int opt){
        try {
            opt = scan.nextInt();
        } catch(Exception e) {
            opt = -999;
            System.out.println("No ingresaste un número entero");
            scan.nextLine();
        }
        return opt;
    }
    //Overload
    public static int scanInt(){
        int value;
        do {
            try {
                value = scan.nextInt();
                scan.nextLine();
            } catch(Exception e) {
                value = 0;
                System.out.println("No ingresaste un número válido");
                scan.nextLine();
            }
        } while (value == 0);
        return value;
    }

    public static String scanString(){
        return scan.nextLine();
    }
    public static void print(Object value){
        System.out.println(value);
    }

    public static void setUser(User newUser){
        print("Ingrese ID");
        newUser.setId(scanInt());
        print("Ingrese Nombre");
        newUser.setName(scanString());
        print("Ingrese Dirección");
        newUser.setAddress(scanString());
        print("Ingrese Teléfono");
        newUser.setPhoneNumber(scanString());
    }
}
