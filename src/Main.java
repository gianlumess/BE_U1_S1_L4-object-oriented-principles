import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;
import enums.TipoDipartimento;

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

        DipendenteFullTime mario = new DipendenteFullTime(254, 1500.00, TipoDipartimento.PRODUZIONE);
        DipendentePartTime elena = new DipendentePartTime(123, 4, 12, TipoDipartimento.VENDITE);
        Dirigente tom = new Dirigente(545, 2200.00, TipoDipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {mario, elena, tom};

        double sommaStipendi = 0.0;
        for (Dipendente dipendente : dipendenti) {
            double stipendio = dipendente.calculateSalary();
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipedio: " + stipendio);
            sommaStipendi += stipendio;
        }
        System.out.println("Somma Stipendi: " + sommaStipendi);
    }
}