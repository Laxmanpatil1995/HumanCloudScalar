package Menu_Driven;

public class MenuItems {
	
	private int Mi_index;
	private String name;
	private MenuItems parent;
	@Override
	public String toString() {
		return " [parent=" + parent + "]";
	}
	public MenuItems() {
		super();
	}

	public MenuItems(String name) {
		super();
		this.name = name;
	}
	public MenuItems(int mi_index, String name) {
		super();
		Mi_index = mi_index;
		this.name = name;
	}
	public int getMi_index() {
		return Mi_index;
	}
	public void setMi_index(int mi_index) {
		Mi_index = mi_index;
	}
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return name;
	}
	
	public MenuItems getParent() {
		return parent;
	}
	
	public void setParent(MenuItems string) {
		this.parent=string;
	}
	
	public void display() {
		System.out.println(Mi_index+" : "+name+" ");
	}
}


