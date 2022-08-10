package ListaDuplamenteEncadeada;

public class Lista {
	private No Referencia;

	public Lista()
	{
		this.setReferencia(null);
	}
	
	public No getReferencia()
	{
		return Referencia;
	}

	public void setReferencia(No referencia)
	{
		Referencia = referencia;
	}
	
	public boolean ListaVazia()
	{
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
	
	public void Remover(int info)
	{
		if(ListaVazia())
			return;
		
		if(this.getReferencia().getInfo() == info)
		{
			this.setReferencia(this.Referencia.getNext());
			this.getReferencia().setPrev(null);
			return;
		}
		
		No next = null;
		No prev = null;
		for(No aux = this.getReferencia(); aux != null; aux = aux.getNext()) 
		{
			next = aux.getNext();
			if(aux.getInfo() == info)
			{
				prev.setNext(aux.getNext());
				next.setPrev(aux.getPrev());
			}
			
			prev = aux;
		}
	}
}
