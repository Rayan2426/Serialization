package com.projectclientserver;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Aula aula = new Aula("5DIA");
        aula.addAlunno("Marco","Deng","23/07/2005");
        aula.addAlunno("Luigi","Socci","2/03/2004");
        aula.addAlunno("Anatolie","Gonzales","13/12/2012");
        aula.addAlunno("Rayan","Einstein","21/07/2005");
        aula.addAlunno("Lorenzo","Turing","31/05/2001");
        try {
            ServerSocket server = new ServerSocket(3000);
            do{
                System.out.println("SERVER IN ASCOLTO");
                Socket s = server.accept();
                System.out.println("UN CLIENT SI E' CONNESSO");
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                out.writeBytes(aula.toString() + "\n");
                System.out.println("LISTA ALUNNI MANDATA");
            }while(true);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}