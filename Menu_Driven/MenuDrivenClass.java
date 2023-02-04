package Menu_Driven;

public class MenuDrivenClass {

	public static void main(String[] args) {
		menuDrivenMethod();
	}
	

	public static void menuDrivenMethod() {

		Menu mainMenu = new Menu(0, "Data Structures");

		Menu stackmenu = new Menu(1, "Stack");
		Menu qMenu = new Menu(2, "Queue");
		Menu LinkedListMenu = new Menu(3, "Linked List");
		Menu ArrayMenu = new Menu(4, "Array");

		mainMenu.addMenuItems(stackmenu);
		mainMenu.addMenuItems(qMenu);
		mainMenu.addMenuItems(LinkedListMenu);
		mainMenu.addMenuItems(ArrayMenu);

		stackmenu.addMenuItems(new MenuItems(1, "Push"));
		stackmenu.addMenuItems(new MenuItems(2, "Pop"));
		stackmenu.addMenuItems(new MenuItems(3, "peek"));
		stackmenu.addMenuItems(new MenuItems(4, "is empty"));
		stackmenu.addMenuItems(new MenuItems(5, "back"));
		stackmenu.setParent(stackmenu);
		
		qMenu.addMenuItems(new MenuItems(1, "Enqueue"));
		qMenu.addMenuItems(new MenuItems(2, "DeQueue"));
		qMenu.addMenuItems(new MenuItems(3, "peek"));
		qMenu.addMenuItems(new MenuItems(4, "display"));
		qMenu.addMenuItems(new MenuItems(5, "back"));
		qMenu.setParent(qMenu);

		LinkedListMenu.addMenuItems(new MenuItems(1, "insert"));
		LinkedListMenu.addMenuItems(new MenuItems(2, "insert At Start"));
		LinkedListMenu.addMenuItems(new MenuItems(3, "remove"));
		LinkedListMenu.addMenuItems(new MenuItems(4, "get"));
		LinkedListMenu.addMenuItems(new MenuItems(5, "back"));
		LinkedListMenu.setParent(LinkedListMenu);

		ArrayMenu.addMenuItems(new MenuItems(1, "add"));
		ArrayMenu.addMenuItems(new MenuItems(2, "remove"));
		ArrayMenu.addMenuItems(new MenuItems(3, "display"));
		ArrayMenu.addMenuItems(new MenuItems(4, "back"));
		ArrayMenu.setParent(ArrayMenu);

		mainMenu.displayMi();

	}

	public static void structure() {
		// TODO Auto-generated method stub

	}

}
