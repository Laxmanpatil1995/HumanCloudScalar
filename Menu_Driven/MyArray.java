package Menu_Driven;




@SuppressWarnings("unchecked")
public class MyArray {

	 int[] arr=new int[1];
	 int index=0;
	public String toString()
	{
		String s="[";
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
			{
				s+=arr[i]+", ";
			}
			else
			{
				s+=arr[i];
			}
		}
		s+="]";
		
		return s;
	}
	public void ensertElement(int element)
	{
		if(index==arr.length-1)
		{
			grow();
		}
		arr[index++]=element;
		toprint();
			
	}
	private void toprint() {
		System.out.print("[");
		for(int i=0;i<index;i++)
		{
			if(i<index-1)
			System.out.print(arr[i]+", ");
			else
			System.out.print(arr[i]);
		}
		System.out.println("]");
		
	}
	private void grow() {
		int[]obj=new int[arr.length*2];
		for(int i=0;i<arr.length;i++)
		{
			obj[i]=arr[i];
		}
		arr=obj;
	}
	public boolean remove(int ind) {
		if(ind>arr.length || ind<0)
		{
			System.out.println("index Out of bound");
			return false;
		}
		int i=0;
		while(i<arr.length-1)
		{
			if(i==ind)
			{
				arr[i]=arr[i+1];
			}
			i++;
		}
		return true;
	
	}

	public  int get(int ind) {
		if(ind>arr.length || ind<0)
		{
			System.out.println(" index Out of bound");
			return -1;
		}
		return arr[ind];
	}

	public  boolean contains(int element) {
		
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==element)
				return true;
			i++;
		}
		return false;
	}

	public  int[] sort() {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(compareTo(arr[j],arr[j+1])>0)
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		return arr;
	}

	private int compareTo(Object ss1, Object ss2) {
		String s2=ss1.toString();
		String s3=ss2.toString();
		for(int i=0;i<s2.length() && i<s3.length();i++)
		{
			if(s2.charAt(i)!=s3.charAt(i))
			{
				return (s2.charAt(i)-s3.charAt(i));
			}
		}
		return (s2.length()-s3.length());
	}

	public  int length() {
		return index;
		
	}

}




