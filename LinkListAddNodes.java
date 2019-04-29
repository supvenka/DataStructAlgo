
public class LinkListAddNodes {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkListNode <Integer>l3 = new LinkListNode <Integer>(3);
		System.out.println("\n ------  MYLIST 1 addFirst ---------");
		list1.addFirst(l3);
		list1.enumerateList();
		System.out.println("\n ------  MYLIST 1 addFirst again  ---------");
		LinkListNode<Integer> l5 = new LinkListNode <Integer>(5); //5,3
		list1.addFirst(l5);
		list1.enumerateList();
		System.out.println("\n ------- MYLIST 1 addLast --------");
		//3,5,7
		LinkListNode<Integer> l7 = new LinkListNode <Integer>(7); //5,3
		list1.addLast(l7);
		list1.enumerateList();

		System.out.println("\n ------  MYLIST 2  ---------");
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkListNode<Integer> l9 = new LinkListNode <Integer>(9);
		list2.addLast(l9); 
		list2.enumerateList(); //9
		System.out.println("\n ------- addLast -------");
		LinkListNode<Integer> l11 = new LinkListNode <Integer>(11);
		list2.addLast(l11);
		list2.enumerateList();//9,11
		System.out.println("\n ------- removeFirst -------");
		list2.removeFirst();
		list2.enumerateList();//11
		list2.removeFirst();
		System.out.println("\n ------- Empty List  -------");
		list2.enumerateList();//null
		
		
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		LinkListNode<Integer> l2 = new LinkListNode <Integer>(2);
		LinkListNode<Integer> l4 = new LinkListNode <Integer>(4);
		LinkListNode<Integer> l6 = new LinkListNode <Integer>(6);
		list3.addLast(l2);
		list3.addLast(l4);
		list3.addLast(l6);
		System.out.println("------  MYLIST 3---------");
		list3.enumerateList();
		
		System.out.println("\n------- removeItem 6 ---------");
		list3.removeItem(l6);
		list3.enumerateList(); //2,4

		System.out.println("\n------- removeItem Head ---------");
		list3.removeItem(l2);
		list3.enumerateList();
		
		System.out.println("\n ------ removeItem Tail ---------");
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		LinkListNode<Integer> l22 = new LinkListNode <Integer>(22);
		LinkListNode<Integer> l44 = new LinkListNode <Integer>(44);
		LinkListNode<Integer> l66 = new LinkListNode <Integer>(66);
		list4.addLast(l22);
		list4.addLast(l44);
		list4.addLast(l66);
		System.out.println("------  MYLIST 4 ---------");
		list4.enumerateList();
		System.out.println("\n---------------");
		list4.removeItem(l66);
		list4.enumerateList();
		
		
		System.out.println("\n ------ removeItem InBetween ---------");
		LinkedList<Integer> list5 = new LinkedList<Integer>();
		LinkListNode<Integer> q1 = new LinkListNode <Integer>(1);
		LinkListNode<Integer> q2 = new LinkListNode <Integer>(2);
		LinkListNode<Integer> q3 = new LinkListNode <Integer>(3);
		LinkListNode<Integer> q4 = new LinkListNode <Integer>(4);
		LinkListNode<Integer> q5 = new LinkListNode <Integer>(5);
		list5.addLast(q1);
		list5.addLast(q2);
		list5.addLast(q3);
		list5.addLast(q4);
		list5.addLast(q5);
		System.out.println("------  MYLIST 5 ---------");
		list5.enumerateList();
		System.out.println("\n---------------");
		list5.removeItem(q3);
		list5.enumerateList();

	}
	

	static class LinkedList<T>
	{
		LinkListNode<T> Head ;
		LinkListNode<T> Tail ;
		int count;
		
		public void addFirst(LinkListNode<T> node)
		{
			
			if (count == 0)
			{
				Head = node;
				Tail = Head;
			} else{
				LinkListNode<T> temp = Head;
				Head = node;
				Head.next = temp;
				Tail = Head;				
			}

			count ++;
		}
		
		public void addLast(LinkListNode<T> node)
		{
			if (count == 0)
			{
				Head = node;
				
			} else
			{
				LinkListNode<T> current = Head;
				while(current.next != null)
				{
					current = current.next;
				}
				current.next = node;
				Tail = node;
			}
			
			count ++;
		}
		
		public void removeFirst()
		{
			if (count == 1)
			{
				Head = null;
				Tail = null;
			} else{
				LinkListNode<T> newHead = Head.next;
				Head = newHead;				
			}
			
			count --;
		}
		
		public void removeLast()
		{
			if (count == 1)
			{
				Head = null;
				Tail = null;
			} else{
				LinkListNode<T> current = Head;
				while (current.next != Tail)
				{
					current = current.next;
				}
				
				Tail = current;
				current.next = null;

			}
			
			count --;
		}
		
		
		public void removeItem(LinkListNode<T> node)
		{
			LinkListNode<T> current = Head;
			if (current == node)
			{
				current = Head.next;
				Head = current;
			} else {
				while(current.next.getValue() != node.getValue())
				{
					current = current.next;			
				} 
				
				if (current.next == Tail)
				{
					Tail = current;
					Tail.next = null;
					
				} else {
					current.next = current.next.next;
				}
				
			}
			

			count --;
		}
		
		public void enumerateList()
		{
			if (count != 0)
			{
				LinkListNode<T> current = Head;
				System.out.print("|");
				while(current.next != null)
				{
			
					System.out.print(current.getValue());
					System.out.print("|");
					current = current.next;
				}
				System.out.print(current.getValue());
				System.out.print("|");
				System.out.print(" Count = " + count);
			} else{
				System.out.print("List empty. Count = "+ count);
			}
			
		}
		
		

		
	}

}
