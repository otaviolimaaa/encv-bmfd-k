package Encapsulamento;

public class Contabancaria {
private double saldo;


public Contabancaria (double saldoinicial) {
	if (saldoinicial >= 0) {
		double saldoinical = 0;
		this.saldo = saldoinical;
	}else {
		this.saldo=0;
	}
}
public double getsaldo () {
	return saldo;
}
public void  depositar (double valor ) {
	if (valor > 0) {
		saldo+=valor;
	}else {
		System.out.println("Valor de deposito invalido");
	}
}
public void sacar (double valor) {
	if (valor > 0 && valor <= saldo) {
		saldo -= valor;
	}else {
		System.out.println("Saque invalido! verifique o valor");
	}
}}
