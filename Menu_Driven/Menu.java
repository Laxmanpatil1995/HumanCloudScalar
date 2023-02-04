package Menu_Driven;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Menu extends MenuItems {

	private static boolean isLevelOne = true;
	List<MenuItems> items = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	static MyStack s=new MyStack();
	static MyQueue q=new MyQueue();
	static MyLinkedList<Integer> linkedlist=new MyLinkedList<>();
	static MyArray arr=new MyArray();

	public Menu() {
		super();
	}

	public Menu(int id, String name) {
		super(id , name);

	}

	public List<MenuItems> getItems() {
		return items;
	}

	public void addMenuItems(MenuItems menuItems) {
		menuItems.setParent(this);
		items.add(menuItems);

	}


	public void displayMi() {
		if (isLevelOne) {
			isLevelOne = false;
			items.forEach(e -> e.display());
			isLevelOne = true;
			System.out.println("enter choice..");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("invalid choice..1");
				displayMi();
			} else {
				MenuItems mi = getItems().stream().filter(m -> m.getMi_index() == choice).findFirst().orElse(null);
				if (mi == null) {
					System.out.println("invalid choice please enter valid input..");
					displayMi();
				} else if (mi instanceof Menu) {
					select(mi);
				}

			}
		}

	}

	private void select(MenuItems mi) {
		// TODO Auto-generated method stub
		((Menu) mi).getItems().forEach(e->e.display());
		String choice=mi.getParent().getName();
		switch(choice)
		{
		case "Stack" :
			stackM(s,mi);
			break;
		case "Queue": 
			queueM(q,mi);
			break;
		case "Linked List":
			linkedListM(linkedlist,mi);
			break;
		case "Array":
			ArrayM(arr,mi);
			break;

		}
	}
	//######################################## My  Array  ##########################################//////

	private void ArrayM(MyArray arr, MenuItems mi) {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("enter element");
			String s1=sc.next();
			checkInputAdd(s1,arr,mi);
			select(mi);
		}break;
		case 2:{
			System.out.println("enter element index ");
			int x=sc.nextInt();
			boolean ss=arr.remove(x);
			if(ss)
				System.out.println("Removed Successfully...\n");
			else
				System.out.println("element not removed");
			select(mi);
		}break;
		case 3:{
			System.out.println("enter index number");
			int x=sc.nextInt();
			System.out.println(arr.get(x));
			select(mi);
		}break;
		case 4:{
			MenuDrivenClass.menuDrivenMethod();
		}break;
		default:
			System.out.println("Enter correct method....\n");
			select(mi);
			break;
		}

	}
	public  void checkInputAdd(String s1,MyArray linkedlist2,MenuItems mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			ArrayM(linkedlist2,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			linkedlist2.ensertElement(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			ArrayM(linkedlist2,mi);
		}
	}


	//###########################################  Linked  List  ########################################/// 
	private void linkedListM(MyLinkedList<Integer> linkedlist, MenuItems mi) {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter the element : ");
			String s1=sc.next();
			checkInputAdd(s1,linkedlist,mi);
			System.out.println("element is added sucessfully");
			select(mi);
		}break;
		case 2:{
			System.out.println("Enter the index");
			int ind=sc.nextInt();
			System.out.println("Enter the element");
			String s1=sc.next();
			checkcheckInputAddAt(ind,s1,linkedlist,mi);
			System.out.println("element is added sucessfully");
			select(mi);
		}break;
		case 3:{
			System.out.println("Enter the index of object which you want to remove");
			int ind=sc.nextInt();
			List<MenuItems> linkedlist2 = new LinkedList<>();
			linkedlist2.remove(ind);
			System.out.println("remove successfully...");
			select(mi);

		}break;
		case 4:{
			System.out.println("Enter the index");
			int ind=sc.nextInt();
			System.out.println("Object at index "+ind+"is : "+linkedlist.get(ind));
			select(mi);
		}break;
		case 5:{
			MenuDrivenClass.menuDrivenMethod();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}
	}
	public  void checkInputAdd(String s1,MyLinkedList<Integer> linkedlist2, MenuItems mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			linkedListM(linkedlist2,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			linkedlist2.add(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			linkedListM(linkedlist2,mi);
		}
	}
	public void checkcheckInputAddAt(int ind1, String s11, MyLinkedList<Integer> linkedlist2,MenuItems mi) {


		int cnt=0;
		if(s11.length()>10)
		{
			System.out.println("Please enter correct input");
			linkedListM(linkedlist2,mi);
		}
		for(int i=0;i<s11.length();i++)
		{
			if(s11.charAt(i)>='0' || s11.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s11.length())
		{
			int y=Integer.parseInt(s11);
			linkedlist2.addAt(ind1, y);
		}
		else
		{
			System.out.println("Please enter correct input");
			linkedListM(linkedlist2,mi);
		}
	}

	//########################################  MyQueue  ###################################################//
	private void queueM(MyQueue queue, MenuItems mi) {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter the element : ");
			String s1=sc.next();
			checkInput(s1,queue,mi);
			System.out.println("element is added sucessfully\n");
			select(mi);

		}
		break;
		case 2:{
			System.out.println("removed element: "+queue.dequeue());
			System.out.println("remove successfully...");
			select(mi);
		}break;
		case 3:{
			System.out.println("peek element : "+queue.peek());
			select(mi);

		}break;
		case 4:{
			System.out.println("All Queue element :\n");
			queue.display();
			System.out.println();
			select(mi);
		}break;
		case 5:{
			MenuDrivenClass.menuDrivenMethod();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}

	}
	public  void checkInput(String s1,MyQueue queue,MenuItems mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			queueM(queue,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			queue.enqueue(y);
		}
		else
		{
			System.out.println("Please enter correct input");
			queueM(queue,mi);
		}
	}


	//#######################################   My Stack  ##########################################//////////
	private void stackM(MyStack stack, MenuItems mi) {
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter element ");
			String s1=sc.next();
			checkInput(s1,stack,mi);
			select(mi);
		}break;
		case 2:{
			System.out.println("removed element: "+stack.pop());
			select(mi);
		}break;
		case 3:{
			System.out.println("peek element : "+stack.peek());
			select(mi);
		}break;
		case 4:{
			System.out.println(stack.isEmpty());
			select(mi);
		}break;
		case 5:{
			MenuDrivenClass.menuDrivenMethod();
		}break;
		default :
			System.out.println("choose correct method ");
			break;
		}
	}
	public  void checkInput(String s1,MyStack stack,MenuItems mi) {
		int cnt=0;
		if(s1.length()>10)
		{
			System.out.println("Please enter correct input");
			stackM(stack,mi);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				cnt++;
		}
		if(cnt==s1.length())
		{
			int y=Integer.parseInt(s1);
			stack.push(y);
			System.out.println("Element added ...\n");
		}
		else
		{
			System.out.println("enter correct input");
			stackM(stack,mi);
		}
	}

}