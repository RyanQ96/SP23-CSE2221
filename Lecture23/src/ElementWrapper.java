
public class ElementWrapper<T> {
	public T element; 
	public ElementWrapper<T> next; 
	public ElementWrapper<T> prev; 
	public ElementWrapper(T element) {
		this.element = element;
		this.next = null; 
		this.prev = null;
	}
	
	public void setNext(ElementWrapper<T> element) {
		this.next = element;
	}
	
	public ElementWrapper<T> getNext() {
		return this.next;
	}
	
	public void setPrev(ElementWrapper<T> prev) {
		this.prev = prev;
	}
	
	public ElementWrapper<T> getPrev() {
		return this.prev; 
	}
	
}
