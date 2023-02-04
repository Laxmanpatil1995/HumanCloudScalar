package Menu_Driven;

public class MyStack {
	
	 int arr[]=new int[1];
	 int top=-1;
	 int capacity=arr.length;
	
	 
	public int size()
	{
		return top+1;
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
//			if(top == capacity)
//			{
//				grow();
//				return false;
//			}
		return false;
	}
	private void grow() {

		int[] ar1=new int[capacity*2];
		for(int i=0;i<arr.length;i++)
		{
			ar1[i]=arr[i];
			
		}
		arr=ar1;
		capacity*=2;
		
		
	}
	public int peek()
	{
		if(!isEmpty()) {
		return (arr[top]);}
		else
		{
			return -1;
		}
		//return (T)((Integer)(-1));
	}
	public void push (int data)
	{
		
		if(top == capacity-1)
		{
			grow();
		}
		System.out.println("Inserted "+data);
		arr[++top]=data;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		
		System.out.println("Removing "+peek());
		return arr[top--];
	}
	public void print()
	{
		System.out.print("[");
		for(int i=top;i>-1;i--)
		{
			if(i>0)
			System.out.print(" "+arr[i]+",");
			else
				System.out.print(" "+arr[i]);
			
		}
		System.out.println("]");

	}
	

}


