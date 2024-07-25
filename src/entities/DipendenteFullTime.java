package entities;

import enums.TipoDipartimento;

public class DipendenteFullTime extends Dipendente {
    //COSTRUTTORE
    public DipendenteFullTime(int matricola, double stipendio, TipoDipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {

        return getStipendio(); //stipendio fisso mensile
    }
}
