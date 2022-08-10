package ListaDuplamenteEncadeada;

public class Lista {
	private No Referencia;

	public Lista() {
		this.setReferencia(null);
	}
	
	public No getReferencia() {
		return Referencia;
	}

	public void setReferencia(No referencia) {
		Referencia = referencia;
	}
	
	public boolean ListaVazia() {
		return this.getReferencia() == null;
	}
	
	public void Inserir(int info) {
		No item;
		if(ListaVazia()) {
			item = new No(info, this.getReferencia(), null);
			this.setReferencia(item);
			return;
		}
		
		item = new No (info, this.getReferencia(), null);
		this.getReferencia().setPrev(item);
		this.setReferencia(item);
	}
	
	public void Imprimir() {
		if(ListaVazia())
			System.out.println("Lista vazia!");
		
		int infoNext = -1;
		int infoPrev = -1;
		for(No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			if(aux.getPrev() != null)
				infoPrev = aux.getPrev().getInfo();
			if(aux.getNext() != null)
				infoNext = aux.getNext().getInfo();
			
			System.out.println("[ Info: "+ aux.getInfo()+" ], [ Prev: "+ infoPrev + " ], [ Next: "+ infoNext +" ]");
			
			infoNext = -1;
			infoPrev = -1;		
		}
	}
	
	
}
