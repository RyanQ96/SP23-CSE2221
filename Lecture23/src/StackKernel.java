
public interface StackKernel<T> {

	public void push(T element); 
	
	public T pop();
	
	public int length(); 
}
