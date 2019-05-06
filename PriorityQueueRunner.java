/**
Code Algorithm
•	Add an item to the queue in priority order
•	If the list is empty then , just add it
•	else
o	Find the proper insert point.
o	If the current value is null then we have reached end of the list
o	If the current one being added is less than or equalto the one being added
o	then add it at the behind 
•	Note Highest Priority queue is Dequeued/Removed first , but they do not follow FIFO
•	At any point the Queue should be in descending order where the Head is of highest priority

 */
public class PriorityQueueRunner {
	public static void main(String[] args) {
		PriorityQueueLinkedList <Integer> plist = new PriorityQueueLinkedList <Integer> () ;
		PriorityQueueNode <Integer> e4 = new PriorityQueueNode <Integer>(4) ;
		PriorityQueueNode <Integer> e1 = new PriorityQueueNode <Integer>(1) ;
		PriorityQueueNode <Integer> e2 = new PriorityQueueNode <Integer>(2) ;
		plist.enqueue(e4);
		plist.enqueue(e1);
		plist.enqueue(e2);
		plist.show(); //4 2 1
		System.out.println("===============" );
		PriorityQueueNode <Integer> e5 = new PriorityQueueNode <Integer>(5) ;
		plist.enqueue(e5);
		plist.show(); //5 4 2 1
		System.out.println("===============" );
		PriorityQueueNode <Integer> e3 = new PriorityQueueNode <Integer>(3) ;
		plist.enqueue(e3); //5 4 3 2 1
		plist.show();
		System.out.println("===============" );
		plist.dequeue();
		plist.show();//4 3 2 1
		System.out.println("===============" );
		plist.dequeue();
		plist.dequeue();
		plist.dequeue();
		plist.show();//1
	}
	
	static class PriorityQueueLinkedList<T>
	{
		QueueLinkedList <T> list = new QueueLinkedList <T>(); 

		
		public void enqueue(PriorityQueueNode <T> node)
		{
			if (list.getSize() == 0)
			{
				list.addLast(node);
			} else{
				PriorityQueueNode <T> current = list.Head;
				
				while(current != null && current.getValue() > node.getValue())
				{
					//current value is larger than the value being inserted...
					//list.addLast(node);		
					current = current.next;
				}
				if(current == null)
				{
					 // we made it to the end of the list
					list.addLast(node);
				} else{
					// the current item is <= the one being added
                    // so add the item before it.
					list.addBefore(current, node);
				}
				
			}
		}
		
		public int dequeue()
		{
			if (list.getSize() == 0)
			{
				System.out.println("Queue is empty" );
			
			} 
			return list.removeFirst().getValue();
						
			
		}
		
		public void clear()
		{
			list = null;
		}
		
		public void show()
		{
			list.show();
		}
		
	}
	
	public static  class QueueLinkedList <T>
	{
		PriorityQueueNode <T> Head;
		PriorityQueueNode <T> Rear;
		int size;

		public void addFirst(PriorityQueueNode <T> node)
		{
			PriorityQueueNode  <T>  currentHead = Head;
			Head = node;

			if (size == 0)
			{
				Rear = Head;
			} else {
				Head.next = currentHead;
				Rear = currentHead;
			}
			
			size++;
		}
		
		public void addLast(PriorityQueueNode <T> node)
		{
			if (size == 0)
			{
				Head = node;
			} else {
				Rear.next = node;				
			}
			Rear = node;			
			size++;
		}
		
		public void addBefore(PriorityQueueNode <T> node, PriorityQueueNode <T> nodeToadd)
		{
		     // the current item is <= the one being added
            // so add the item before it.
			PriorityQueueNode  <T>  current = Head;
			if( current == node)
			{
				addFirst(nodeToadd);
			} else{
				while(current.next != node)
				{
					current = current.next;
				}
				//Implies current.next = node
				current.next = nodeToadd;
				current.next.next = node;
			}
			

			size++;
		}
		
		public void addItem()
		{
			
		}
		public PriorityQueueNode <T> removeFirst()
		{
			if (size == 1)
			{
				Head = null;
				Rear = null;
			} else {
				Head = Head.next;
			}
			size--;
			return Head;

		}
		
		public PriorityQueueNode <T> removeLast()
		{
			if (size == 1)
			{
				Head = null;
				Rear = null;
			} else {
				PriorityQueueNode <T> current = Head;
				while(current.next != Rear)
				{
					current = current.next;
				}
				Rear = current;
				Rear.next = null;
			}
			
			size--;
			return Rear;
		}
		
		public int getSize()
		{
			return size;
		}
		
		public void show()
		{
			PriorityQueueNode <T> current = Head;
			while (current.next != null)
			{
				System.out.println(current.getValue());
				current = current.next;
			}
			System.out.println(current.getValue());
		}
	}
}
