
public class Principal {

	public static void main(String[] args) {

		Arvore<Integer> arvore = new Arvore<>();
		
		arvore.adicionarElemento(10);
		arvore.adicionarElemento(5);
		arvore.adicionarElemento(8);
		arvore.adicionarElemento(11);
		
		arvore.imprimir(arvore.getRaiz());
	}

}
