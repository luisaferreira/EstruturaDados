package ListaDuplamenteEncadeada;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var lista = new ListaDupla();

		//inserindo elementos, esvaziando a lista e voltando a preenchê-la
		lista.Inserir(1);
		lista.Inserir(2);
		lista.Inserir(3);
		lista.Inserir(4);

		lista.Imprimir();

		lista.Remover(1);
		lista.Remover(2);
		lista.Remover(3);
		lista.Remover(4);

		lista.Imprimir();

		lista.Inserir(9);
		lista.Imprimir();

		//Tentado remover elementos que não estão na lista sem que a lista seja alterada
		lista.Inserir(1);
		lista.Inserir(2);
		lista.Inserir(3);

		lista.Imprimir();

		lista.Remover(0);

		lista.Imprimir();
	}

}
