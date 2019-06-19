 class PrivateConstructor
{
	String name;
	private PrivateConstructor()
	{
		name="hello";	
	}
	public static PrivateConstructor createInstance()
	{
		return new PrivateConstructor();
	}
}

public class PrivateConstructorEx
{
	public static void main(String args[])
	{
		PrivateConstructor pc=PrivateConstructor.createInstance();
		System.out.println(pc.name);
	}

}