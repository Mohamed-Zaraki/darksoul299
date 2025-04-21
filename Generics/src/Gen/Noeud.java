package Gen;

public class Noeud<T> {
	
	    T data;
	    Noeud<T> next;

	    public Noeud(T data) {
	        this.data = data;
	        this.next = null;
	    }
	    

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Noeud<T> getNext() {
			return next;
		}

		public void setNext(Noeud<T> next) {
			this.next = next;
		}
	    
	}

