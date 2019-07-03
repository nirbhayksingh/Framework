package singleton;

public class Singleton {

	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		str="Hey I am using Singleton class pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance== null)
			singleton_instance=new Singleton();
		return singleton_instance;
	}
	
	public static void main(String[] args) {

	Singleton x=Singleton.getInstance();
	Singleton y=Singleton.getInstance();
	Singleton z=Singleton.getInstance();

	x.str=(x.str).toUpperCase();
		
	System.out.println(x.str);
		
	}

}
