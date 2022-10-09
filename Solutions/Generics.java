package pkg.oop;

class GenericClass <T>{
	private T data;
	public GenericClass(T data) {
		this.data = data;
	}
	
	public T getter() {
		return data;
	}
}
public class Generics {
	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<String>("A string");
		System.out.println(obj.getter());
		
		GenericClass<Integer> obj2 = new GenericClass<Integer>(78);
		System.out.println(obj2.getter());
	}

}
