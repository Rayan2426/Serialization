package com.projectclientserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",3000);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String response = in.readLine();

           XmlMapper xml = new XmlMapper();

           Aula aula = xml.readValue(response, Aula.class);

           System.out.println(aula.toString());

            // String[] dettagli = response.split(":");
            // System.out.println("Classe: " + dettagli[0]);

            // String[] rawList = dettagli[1].split(";");

            // for (String alunno : rawList) {
            //     String[] details = alunno.split(",");
            //     String nome = details[0];
            //     String cognome = details[1];
            //     String data = details[2];

            //     System.out.println("Nome: " + nome + "\tCognome: " + cognome + "\t\tData di Nascita: " + data);
            // }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}