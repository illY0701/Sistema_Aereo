package viagem;

public class Pagamento {

	private Double Pagamento;
	public Double Ida = 3.200;
	public Double Ida_Volta = 5.990;
	public int taxa = 550;

	public Pagamento (Double Pagamento) {
		this.Pagamento = Pagamento;
	}
	
	static void forma_pagamento() {
		System.out.println("Forma de pagamento");
	} 

	
	public void MostrarInfos() {
		System.out.println("Ida: " + Ida);
		System.out.println("Ida e Volta: " + Ida_Volta);
	}
	
	public void MostrarInfos_Ida() {
		System.out.println("Total a ser pago: " + Ida);
	}
	
	public void MostrarInfos_IdaVolta() {
		System.out.println("Total a ser pago: " + Ida_Volta + taxa);
	}
}