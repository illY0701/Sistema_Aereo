package viagem;

public class Reserva_Assento extends Voos{
	

	public Reserva_Assento(String numero, String Origem, String Destino, int assentosDisponiveis) {
		super(numero, Origem, Destino, assentosDisponiveis);
	}
	
	//Cliente escolhe o voo desejado
	//sistema verifica disponibilidade
	//se assento tiver, efetua a reserva
}