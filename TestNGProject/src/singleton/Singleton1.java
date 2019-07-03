package singleton;

public class Singleton1 {
	
	private static Singleton1 singleton=new Singleton1();
	
	//A private constructor prevents any other class from instantiating 
	
	private Singleton1() {
		
	}

	//static 'instance' method
	public static Singleton1 getInstance() {
		return singleton;
	}

	//other method protected by singleton-ness
	protected static void demoMethod() {
		System.out.println("demo method fir singleton");
	}

}
