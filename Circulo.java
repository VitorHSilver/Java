/**
 * 
 */
package atividade4;

/**
 * @author vitor.silva5_uscsonl
 *
 */
public class Circulo  implements FormaGeometrica{
	
	double raio;
	
	@Override
	public double Area() {
		return Math.PI*raio*raio;
	}
	@Override
	public double Comprimento() {
		return 2*Math.PI*raio;
	}
}
