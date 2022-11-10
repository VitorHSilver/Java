package atividade4;

public class Quadrado implements FormaGeometrica {
	
	
		double lado;
		
		@Override
		public double Area() {
			return Math.PI*lado*lado;
		}
		@Override
		public double Comprimento() {
			return lado*4;
		}
	}
