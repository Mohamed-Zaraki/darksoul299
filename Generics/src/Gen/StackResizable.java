package Gen;

public class StackResizable<T> extends Stack<T> {

	public StackResizable(int maxsize) {
		super(maxsize);
		
	}
	@Override
    public void push(T item)  {
        if (StackFull()) {
            resize();
        }
        try {
            super.push(item);
        } catch (StackFullException e) {
            e.printStackTrace();
        }
    }
	public void resize() {
		
	    int newCapacity = super.getMaxsize() * 2 + 1;
	    @SuppressWarnings("unchecked")
		T[] newTab = (T[])new Object[newCapacity];
	    System.arraycopy(super.getTab(), 0, newTab, 0, super.getSize() + 1);
	    super.setTab(newTab);
	    super.setMaxsize(newCapacity);
		}
	}
	
	
	


