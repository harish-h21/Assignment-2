class Test{ 
	private int a,b;

	public Test(int a, int b) { 
		this.a = a; 
		this.b = b; 
	} 
	
	public String toString() { 
		return String.format("a value %d b value %d",a,b); 
	} 
} 
public class ToStringOverride { 
	public static void main(String[] args) { 
		Test c1 = new Test(10, 15); 
		System.out.println(c1); 
	} 
} 
