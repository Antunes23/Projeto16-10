package Construtores2;

public class ObjetoProduto {

	public static void main(String[] args) {
		
		Produtos prod = new Produtos("Queijo Prato", 50.00);
		
		System.out.println(prod.getNome() + " " + prod.getPreco());
		
		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		prod.setPreco(56);
		System.out.println(prod.getPreco());
		
		prod.setNome("Queijo Parmesso");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
		

	}

}
