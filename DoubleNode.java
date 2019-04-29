
public class DoubleNode <T> {
	public int value;
	public DoubleNode <T> nextNode = null;
	public DoubleNode <T> previousNode = null;
	
	public DoubleNode(int value)
	{
		this.value= value;
	}
	
	
	public DoubleNode<T> getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(DoubleNode<T> previous) {
		this.previousNode = previous;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public DoubleNode<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoubleNode<T> nextNode) {
		this.nextNode = nextNode;
	}

}
