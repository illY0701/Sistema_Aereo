package passagem.cadastros;

public class Main {
	public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto(); // Cria uma nova instância de Aeroporto.

        // Cria um novo voo
        Voos novoVoo = new Voos();
        novoVoo.setNumeroVoo("AA123");
        novoVoo.setOrigem("São Paulo");
        novoVoo.setDestino("Rio de Janeiro");
        novoVoo.setVlPass_ida(120);
        novoVoo.setVlPass_ida_volta(200);
        // Aqui você pode definir outras propriedades do voo conforme necessário.

        // Adiciona o novo voo ao aeroporto
        aeroporto.cadastrarVoo(novoVoo);

        // Lista todos os voos disponíveis no aeroporto
        aeroporto.listarVoos();
    }

}
