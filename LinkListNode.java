
public class LinkListNode <T>{
	public T value;
	public LinkListNode<T> next;
	
	public LinkListNode(){};
	
	public LinkListNode(T value)
	{
		this.value= value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public LinkListNode<T> getNext() {
		return next;
	}
	public void setNext(LinkListNode<T> node) {
		this.next = node;
	}
	
}
