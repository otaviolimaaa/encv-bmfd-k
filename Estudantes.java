package Encapsulamento;

public class Estudantes {

	private String nome;
	private double nota1;
	private double nota2;
	
	public Estudantes (String nome , double nota1, double nota2) {
		this.nome = nome;
		setNome (nota1);
		setNome (nota2);
	}
public String getNome () {
	return nome;
}
public void setNome (String nome) {
	this.nome = nome;
}
	public double getNota1 () {
		return nota1;
	}
	public void setNome (double nota1) {
		if  (nota1 >= 0 && nota1 <= 10) {
			this.nota1= nota1;
		}else {
			System.out.println("Nota 1 invalida deve estar entre 0 e 10");
		}
	}
	public double getNota2 () {
		return nota2;
	}
	
	public void setNota2 (double nota2) {
		if  (nota2 >= 0 && nota2 <= 10) {
			this.nota2= nota2;
		}else {
			System.out.println("Nota 1 invalida deve estar entre 0 e 10");
		}	
	}
	public double calcularMedia () {
		return (nota1 + nota2) / 2;
	}
		 public void exibirinformaçoes () {
	System.out.println("Estudante:" + nome + ", media: " + calcularMedia ());
		 }
}