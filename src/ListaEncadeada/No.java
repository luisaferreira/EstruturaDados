package ListaEncadeada;

public class No {
	private int Info;
	private No Next;
	
	public No(int info) {
		this.setInfo(info);
		this.setNext(null);
	}
	
	public No(int info, No next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public No getNext() {
		return Next;
	}
	
	public void setNext(No next) {
		Next = next;
	}
	
	public int getInfo() {
		return Info;
	}
	
	public void setInfo(int info) {
		Info = info;
	}
}
