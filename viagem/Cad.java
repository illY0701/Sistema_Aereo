package viagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Cad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numeroVoo;
	private JTextField origem;
	private JTextField destino;
	private JTextField assento;
	private JTextField Livre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cad frame = new Cad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(146, 201, 201));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Painel_Cad = new JPanel();
		Painel_Cad.setBounds(27, 10, 330, 302);
		contentPane.add(Painel_Cad);
		Painel_Cad.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro De Voo");
		lblNewLabel.setForeground(new Color(146, 201, 201));
		lblNewLabel.setBounds(75, 10, 177, 43);
		Painel_Cad.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		
		JLabel txt_num = new JLabel("Número do Voo");
		txt_num.setForeground(new Color(97, 97, 97));
		txt_num.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_num.setBounds(10, 71, 124, 22);
		Painel_Cad.add(txt_num);
		
		numeroVoo = new JTextField();
		numeroVoo.setBounds(10, 101, 310, 19);
		Painel_Cad.add(numeroVoo);
		numeroVoo.setColumns(10);
		
		JLabel txt_origem = new JLabel("Origem");
		txt_origem.setBounds(10, 130, 124, 27);
		Painel_Cad.add(txt_origem);
		txt_origem.setForeground(new Color(97, 97, 97));
		txt_origem.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		
		origem = new JTextField();
		origem.setColumns(10);
		origem.setBounds(10, 156, 310, 19);
		Painel_Cad.add(origem);
		
		JLabel txt_destino = new JLabel("Destino");
		txt_destino.setForeground(new Color(97, 97, 97));
		txt_destino.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_destino.setBounds(10, 185, 124, 27);
		Painel_Cad.add(txt_destino);
		
		destino = new JTextField();
		destino.setColumns(10);
		destino.setBounds(10, 210, 310, 19);
		Painel_Cad.add(destino);
		
		JLabel txt_assento = new JLabel("Assento Requerido");
		txt_assento.setForeground(new Color(97, 97, 97));
		txt_assento.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_assento.setBounds(10, 239, 152, 27);
		Painel_Cad.add(txt_assento);
		
		assento = new JTextField();
		assento.setColumns(10);
		assento.setBounds(10, 268, 143, 19);
		Painel_Cad.add(assento);
		
		JLabel txt_livre = new JLabel("Assentos Livres");
		txt_livre.setForeground(new Color(97, 97, 97));
		txt_livre.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_livre.setBounds(188, 239, 132, 27);
		Painel_Cad.add(txt_livre);
		
		Livre = new JTextField();
		Livre.setColumns(10);
		Livre.setBounds(177, 268, 143, 19);
		Painel_Cad.add(Livre);
		
		JPanel Painel_Pag = new JPanel();
		Painel_Pag.setBounds(27, 322, 330, 176);
		contentPane.add(Painel_Pag);
		Painel_Pag.setLayout(null);
		
		JLabel txt_paggg = new JLabel("Pagamento");
		txt_paggg.setBounds(99, 10, 128, 33);
		txt_paggg.setForeground(new Color(146, 201, 201));
		txt_paggg.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		txt_paggg.setBackground(UIManager.getColor("Button.background"));
		Painel_Pag.add(txt_paggg);
		
		JLabel txt_pag = new JLabel("Forma de pagamento");
		txt_pag.setForeground(new Color(97, 97, 97));
		txt_pag.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_pag.setBounds(10, 53, 165, 22);
		Painel_Pag.add(txt_pag);
		
		JButton credito = new JButton("Credito");
		credito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		credito.setForeground(new Color(97, 97, 97));
		credito.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		credito.setBounds(20, 85, 85, 21);
		Painel_Pag.add(credito);
		
		JButton debito = new JButton("Debito");
		debito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		debito.setForeground(new Color(97, 97, 97));
		debito.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		debito.setBounds(115, 85, 94, 21);
		Painel_Pag.add(debito);
		
		JButton pix = new JButton("Pix");
		pix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pix.setForeground(new Color(97, 97, 97));
		pix.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		pix.setBounds(219, 85, 85, 21);
		Painel_Pag.add(pix);
		
		JLabel txt_tipo_viagem = new JLabel("Tipo de viagem");
		txt_tipo_viagem.setForeground(new Color(97, 97, 97));
		txt_tipo_viagem.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		txt_tipo_viagem.setBounds(10, 116, 165, 22);
		Painel_Pag.add(txt_tipo_viagem);
		
		JButton ida = new JButton("Soamente Ida");
		ida.setForeground(new Color(97, 97, 97));
		ida.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		ida.setBounds(20, 145, 128, 21);
		Painel_Pag.add(ida);
		
		JButton ida_volta = new JButton("Ida e Volta");
		ida_volta.setForeground(new Color(97, 97, 97));
		ida_volta.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		ida_volta.setBounds(167, 145, 137, 21);
		Painel_Pag.add(ida_volta);
		
		JPanel Painel_imp = new JPanel();
		Painel_imp.setBounds(379, 10, 330, 488);
		contentPane.add(Painel_imp);
		
		JLabel lblImpressaoDaPassagem = new JLabel("Impressaão da Passagem");
		lblImpressaoDaPassagem.setForeground(new Color(146, 201, 201));
		lblImpressaoDaPassagem.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		lblImpressaoDaPassagem.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnCadastrar = new JButton("Cadastro");
		btnCadastrar.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String numero = numeroVoo.getText();
			    String Origem = origem.getText();
			    String Destino = destino.getText();
			    int assentosDisponiveis = Integer.parseInt(Livre.getText());

			    Voos voo = new Voos(numero, Origem, Destino, assentosDisponiveis);
			   

			    if (numero != null && origem != null && destino != null && assentosDisponiveis >  0) {
			        JOptionPane.showMessageDialog(contentPane, "Cadastro concluído!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
			    } else {
			        JOptionPane.showMessageDialog(contentPane, "Alguma coisa está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
			    }
			   
			    
			}
		});
		
		JButton btnImpressao = new JButton("Impressão");
		btnImpressao.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		btnImpressao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnReserva = new JButton("Reserva");
		btnReserva.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_Painel_imp = new GroupLayout(Painel_imp);
		gl_Painel_imp.setHorizontalGroup(
			gl_Painel_imp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel_imp.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_Painel_imp.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImpressaoDaPassagem)
						.addGroup(gl_Painel_imp.createSequentialGroup()
							.addComponent(btnCadastrar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnImpressao)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReserva)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Painel_imp.setVerticalGroup(
			gl_Painel_imp.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Painel_imp.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImpressaoDaPassagem)
					.addPreferredGap(ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
					.addGroup(gl_Painel_imp.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnImpressao)
						.addComponent(btnReserva))
					.addContainerGap())
		);
		Painel_imp.setLayout(gl_Painel_imp);
	}
}