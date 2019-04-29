import java.io.Console;

public class NodeChains {
	
	public static void main(String args[])
	{
		//|-----|-----|
		//|  3  |null |
		//|-----|-----|
		Node firstNode = new Node();
		firstNode.setValue(3);
		
		//|-----|-----|
		//|  5  |null |
		//|-----|-----|
		Node secondNode = new Node();
		secondNode.setValue(5);
		
		//|-----|-----|
		//|  7 |null |
		//|-----|-----|
		
		Node lastNode = new Node();
		lastNode.setValue(7);
		
		//|-----|-----|
		//|  3  |   5 |
		//|-----|-----|
		firstNode.nextNode=secondNode;

		//|-----|-----|
		//|  5  |  7  |
		//|-----|-----|		
		secondNode.nextNode=lastNode;
		
		//|-----|-----|-----|-----|
		//|  3  |   5 |  7  |null |
		//|-----|-----|-----|-----|
		
		//Iterating node after node
		printList(firstNode);
	}

	public static void printList(Node node)
	{
		while (node != null)
		{
			System.out.println("Node = "+ node.value);
			node = node.nextNode; // Assigning the current node to the nextNode
		}
	}
}

/*class Node{
	public int value;
	public Node nextNode = null;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
}*/