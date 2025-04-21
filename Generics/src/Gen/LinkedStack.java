package Gen;

	public class LinkedStack<T> {
	    private Noeud<T> top; 
	    private int size;

	    public LinkedStack() {
	    	
	        this.top = null;
	        this.size = 0;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(T item) {
	    	Noeud<T> newNode = new Noeud<>(item);
	        newNode.next = top;
	        top = newNode;
	        size++;
	    }

	    public T pop() throws StackEmptyException {
	        if (isEmpty()) {
	            throw new StackEmptyException("Stack is empty");
	        }
	        T data = top.data;
	        top = top.next;
	        size--;
	        return data;
	    }

	    public T peek() throws StackEmptyException {
	        if (isEmpty()) {
	            throw new StackEmptyException("Stack is empty");
	        }
	        return top.data;
	    }

	    public void display()
	    {
	    	Noeud<T> Current=top;
	    	while(Current !=null)
	    	{
	    		System.out.print(Current.data + "->");
	    		Current=Current.next;
	    	}
	    }
	    public int getSize() {
	        return size;
	    }

	  public static void main(String[] args)  {
		
		
		  StackResizable<String> list = new StackResizable<>(5);

	        list.push("Hello");
	        list.push("World");
	        list.push("a");
	        list.push("b");

	        list.AfficheSommet(); 
		  
	  }
	    }
	

