package com.projectclientserver;

import java.util.ArrayList;

public class Aula {
    private ArrayList<Alunno> alunni;
    String sezione;
    public Aula(String sezione){
        this.sezione = sezione;
        alunni = new ArrayList<>();
    }

    public Aula(){}

    public void addAlunno(Alunno A){
        alunni.add(A);
    }

    public void addAlunno(String nome, String cognome, String annoNascita){
        alunni.add(new Alunno(nome, cognome, annoNascita));
    }


    @Override
    public String toString() {
        String respone ="Classe: " +  this.sezione + "\n";

        for (Alunno alunno : alunni) {
            respone += "Nome: " + alunno.getNome() + "\tCognome: " + alunno.getCognome() + "\tData di Nascita: " + alunno.getDataNascita() + "\n";
        }

        return respone.isEmpty() ? "none" : respone;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }

    public String getSezione() {
        return sezione;
    }
}
