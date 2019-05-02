//Using Dynamic size array can shrink and expand similar to LinkedList Stack
public class StackDynamicArray {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		System.out.println("Is Empty = " +myStack.isEmpty());
		myStack.push(15);
		myStack.display();
		myStack.push(8);
		myStack.display();
		myStack.push(10);
		myStack.display();
		myStack.push(10);
		myStack.display();
		System.out.println("--------");
		myStack.push(10); //Stack should expand
		myStack.display();
		
		System.out.println("--------");
		myStack.pop();
		myStack.display();
		
		myStack.pop();
		myStack.display();
		
		myStack.pop();
		myStack.display();
	}

	public static class Stack
	{
		int capacity = 2;
		int stack[] = new int[capacity];
		int top = 0;
		public void push(int x)
		{
			
			if (size() == capacity) //or we can say 5
			{
				System.out.println("Stack is full");
				//Create a new stack
				expand();
			} 
			stack[top] = x;
			top++;			
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
				//System.out.println( "stack[top] = "+  stack[top]);
				stack [top] = 0; // when we remove an element that place it become null
				shrink();
				
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
			top = 0;
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
				System.out.print(i + " " );
			}
			System.out.print("\n" );
		}
		
		public void expand()
		{
			System.out.println("Expanding the stack ....." );
			int length = size();
			int myNewStack []= new int[capacity * 2];//Say every time the stack needs to be expanded increase its capacity * 2
/*			for (int i : stack)
			{
				myNewStack[i] = stack[i];
			}*/
			
			System.arraycopy(stack, 0, myNewStack, 0, length);
			capacity *= 2;
			stack = myNewStack;// Now my current stack Reference needs to be changed to newstack ref.
			
		}
		
		public void shrink()
		{
			int length = size();
			if (length <= (capacity/2) /2 ) //Say every time the stack needs to be shrunk decrease by 1/4
			{
				System.out.println("Shrinking the stack ....." );
				capacity = capacity /2;
			}
			int myNewStack []= new int[capacity];
			System.arraycopy(stack, 0, myNewStack, 0, length);
			stack = myNewStack;// Now my current stack Reference needs to be changed to newstack ref.

		}
	}
}
