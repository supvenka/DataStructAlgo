/**
•	The algorithm starts by enumerating over each token.
•	We start with an empty Stack.
•	If the token is an integer, the value is pushed
•	If the token is an operator, the start popping elements from the stack
•	The popped element goes to RHS of the operator and the other element on the LHS of the operator
•	The operation is performed and the result is then pushed into the stack
*/
public class StackPostFixAlgorithm {

	public static void main(String[] args) {
		for (String token : args)
		{
			System.out.println("token = " + token);
		}
		
		PostFixStack argsStack = new PostFixStack();
		for (String token : args)
		{
			char currentToken = new Character(token.charAt(0)).charValue();
			System.out.println("currentToken = " + currentToken);
			char star = "*".charAt(0);
			char minus = "-".charAt(0);
			char plus = "+".charAt(0);
			char mod = "%".charAt(0);
			char div = "/".charAt(0);
			if (Character.isDigit(currentToken))
			{
				//Then push it into the stack
				argsStack.push(new Integer(currentToken));
			}
			if (currentToken == star || currentToken == minus || currentToken == plus || currentToken == mod ||  currentToken == div)
			{
				int rhs = argsStack.pop();
				int lhs = argsStack.pop();
				switch(currentToken)
				{
					case '*' : 
						argsStack.push(lhs * rhs);
						break;
					case '-' : 
						argsStack.push(lhs - rhs);
						break;
					case '+' : 
						argsStack.push(lhs + rhs);
						break;
					case '/' : 
						argsStack.push(lhs / rhs);
						break;
					case '%' : 
						argsStack.push(lhs % rhs);
						break;
					default : System.out.println("Unrecognized character = " + currentToken);
				
				}		
					
			}
		}
		System.out.println("Output of Expression = " + argsStack.peek());
		
	}

	public static class PostFixStack
	{
		int stack[] = new int[4];
		
		int top = 0;
		public void push(int y)
		{
			System.out.println("X = " + y);
			if (top > 3) //or we can say 5
				System.out.println("Stack is full");
			else{
				stack[top] = y;
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
			for(int i: stack)
			{
				System.out.println(i + " ");
			}
		}
	}
	
}
