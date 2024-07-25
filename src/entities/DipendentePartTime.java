package entities;

import enums.TipoDipartimento;

public class DipendentePartTime extends Dipendente {
    //ATTRIBUTI
    private int oreLavorative;
    private double pagaOraria;

    //COSTRUTTORE
    public DipendentePartTime(int matricola, int oreLavorative, double pagaOraria, TipoDipartimento dipartimento) {
        super(matricola, oreLavorative * pagaOraria, dipartimento);
        this.oreLavorative = oreLavorative;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {

        return (oreLavorative * pagaOraria) * 80;
    }

    public int getOreLavorative() {
        return oreLavorative;
    }

    public double getPagaOraria() {
        return pagaOraria;
    }
}
