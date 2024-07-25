import entities.Dipendente;
import enums.TipoDipartimento;

public class Main {
    public static void main(String[] args) {
        Dipendente mario = new Dipendente(123, 2000.00, TipoDipartimento.AMMINISTRAZIONE);
        Dipendente maria = new Dipendente(453, 2200.00, TipoDipartimento.PRODUZIONE);
        Dipendente paolo = new Dipendente(965, 1800.00, TipoDipartimento.VENDITE);

        //creo un array di dipendenti
        Dipendente[] dipendenti = {mario, maria, paolo};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
    }
}