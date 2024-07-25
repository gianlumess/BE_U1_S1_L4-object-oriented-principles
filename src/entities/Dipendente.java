package entities;

import enums.TipoDipartimento;
import interfaces.CheckIn;

public abstract class Dipendente implements CheckIn {
    //ATTRIBUTI
    private int matricola;
    private double stipendio;
    private TipoDipartimento dipartimento;

    //COSTRUTTORE
    public Dipendente(int matricola, double stipendio, TipoDipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //METODI
    public abstract double calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola: " + matricola + " inizia il turno di lavoro.");
    }
}
