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
	
	
}
