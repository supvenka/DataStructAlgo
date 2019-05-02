
public class StackArray {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		System.out.println("Is Empty = " +myStack.isEmpty());
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.display();
		System.out.println("\nPopped element = " +myStack.pop());
		myStack.display();
		System.out.println("Size = " + myStack.size());
		System.out.println("Peek element = " +myStack.peek());
		System.out.println("Is Empty = " +myStack.isEmpty());
	}

	public static class Stack
	{
		int stack[] = new int[4];
		int top = 0;
		public void push(int x)
		{
			if (top > 4) //or we can say 5
				System.out.println("Stack is full");
			else{
				stack[top] = x;
				top++;	
			}				
		}
		
		public int pop()
		{
			int topElement = 0;
			if (isEmpty())
			{
				System.out.println("Stack is Empty");
			}
				
			else {
				top --;
				topElement = stack[top];
				//System.out.print( "stack[top] = "+  stack[top]);
				stack [top] = 0; // when we remove an element that place it become null
				
			}

			return topElement;			
		}
		
		public int peek()
		{
			return stack[top-1];
		}
			
		
		public void clear()
		{
			stack = null;
		}
		
		public int size()
		{
			return top;
		}
		
		public boolean isEmpty()
		{
			if (top <= 0)
					return true;
			else
				return false;
		}
		
		public void display()
		{
			/*for (int i = 0; i <=top-1; i++)
			{
				System.out.println(stack[i]);
			}*/
			
			for(int i: stack)
			{
				System.out.println(i + " ");
			}
		}
	}
}
