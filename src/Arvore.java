public class Arvore<TIPO extends Comparable<TIPO>>{
	
	
	private Elemento<TIPO> raiz;
	
	public Arvore() {
		
		this.raiz = null;
	}

	public  void adicionarElemento(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<TIPO> atual = this.raiz;
			while(true) {
				if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
					
				} else {
					if(atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}
	
	public void imprimir(Elemento<TIPO> atual) {
		if(atual != null) {
			imprimir(atual.getEsquerda());
			System.out.println(atual.getValor());
			imprimir(atual.getDireita());
		}
		
	}

	public Elemento<TIPO> getRaiz() {
		return raiz;
	}

	public void setRaiz(Elemento<TIPO> raiz) {
		this.raiz = raiz;
	}
	
	
}
