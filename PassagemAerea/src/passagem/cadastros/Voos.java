package passagem.cadastros;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Voos implements Serializable  {
	
	    
	private static final long serialVersionUID = 1L;
		private String numeroVoo;
	    private String origem;
	    private String destino;
	    private int assentosDisponiveis;
	    private double vlPass_ida;
	    private double vlPass_ida_volta;
	    private TipoPagamento tipoPagamento;

	    public Voos() {
	        this.numeroVoo = numeroVoo;
	        this.origem = origem;
	        this.destino = destino;
	        this.assentosDisponiveis = assentosDisponiveis;
	        this.vlPass_ida = vlPass_ida;
	        this.vlPass_ida_volta = vlPass_ida_volta;
	        this.tipoPagamento = TipoPagamento.ida;
	    }

		public boolean realizarReserva(int quantidadeAssentos) {
	        if (assentosDisponiveis >= quantidadeAssentos) {
	            assentosDisponiveis -= quantidadeAssentos;
	            return true;
	        }
	        return false;
	    }

	    public boolean verificarDisponibilidade(int quantidadeAssentos) {
	        return assentosDisponiveis >= quantidadeAssentos;
	    }
	    
	    public enum TipoPagamento {
	        ida,
	        ida_volta,
	        ida_c_tur,
	        ida_volta_c_tur
	        
	    }
	    
	    public void definirTipoPagamento(TipoPagamento tipo) {
	        this.tipoPagamento = tipo;
	    }

	    public void realizarPagamento() {
	    	switch (tipoPagamento) {
            case ida:
                System.out.println("Pagamento realizado no valor de R$" + vlPass_ida +" para somente ida.");
                break;
                
            case ida_volta:
                System.out.println("Pagamento realizado no valor de R$" + vlPass_ida_volta +"  para ida e volta.");
                break;
                
            case ida_c_tur:
            	double ida_tur = vlPass_ida + 0.10;
                System.out.println("Pagamento realizado no valor de R$" + ida_tur +"  para ida mais taxa para pontos turísticos.");
                break;
                
            case ida_volta_c_tur:
            	double idaV_tur = vlPass_ida + 0.10;
                System.out.println("Pagamento realizado no valor de R$" +idaV_tur +"  para ida e volta mais taxa para pontos turísticos.");
                break;
                
            default:
                System.out.println("Tipo de pagamento não reconhecido.");
                break;
        }	    }

	    public void imprimirPassagem() {
	    	
	    		System.out.println("Número do Voo " + numeroVoo);
	    		System.out.println("Origem: " + origem);
	    		System.out.println("Destino: " + destino);
	    		System.out.println("Assentos Disponiveis " + assentosDisponiveis);
	    		System.out.println("Tipo de pagamento: " + tipoPagamento);
	    	
	    }

		public String getNumeroVoo() {
			return numeroVoo;
		}

		public void setNumeroVoo(String numeroVoo) {
			this.numeroVoo = numeroVoo;
		}

		public String getOrigem() {
			return origem;
		}

		public void setOrigem(String origem) {
			this.origem = origem;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public int getAssentosDisponiveis() {
			return assentosDisponiveis;
		}

		public void setAssentosDisponiveis(int assentosDisponiveis) {
			this.assentosDisponiveis = assentosDisponiveis;
		}

		public TipoPagamento getTipoPagamento() {
			return tipoPagamento;
		}

		public void setTipoPagamento(TipoPagamento tipoPagamento) {
			this.tipoPagamento = tipoPagamento;
		}
		
		
		
		public double getVlPass_ida_volta() {
			return vlPass_ida_volta;
		}

		public void setVlPass_ida_volta(double vlPass_ida_volta) {
			this.vlPass_ida_volta = vlPass_ida_volta;
		}

		public double getVlPass_ida() {
			return vlPass_ida;
		}

		public void setVlPass_ida(double vlPass_ida) {
			this.vlPass_ida = vlPass_ida;
		}



		public void salvarVoos(Map<String, Voos> voo, String arquivo) {
		    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
		        oos.writeObject(voo);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

		

		public boolean reservaAssentos(String nmPassageiro) {
			// TODO Auto-generated method stub
			return false;
		}

	    
	

}
