package ListaDuplamenteEncadeada;

public class No {
	private int Info;
	private No Next;
	private No Prev;

	public No(int info, No next, No prev) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrev(prev);
	}

	public int getInfo() {
		return Info;
	}

	public void setInfo(int info) {
		Info = info;
	}

	public No getNext() {
		return Next;
	}

	public void setNext(No next) {
		Next = next;
	}	

	public No getPrev() {
		return Prev;
	}

	public void setPrev(No prev) {
		Prev = prev;
	}
}
