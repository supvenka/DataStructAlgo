
public class DoubleLinkListAddNodes {

	public static void main(String[] args) {
		DoubleLinkedList <Integer> dlist2 = new DoubleLinkedList <Integer>();
		DoubleNode <Integer> d11 = new DoubleNode<Integer>(11);
		DoubleNode <Integer> d22 = new DoubleNode<Integer>(22);
		DoubleNode <Integer> d33 = new DoubleNode<Integer>(33);
		
		dlist2.addFirst(d11);
		dlist2.addFirst(d22);
		dlist2.addFirst(d33);
		dlist2.enumerateList();
		
		dlist2.removeItem(d11); //Removes the Tail where item.next = null
		dlist2.enumerateList();
		
		dlist2.removeItem(d33); //Removes the First item ie Where the item. prev = null
		dlist2.enumerateList();

		System.out.println("######################");
		DoubleLinkedList <Integer> dlist1 = new DoubleLinkedList <Integer>();
		DoubleNode <Integer> d1 = new DoubleNode<Integer>(1);
		DoubleNode <Integer> d2 = new DoubleNode<Integer>(2);
		DoubleNode <Integer> d3 = new DoubleNode<Integer>(3);
		
		dlist1.addFirst(d1);
		dlist1.addFirst(d2);
		dlist1.addFirst(d3);
		dlist1.enumerateList();//3,2,1
		
		System.out.println("----- removeFirst ----");
		dlist1.removeFirst();//2,1
		dlist1.enumerateList();
		
		System.out.println("----- removeLast ----");
		dlist1.removeLast();
		dlist1.enumerateList();
	}
	

	static class DoubleLinkedList<T>
	{
		DoubleNode<T> Head ;
		DoubleNode<T> Tail ;
		DoubleNode<T> Previous ;
		int count;
		
		public void addFirst(DoubleNode<T> node)
		{
			DoubleNode<T> temp = Head;
			Head = node;
			Head.nextNode = temp;
			if (count == 0)
			{
				Tail = Head;
			} else{

				temp.previousNode = Head;							
			}
			
			System.out.println("Current node = " + node.getValue());
			
			
			count++;
			
		}
		
		public void addLast(DoubleNode<T> node)
		{
			
			if (Head == null)
			{
				Head = node;
				Tail = Head;
			} else {
				Tail.nextNode = node;
				node.previousNode = Tail ;
			}
			Tail = node;
			count ++;
		}
		
		public void removeFirst()
		{
			if (count == 1)
			{
				Head = null;
				Tail = null;
				
			} else{
				Head = Head.nextNode;
				Head.previousNode = null;
			}
			
			count--;
		}
		
		public void removeLast()
		{
			if (count == 1)
			{
				Head = null;
				Tail = null;
			} else{

				Tail = Tail.previousNode;
				Tail.nextNode = null;
			}
			count --;
		}
		
		
		public void removeItem(DoubleNode<T> node)
		{
			DoubleNode<T> currentNode = Head;
			DoubleNode<T> previousNode = null;
			
			while (currentNode.getValue() != node.getValue())
			{
				System.out.println("Current Node = " + currentNode.getValue());
				currentNode = currentNode.nextNode;
				previousNode = currentNode.previousNode;
								
			}
			
			if (currentNode.previousNode == null)  //Head  node
			{
				removeFirst();
			} else 	if (currentNode.nextNode == null) //Implies Tail
			{
				removeLast();
			} else 
			{
				currentNode.previousNode.nextNode = currentNode.nextNode;
			}

		}
		
		
		
		public void enumerateList()
		{

			if (count != 0)
			{
				DoubleNode<T> current = Head;
				System.out.print("............\n ");
				while(current.nextNode != null)
				{
					System.out.print("| currentNode = "+ current.getValue()+ "|");
					//System.out.print("|");
					if(current.previousNode != null)
						System.out.print(" Previous Node = " +current.previousNode.getValue()+ "|");
					if(current.nextNode != null)
						System.out.print(" Next Node = " +current.nextNode.getValue()+ "| \n");
					current = current.nextNode;
					System.out.print("............\n ");
				}
				System.out.print("| currentNode = "+ current.getValue()+ "|");
				if(current.previousNode != null)
					System.out.print(" Previous Node = " +current.previousNode.getValue()+ "|");
				if(current.nextNode != null)
					System.out.print(" Next Node = " +current.nextNode.getValue()+ "\n");
				
				System.out.print("\n ............\n ");

				

				System.out.print(" Count = " + count + "\n");
			} else{
				System.out.print("List empty. Count = "+ count);
			}
			
		}
			

		
	}

}
