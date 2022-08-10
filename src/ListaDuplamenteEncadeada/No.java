package ListaDuplamenteEncadeada;

public class No {
	private int Info;
	private No Prev;
	private No Next;
	
	public No(int info) {
		this.setInfo(info);
		this.setNext(null);
		this.setPrev(null);
	}
	
	public No(int info, No next, No prev) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrev(prev);
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

	public No getPrev() {
		return Prev;
	}

	public void setPrev(No prev) {
		Prev = prev;
	}
}
