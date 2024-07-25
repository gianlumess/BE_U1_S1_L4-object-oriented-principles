package entities;

import interfaces.CheckIn;

public class Volontario implements CheckIn {
    //ATTRIBUTI
    private String nome;
    private int eta;
    private String cv;

    //COSTRUTTORE
    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " inizia il suo servizio.");
    }
}
