package ListaDuplamenteEncadeada;

public class ListaDupla {
	private No Referencia;

	public ListaDupla() {
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
		if(ListaVazia()) {
		No novo = new No(info, this.getReferencia(), null);
		this.setReferencia(novo);
		return;
	}

	No novo = new No(info, this.getReferencia(), null);
		this.getReferencia().setPrev(novo);
		this.setReferencia(novo);
	}

	public void Imprimir() {
		if(ListaVazia())
			System.out.println("Lista vazia!");

		No referencia = null;
		for(No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			System.out.println(aux.getInfo());

			referencia = aux;
		}

		for(No aux = referencia; aux != null; aux = aux.getPrev()) {
			System.out.println(aux.getInfo());
		}
	}

	public void Remover(int info) {
		if(ListaVazia())
			return;

		if(this.getReferencia().getInfo() == info) {
			this.setReferencia(this.Referencia.getNext());

			if(Contador() == 1)
				this.getReferencia().setPrev(null);
			return;
	}

		No next = null;
		No prev = null;
		for(No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			next = aux.getNext();
			if(aux.getInfo() == info) {
				prev.setNext(aux.getNext());
				if(aux.getNext() != null)
					next.setPrev(aux.getPrev());
				return;
			}

			prev = aux;
		}
	}

	public int Contador() {
		int index = 0;
		for(No aux = this.Referencia; aux != null; aux = aux.getNext())
			index++;

		return index;
	}

	public void Buscar(int info) {
		if(ListaVazia()) {
			System.out.println("-1");
			return;
		}

		int index = 0;

		for(No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			if(info == aux.getInfo()) {
				System.out.println("Esse número está na posição: " + index);
				return;
			}

			index++;
		}

		System.out.println("-1");
	}
}
