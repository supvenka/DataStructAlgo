
public class QueueListNode <T> {
	public int data;
	public QueueListNode<T> next;
	QueueListNode(int data)
	{
		this.data = data; 
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public QueueListNode<T> getNext() {
		return next;
	}
	public void setNext(QueueListNode<T> next) {
		this.next = next;
	}

}
