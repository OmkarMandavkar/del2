package StaticMembers;

public class P3 {
	public static String s3 = "XYZ";
	
	public static void main(String[] args) {
		System.out.println(s3);
		System.out.println(P2.s1); //can be used to access the members of 									  									others class by their classname
	}
}
