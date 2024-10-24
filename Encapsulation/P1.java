package Encapsulation;

class Bag{
	String name;
	private String codeName;

	public Bag(String name, String codeName) {
		this.name = name;
		this.codeName = codeName;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
}

public class P1 {
	public static void main(String[] args) {
		
		Bag b1 = new Bag("LV", "kdmewo");
		System.out.println(b1.name);
		
		System.out.println(b1.getCodeName());
		
		b1.setCodeName("jchbcs");
		System.out.println(b1.getCodeName());
	}

}
