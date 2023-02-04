package Menu_Driven;


@SuppressWarnings("unchecked")
public class MyLinkedList<T> {

	Node<T> root;

	public void add(T data)
	{
		Node<T> obj=new Node<T>(data);

		if(root==null)
		{
			root=obj;
		}
		else
		{
			Node<T> temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	public void remove(int i)
	{
		if(i<0) {
			System.out.println("ArrayIndexOutOfBoundsException");
			return;			}
		if(i==0) {
			root=root.next;
			return;
		}
		Node<T> temp=root;
		int ind=0;
		while(temp.next!=null)
		{
			if(ind==i-1)
			{
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
			ind++;
		}
		System.out.println("ArrayIndexOutOfBoundsException");
		return;	}
	public void addAt(int i,T data)
	{
		if(i<0)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			return;		}
		Node<T> obj=new Node<>(data);
		if(i==0)
		{
			obj.next=root;
			root=obj;
			return;
		}
		Node<T> temp=root;
		int ind=0;
		while(temp!=null)
		{
			if(ind==i-1)
			{
				obj.next=temp.next;
				temp.next=obj;
				return;
			}
			temp=temp.next;
			ind++;
		}
		System.out.println("ArrayIndexOutOfBoundsException");
		return;
	}
	public T get(int i)
	{
		if(i<0) {
			System.out.println("ArrayIndexOutOfBoundsException");
			return (T)new MyLinkedList<>();		}
		//		if(i==0)
		//		{
		//			return root.data;
		//		}
		Node<T> temp=root;
		int ind=0;
		while(temp!=null)
		{
			if(ind==i)
				return temp.data;
			temp=temp.next;
			ind++;
		}
		System.out.println("ArrayIndexOutOfBoundsException");
		return (T)new MyLinkedList<>();		
	}
	public void set(int i,T data)
	{
		if(i<0)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			return;
		}
		Node<T> obj=new Node<>(data);
		if(i==0)
		{
			obj.next=root.next;
			root=obj;
			return;
		}
		Node<T> temp=root;
		int ind=0;
		while(temp!=null)
		{
			if(ind==i-1)
			{
				obj.next=temp.next.next;
				temp.next=obj;
				return;
			}
			temp=temp.next;
			ind++;
		}
		System.out.println("ArrayIndexOutOfBoundsException");
		return;
	}
	public int size()
	{
		Node<T> temp=root;
		int ind=0;
		while(temp!=null)
		{
			temp=temp.next;
			ind++;
		}
		return ind;
	}
	public boolean contains(T data)
	{
		Node<T> temp=root;
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	public MyLinkedList<T> clone()
	{
		MyLinkedList<T> cl=new MyLinkedList<>();
		Node<T> temp=root;
		while(temp!=null)
		{
			cl.add(temp.data);
			temp=temp.next;
		}
		return cl;
	}
	//	public boolean equals(MyLinkedList<T> l1)
	//	{
	//		Node<T> temp=root;
	//		int ind=0;
	//		while(temp!=null)
	//		{
	//			temp=temp.next;
	//			ind++;
	//		}
	//		if(ind!=l1.size())
	//		{
	//			return false;
	//		}
	//		//Node<T> temp1=root;
	//		int ind2=0;
	//		while(ind2<l1.size())
	//		{
	////			if(temp.data!=l1.get(ind2))
	////				return false;
	//			System.out.println(temp.data+" "+l1.get(ind2));
	//			temp1=temp1.next;
	//			ind2++;
	//		}
	//		return true;
	//	}
	public void clear()
	{
		root=null;
	}

	public String toString()
	{
		String s="[";
		Node<T> temp=root;
		while(temp!=null)
		{
			if(temp.next!=null)
			{
				s+=temp.data+", ";
			}
			else
			{
				s+=temp.data;
			}
			temp=temp.next;
		}
		s+="]";
		return s;
	}
	public void ensertElement(int y) {
		// TODO Auto-generated method stub
		
	}

}
class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data=data;
	}	
}

