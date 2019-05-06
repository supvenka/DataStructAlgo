
public class QueueCircularArray {
	int front;
	int rear;
	int capacity=5;
	int queue[] = new int[capacity];
	int size = 0;
	
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % capacity; //incrementing rear since we will insert next element at index rear+1 so queue[rear+1] basically rear will be pointer to where we will add the next item 
			size++;
		}

	}
	
	public int denqueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is ALREADY Empty!");
			return  queue[front]; //This will return 0 
		} else {
			int item = queue[front]; // Will always remove the first inserted element at index 0.
			int newQueue[] = new int[capacity];
			int newQueSize= queue.length - 1;
			//System.out.println("queue.length-1 ---->" + newQueSize);;
			int circularfront = (front+1) % capacity;
			System.arraycopy(queue, circularfront, newQueue, 0, newQueSize); //copy from queue  index [1] since index[0] is removed till index [length -1]

			// front = 0; front will always be 0
			size = size -1;
			queue = newQueue;
			/** Note rear is a pointer to where the next element will be added. 
			 * When we add we do rear++ (pointing to the next index value).
			 * When we delete we do rear --; so that the index[1] element will now move to index[0] and become the head.
			 * So even rear needs to be decreased , such that in next add it will still point to the next index location where element is to be added. */
			rear --;  
			return item;
		}

	}
	
	public int size()
	{
		return size;	// we can also do return size. 
		
	}
	
	public boolean isEmpty()
	{
		return size() == 0;	
		
	}
	
	public boolean isFull()
	{
		return size() == capacity;	
		
	}
	public void show()
	{
		System.out.println(" Queue elements....");
		for (int item : queue)
		{
			System.out.println(item + " ");
		}
	}
}
