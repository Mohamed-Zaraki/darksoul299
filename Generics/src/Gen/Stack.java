package Gen;

import java.util.Arrays;

public class Stack<T> {

	private T[]tab;
	private int size;
	private  int maxsize;
	@SuppressWarnings("unchecked")
	public Stack(int maxsize) {
		this.tab = (T[]) new Object[maxsize];
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
		if(maxsize <=size +1)
			return true;
		return false;
	}
	public void push(T element) throws  StackFullException 
	{
		
		
		 if(StackFull())
			throw new StackFullException("Stack is full");
		else
		tab[++size]=element;
	}
	
	public T pop() throws StackEmptyException 
	{
		if(StackEmpty())
			throw new StackEmptyException("Stack is Empty");
		
			return
					(T) tab[size--];
	}
	
	public void AfficheSommet()
	{
		if(StackEmpty())
		{
			return;
		}
		System.out.println(Arrays.toString(tab));
	}
	public T  peek() throws StackEmptyException
	{
		if(StackEmpty())
			throw new StackEmptyException("Stack is empty");
		return  
				(T) tab[size];
	}
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public T[] getTab() {
		return tab;
	}
	public void setTab(T[] tab) {
		this.tab = tab;
	}
	public int getMaxsize() {
		return maxsize;
	}
	public void setMaxsize(int maxsize) {
		this.maxsize = maxsize;
	}
	
	


	
	
}


