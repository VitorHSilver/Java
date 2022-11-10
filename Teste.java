package atividade4;

public class Teste {

	public static void main(String[] args) {
		
		Circulo a = new Circulo();
		
		a.raio = 5;
		System.out.println("O raio é de :" +a.raio);
		System.out.println(a.Area());
		System.out.println(a.Comprimento());
		
		Quadrado b = new Quadrado();
		
		b.lado = 5;
		System.out.println("O raio é de :" +b.lado);
		System.out.println(b.Area());
		System.out.println(b.Comprimento());

	}

}

