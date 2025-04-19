package Gen;

public class Stack<T> {

	private Object[]tab;
	private int size;
	private final int maxsize;
	public Stack(int maxsize) {
		this.tab = new Object[maxsize];
		this.size = -1;
		this.maxsize = maxsize;
	}
	public boolean StackEmpty()
	{
		if(size ==-1)
			return true;
		return false;
	}
	
	public boolean StackFull()
	{
		if(maxsize <=size)
			return true;
		return false;
	}
	public void push(T element) throws StackEmptyException, StackFullException 
	{
		
		if(StackEmpty())
			throw new StackEmptyException("Stack is Empty");
		else if(StackFull())
			throw new StackFullException("Stack is full");
		else
		tab[size++]=element;
	}
	@SuppressWarnings("unchecked")
	public T pop() throws StackEmptyException 
	{
		if(StackEmpty())
			throw new StackEmptyException("Stack is Empty");
		
			return
					(T) tab[size--];
	}
	


	
	
}


