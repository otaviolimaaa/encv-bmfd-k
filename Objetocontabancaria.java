package Encapsulamento;

public class Objetocontabancaria {
	public static void main(String[] args) {
   
		Contabancaria conta = new Contabancaria (100000.00);
		
		System.out.println(conta.getsaldo());
		
		conta.depositar(500);
		conta.depositar(1000);
		
		System.out.println(conta.getsaldo ());
		
		conta.sacar(1500);
		
		System.out.println(conta.getsaldo());
	}}