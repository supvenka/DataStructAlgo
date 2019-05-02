
public class StackLinkedList {
	public static void main(String[] args) {
		LinkedListForStack <Integer>stackList = new LinkedListForStack <Integer>();
		LinkListNode <Integer> i1 = new LinkListNode<Integer> (1);
		LinkListNode <Integer> i2= new LinkListNode<Integer>(2);
		LinkListNode <Integer>i3 = new LinkListNode <Integer>(3);
		stackList.push(i1);
		stackList.push(i2);
		stackList.push(i3);
		stackList.enumerate();
		System.out.println("=========");
		System.out.println("Popped element = " + stackList.pop().getValue()); //3
		System.out.println("Top element = "+stackList.peek().getValue()); //2
		System.out.println("Stack isEmpty = "+stackList.isEmpty()); //F
		stackList.clear();
		System.out.println("After stack clearing Stack isEmpty = "+stackList.isEmpty()); //T
	}
	
	static class LinkedListForStack <T>
	{
		LinkListNode<Integer> Head;
		LinkListNode<Integer> Tail;
		int count = 0;
		
		public void push(LinkListNode<Integer> item) //Add First
		{
			LinkListNode<Integer> temp = Head;
			Head = item;
			Head.next = temp;
			if (count == 0)
			{
				Tail = Head;
			}
			
			count ++;
		}
		
		public LinkListNode<Integer> pop() //RemoveFirst
		{
			LinkListNode<Integer> prevHead = Head;
			if (count == 1)
			{
				Head = null;
				Tail = null;
			} else{
			
				Head = Head.next;
			}
			count --;
			return prevHead;
		}
		
		public LinkListNode <Integer> peek() //Returns the top element
		{
			if (count != 0)
				return Head;
			else {
				System.out.println("Stack is empty");
				return null;
			}
		}
		
		public void clear() //Empties the stack
		{
			  Head = null;
	          Tail = null;
	          count = 0;
		}
		
		public int size() //Empties the stack
		{
			return count;
		}
		
		public boolean isEmpty() 
		{
			if (count ==0)
				return true;
			else return false;
		}
		
		public void enumerate() //Empties the stack
		{
			LinkListNode <Integer> current = Head;
			while (current.next != null)
			{
				System.out.println(current.getValue());
				current = current.next;
			}
			System.out.println(current.getValue());
		}
	}
}
