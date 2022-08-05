package ListaEncadeada;

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
		return this.Referencia == null;
	}
	
	public void Adicionar(int info) {
		No item = new No(info, this.Referencia);
		this.setReferencia(item);
	}
	
	public void Imprimir() {
		if(ListaVazia()) {
			System.out.println("Lista vazia!");
			return;
		}
		
		for(No aux = this.Referencia; aux != null; aux = aux.getNext())
			System.out.println("[" + aux.getInfo() + "]");
	}
}
