package passagem.cadastros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Aeroporto {
    private Map<String, Voos> voo;

    public Aeroporto() {
        voo = new HashMap<>();
        carregarVoos("voo.txt");
    }

    public void cadastrarVoo(Voos voos) {
        voo.put(voos.getNumeroVoo(), voos);
        salvarVoos("voo.txt"); // Salva os voos após cadastrar um novo
    }

    public Voos buscarVoo(String numeroVoo) {
        return voo.get(numeroVoo);
    }

    public void listarVoos() {
        for (Voos voo : voo.values()) {
            System.out.println(voo.getNumeroVoo() + " - " + voo.getOrigem() + " -> " + voo.getDestino());
        }
    }

    @SuppressWarnings("unchecked")
    private void carregarVoos(String arquivo) {
        File file = new File(arquivo);
        if (file.length() ==  0) {
            // O arquivo está vazio, inicializa um novo mapa
            voo = new HashMap<>();
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
                voo = (Map<String, Voos>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                // Caso ocorra um erro de IO ou se o objeto não for encontrado, inicializa um novo mapa
                voo = new HashMap<>();
            }
        }
    }

    private void salvarVoos(String arquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(voo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
