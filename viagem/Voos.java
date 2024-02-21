package viagem;




import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
	
	public class Voos  {
		
		
		public String numero;
		private String Origem;
		private String Destino;
		private int assentosDisponiveis;
		
		
		public Voos(String numero, String origem, String destino, int assentosDisponiveis ) {
			this.numero = numero;
			this.Origem = origem;
			this.Destino = destino;
			this.assentosDisponiveis = assentosDisponiveis;
			
		}
		 public void gravaArquivo(String numero, String origem, String destino, int assentosDisponiveis){ 
		    	try{ 
		    		File arquivo; arquivo = new File("DadosPassagens.txt"); 
		    		FileOutputStream gravador = new FileOutputStream(arquivo,true); 
		    		String num=numero+" "+origem+ destino+assentosDisponiveis +"\n\n"; 
		    		gravador.write(num.getBytes()); 
		    		gravador.close();
		    		} catch(Exception e){ 
		    			JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE); // mostra mensagem de erro
		    			} 
		    	}
	

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getOrigem() {
			return Origem;
		}

		public void setOrigem(String origem) {
			this.Origem = origem;
		}

		public String getDestino() {
			return Destino;
		}

		public void setDestino(String destino) {
			this.Destino = destino;
		}

		public int getAssentosDisponiveis() {
			return assentosDisponiveis;
		}

		public void setAssentosDisponiveis(int assentosDisponiveis) {
			this.assentosDisponiveis = assentosDisponiveis;
		}
			
		public void MostrarInfos() {
			System.out.println("Numero do Voo: " + numero);
			System.out.println("Origem: " + Origem);
			System.out.println("Destino: " + Destino);
		}
	}


