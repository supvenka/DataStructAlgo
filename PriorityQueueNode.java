
public class PriorityQueueNode <T> {
	
	PriorityQueueNode(int value)
	{
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public PriorityQueueNode<T> getNext() {
		return next;
	}
	public void setNext(PriorityQueueNode<T> next) {
		this.next = next;
	}
	public int value;
	public PriorityQueueNode <T> next;
}
