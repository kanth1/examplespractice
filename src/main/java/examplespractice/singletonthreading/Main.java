package examplespractice.singletonthreading;

class Main {
	public static void main(String args[]) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		obj2.x = "HI";
		System.out.println(obj3.x);
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}
