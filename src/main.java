import ListaEncadeada.Lista;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.Adicionar(2);
		lista.Adicionar(1);
		lista.Adicionar(0);
		lista.Imprimir();
		System.out.println("");
		lista.RemoverElementoPorConteudo(1);
		lista.Imprimir();
		//System.out.println(lista.ListaVazia());
	}

}
