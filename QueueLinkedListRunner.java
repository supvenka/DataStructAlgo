
public class QueueLinkedListRunner {

	public static void main(String[] args) {
		QueueLinkedList <Integer> queue = new QueueLinkedList <Integer> ();
		QueueListNode <Integer>  e5 = new QueueListNode <Integer> (5);
		QueueListNode <Integer> e2 = new QueueListNode <Integer> (2);
		QueueListNode <Integer> e7 = new QueueListNode <Integer> (7);
		QueueListNode <Integer> e3 = new QueueListNode <Integer> (3);
		queue.enqueue(e5);
		queue.enqueue(e2);
		queue.enqueue(e7);	
		queue.enqueue(e3);
		queue.show();
		System.out.println("Size = " + queue.getSize());
		System.out.println("=================");
		queue.dequeue();
		queue.dequeue();
		queue.show();
		System.out.println("Size = " + queue.getSize());
		System.out.println("=================");		
		
		queue.dequeue();
		queue.dequeue();
		queue.show();
		System.out.println("Size = " + queue.getSize());
		System.out.println("isEmpty = " + queue.isEmpty());
		System.out.println("=================");	
		queue.enqueue(e5);
		queue.enqueue(e2);
		queue.enqueue(e7);	
		queue.enqueue(e3);
		QueueListNode <Integer> e6 = new QueueListNode <Integer> (6);

		queue.enqueue(e6);	
		
		System.out.println("Size = " + queue.getSize());

		System.out.println("------");
		

	}
	
	static class QueueLinkedList<T>
	{
		QueueListNode <T> Head;
		QueueListNode <T> Rear;
		int size;
		
		public void enqueue(QueueListNode<T> node)
		{
			
			if (size == 0)
			{
				Rear = node;
				Head = Rear;
			} else {
				
				QueueListNode <T> currentRear = Rear;
				Rear = node;
				if (getSize() == 1)
				{
					Head.next = Rear;		
				} else{
					currentRear.next = Rear;
				}
						
			}			
			size++;
		}
		
		public QueueListNode <T> dequeue()
		{
			QueueListNode <T> currentHead = Head;
			if (getSize() == 0)
			{
				System.out.println("Queue is empty");
			} else {
				Head = currentHead.next;
				//Rear = Rear.next;
			}			
			size--;
			return currentHead; 
		}
		
		public void show ()
		{
			if(getSize() != 0)
			{
				QueueListNode <T> currentNode = Head;
				while (currentNode.next != null)
				{
					System.out.println(currentNode.getData());
					currentNode = currentNode.next;
					
				}
				System.out.println(currentNode.getData());
			}

		}
		
		public int getSize ()
		{
			return size;
		}
		
		public boolean isEmpty ()
		{
			return getSize() == 0;
		}
	}

	
}
