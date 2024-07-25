import entities.*;
import enums.TipoDipartimento;
import interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {
        //--------------------------ESERCIZIO1-------------------------------

       /* Dipendente mario = new Dipendente(123, 2000.00, TipoDipartimento.AMMINISTRAZIONE);
        Dipendente maria = new Dipendente(453, 2200.00, TipoDipartimento.PRODUZIONE);
        Dipendente paolo = new Dipendente(965, 1800.00, TipoDipartimento.VENDITE);

        //creo un array di dipendenti
        Dipendente[] dipendenti = {mario, maria, paolo};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }*/

        //-------------------------ESRECIZIO 2----------------------------------
//creazione istanze dipendenti
        DipendenteFullTime mario = new DipendenteFullTime(254, 1800.00, TipoDipartimento.PRODUZIONE);
        DipendentePartTime elena = new DipendentePartTime(123, 4, 9, TipoDipartimento.VENDITE);
        Dirigente tom = new Dirigente(545, 4000.00, TipoDipartimento.AMMINISTRAZIONE);

        //creazione istanze volontari
        Volontario vol1 = new Volontario("Piero", 22, "Cv");
        Volontario vol2 = new Volontario("Marta", 25, "Cv");
        Volontario vol3 = new Volontario("Enrico", 27, "Cv");

        Dipendente[] dipendenti = {mario, elena, tom};

        CheckIn[] persone = {mario, elena, tom, vol1, vol2, vol3};

        double sommaStipendi = 0.0;

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipedio: " + dipendente.calculateSalary());
            sommaStipendi += dipendente.calculateSalary();
        }

        System.out.println("Somma Stipendi: " + sommaStipendi);
        
        System.out.println("------------CHECK-IN-----------------");
        for (CheckIn persona : persone) {
            persona.checkIn();
        }
    }
}