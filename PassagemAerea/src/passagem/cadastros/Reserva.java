package passagem.cadastros;

import javax.swing.*;

import passagem.cadastros.Voos.TipoPagamento;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Reserva extends JFrame {
    private List<Voos> voos;
    private List<Reserva> reservas;
    private JList<Voos> listaVoos;
    private JButton botaoReservar;
    private JTextField campoNomePassageiro;
    private JRadioButton opcaoIda;
    private JRadioButton opcaoIdaVolta;
    private JCheckBox checkPontosTuristicos;
    private JButton botaoPagar;
    private JButton botaoImprimirPassagem;
    private JTextField dest;

    public Reserva() {
        super("Sistema de Reservas de Assentos");
        initComponents();
    }

 

	public Reserva(Voos voo, String nmPassageiro) {
		// TODO Auto-generated constructor stub
	}



	private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,  600);

        voos = new ArrayList<>();
        reservas = new ArrayList<>();
        getContentPane().setLayout(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBounds(0, 0, 784, 561);
        painelPrincipal.setLayout(null);

        listaVoos = new JList<>(new DefaultListModel<>());
        JScrollPane scrollPane = new JScrollPane(listaVoos);
        scrollPane.setBounds(0, 69, 784, 459);
        painelPrincipal.add(scrollPane);
        
        JLabel Destino = new JLabel("Destino:");
        
		scrollPane.setColumnHeaderView(Destino);
        
        dest = new JTextField();
        scrollPane.setRowHeaderView(dest);
        dest.setColumns(10);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setBounds(0, 528, 784, 33);
        botaoReservar = new JButton("Reservar");
        botaoPagar = new JButton("Pagar");
        botaoImprimirPassagem = new JButton("Imprimir Passagem");
        painelBotoes.add(botaoReservar);
        painelBotoes.add(botaoPagar);
        painelBotoes.add(botaoImprimirPassagem);
        painelPrincipal.add(painelBotoes);

        JPanel painelInformacoes = new JPanel();
        painelInformacoes.setBounds(0, 0, 784, 69);
        painelInformacoes.setLayout(new GridLayout(3,  2));
        opcaoIda = new JRadioButton("Ida");
        opcaoIdaVolta = new JRadioButton("Ida e Volta");
        checkPontosTuristicos = new JCheckBox("Pontos Turísticos");
        painelInformacoes.add(new JLabel("Nome:"));
        campoNomePassageiro = new JTextField();
        painelInformacoes.add(campoNomePassageiro);
        painelInformacoes.add(new JLabel("Tipo de Pagamento:"));
        painelInformacoes.add(opcaoIda);
        painelInformacoes.add(opcaoIdaVolta);
        painelInformacoes.add(checkPontosTuristicos);
        painelPrincipal.add(painelInformacoes);

        getContentPane().add(painelPrincipal);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(0, 0, 46, 14);
        getContentPane().add(lblNewLabel);

        // Ações dos botões
        botaoReservar.addActionListener(e -> realizarReserva());
        botaoPagar.addActionListener(e -> realizarPagamento());
        botaoImprimirPassagem.addActionListener(e -> imprimirPassagem());
    }
    

    private void realizarReserva() {
    	// Obter o destino digitado pelo usuário
        String destino = dest.getText();
        if (destino.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o destino!");
            return;
        }

        
        Voos vooSelecionado = null;
        for (Voos voo : voos) {
            if (voo.getDestino().equalsIgnoreCase(destino)) {
                vooSelecionado = voo;
                break;
            }
        }

        if (vooSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Voo para o destino especificado não encontrado!");
            return;
        }

        String nmPassageiro = campoNomePassageiro.getText();
        if (nmPassageiro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do passageiro!");
            return;
        }

        if (realizarReserva(vooSelecionado, nmPassageiro)) {
            JOptionPane.showMessageDialog(this, "Assento reservado com sucesso!");
            atualizarListaVoos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao reservar assento!");
        }
    }

    private void atualizarListaVoos() {
        DefaultListModel<Voos> modeloLista = (DefaultListModel<Voos>) listaVoos.getModel();
        modeloLista.clear();
        for (Voos voo : voos) {
            modeloLista.addElement(voo);
        }
    }

    public boolean realizarReserva(Voos vooSelecionado, String nmPassageiro) {
        boolean reservaBemSucedida = vooSelecionado.reservaAssentos(nmPassageiro);

        if (reservaBemSucedida) {
            JOptionPane.showMessageDialog(this, "Assento reservado com sucesso!");
            atualizarListaVoos();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao reservar assento!");
            return false;
        }
    }

    private void realizarPagamento() {
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma reserva realizada!");
            return;
        }

        Reserva ultimaReserva = reservas.get(reservas.size() -  1);

        TipoPagamento tipoPagamento;
        if (opcaoIda.isSelected()) {
            tipoPagamento = TipoPagamento.ida;
        } else if (opcaoIdaVolta.isSelected()) {
            tipoPagamento = TipoPagamento.ida_volta;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o tipo de pagamento!");
            return;
        }

    }

    private void imprimirPassagem() {
        TipoPagamento tipoPagamento;
        if (opcaoIda.isSelected()) {
            tipoPagamento = TipoPagamento.ida;
        } else if (opcaoIdaVolta.isSelected()) {
            tipoPagamento = TipoPagamento.ida_volta;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o tipo de pagamento!");
            return;
        }
        }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Reserva sistema = new Reserva();
            sistema.setVisible(true);
        });
    }
}
