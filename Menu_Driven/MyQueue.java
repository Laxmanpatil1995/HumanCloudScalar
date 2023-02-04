package Menu_Driven;

public class MyQueue {


@SuppressWarnings("unchecked")

	
	int[]queue;
	int rear;
	int front;
	int size;
	
	public MyQueue()
	{
		queue=new int[2];
		rear=-1;
		front=-1;
		size=0;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		return false;
	}
	public boolean enqueue(int element)
	{
		if(rear==queue.length-1)
		{
			int[] q1=new int[queue.length*2];
			for(int i=0;i<queue.length;i++)
			{
				q1[i]=queue[i];
			}
			queue=q1;
		}
		queue[++rear]=element;
		size++;
		
		return true;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty...");
			return -1;
		}
		front=0;
		int t=queue[front];
		for(int i=front;i<size-1;i++)
			queue[i]=queue[i+1];
		size--;
		return t;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		return queue[front];
	}
	public int getSize()
	{
		return size;
	}

	public void display() {
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+queue[i]);
		}
		System.out.println();
		
	}
	
	
	

}


