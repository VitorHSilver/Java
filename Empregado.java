/**
 * 
 */
package uscs;


public class Empregado {

	public String  nome;
	public String  cargo;
	public double  salario;
	public int     codigo;
	
	
	public Empregado(String nome,String cargo,double salario) {
		
	this.nome = nome;
	this.cargo = cargo;
	this.salario = salario;
	
	
	}
	
	public void ImprimeEmpregado(){
		System.out.println("Nome:" + nome);
		System.out.println("Cargo:" + cargo);
		System.out.println("Salario:" + salario);
		
    }
	
	/**
	 * Função print total
	 */
	
	public void TotalEmpregado ()
	{
			System.out.println("Quantidade Total:" + qtdfuncionario);
				}
	
	/** contagem de funcionarios, pegando o codigo de cada usuario e somando a 1+
	 * 
	 */
	
	public static int qtdfuncionario;
	{
		
		this.codigo = qtdfuncionario;
		qtdfuncionario++;
		}			
}
