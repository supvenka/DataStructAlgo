
public class QueueCircularArrayRunner {

	public static void main(String[] args) {
		QueueCircularArray q = new QueueCircularArray();
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
		
		q.enQueue(9);
		q.enQueue(1);
		
		q.enQueue(19);
		q.enQueue(15);
		q.show();
		System.out.println("Size = " + q.size());
	}

}
