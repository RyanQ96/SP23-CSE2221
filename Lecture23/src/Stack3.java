
public class Stack3<T> implements StackKernel<T>{
	private ElementWrapper<T> tail; 
	private int length; 
	
	public Stack3() {
		this.tail = null; 
		this.length = 0;
	}
	
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		ElementWrapper<T> item = new ElementWrapper<>(element);
		if (this.tail == null) {
			this.tail = item; 
		} else {
			this.tail.setNext(item);
			item.setPrev(this.tail);
			this.tail = item; 
		}
		this.length += 1;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T item = this.tail.element;
		this.tail = this.tail.getPrev(); 
		this.tail.setNext(null);
		this.length -= 1;
		return item; 
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.length;
	}

	public String toString() {
		String output = "";
		if (this.length > 0) {
			ElementWrapper<T> cur = this.tail; 
			output = cur.element.toString() + output; 
			while (cur.prev != null) {
				cur = cur.prev; 
				output = cur.element.toString() + ", " + output;
			}
		}
		output = "<"+ output + ">";
		return output; 
	}


}
