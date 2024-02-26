package passagem.cadastros;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nmPassageiro;
    private Voos voo;
    private List<Reserva> reservas; // Lista de reservas do cliente

    public Cliente(Voos voo, String nmPassageiro) {
        this.voo = voo;
        this.nmPassageiro = nmPassageiro;
        this.reservas = new ArrayList<>(); // Inicializa a lista de reservas
    }

    public String getNmPassageiro() {
        return nmPassageiro;
    }

    public void setNmPassageiro(String nmPassageiro) {
        this.nmPassageiro = nmPassageiro;
    }

    public boolean reserva() {
        if (voo.getAssentosDisponiveis() >  0) {
            Reserva reserva = new Reserva(voo, nmPassageiro);
            reservas.add(reserva);
            voo.setAssentosDisponiveis(voo.getAssentosDisponiveis() -  1);
            return true;
        }
        return false;
    }
}
