package javabtech;
// program to print the classloader name  
public class ClassLoader {

	public static void main(String[] args) {
		Class c=ClassLoader.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
		
		
	}

}
