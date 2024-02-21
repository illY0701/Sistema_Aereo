package viagem;

import java.util.ArrayList;

public class Impressao_Passagem extends Voos {
	
	public Impressao_Passagem(String numero, String Origem, String Destino, int assentosDisponiveis) {
		super(numero, Origem, Destino, assentosDisponiveis);
	}
	
	public static void main(String[] args) {
		ArrayList<Voos> Voos = new ArrayList<>();
		
		//no papel ta falando que o cliente precisa solicitar para aparecer isso
		//quem sabe um botão tipo "imprimir passagem" ai mostra as infos abaixo
		
		//imprimirPassagem(): imprime a passagem.
		//no caso, precisa sim
		
		for (Voos Vous : Voos) {
			Vous.MostrarInfos();
			System.out.println("--------------");
		}
	}

}