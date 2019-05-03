
public class QueueRunner {

	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println("Size = " + q.size());
		System.out.println("isEmpty = " + q.isEmpty());
		System.out.println("isFull = " + q.isFull());
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		q.show();
		System.out.println("Size = " + q.size());
		System.out.println("isFull = " + q.isFull());
		System.out.println("------");
		
		q.denqueue();
		q.denqueue();		
		q.show();
		
		q.denqueue();
		q.denqueue();
		q.show();
		System.out.println("------");
		System.out.println("Size = " + q.size());
		System.out.println("isEmpty = " + q.isEmpty());
		System.out.println("------");
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		q.enQueue(6);
		System.out.println("Size = " + q.size());
		System.out.println("isEmpty = " + q.isEmpty());
		System.out.println("isFull = " + q.isFull());
		System.out.println("------");

	}

}
