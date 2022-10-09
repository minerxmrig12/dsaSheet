package pkg.oop;
import java.util.*;

class CAL{
	private int size = 0;
	private int DEFAULT_SIZE = 2;
	private int[] data;
	public CAL(){
		this.data = new int[DEFAULT_SIZE]; 
	}
	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	private boolean isFull() {
		if (size == data.length) return true;
		return false;
	}
	public void add(int n) {
		if(isFull()) {
			resize();
		}
		data[size++] = n;
	}
	private void resize() {
		int[] temp = new int[data.length*2];
		for(int i=0; i<data.length; i++) {
			temp[i] = data[i];
 		}
		data = temp;
	}
	public void clear() {
		size = 0;
	}
	public void add(int i, int n) {
		data[i] = n;
	}
	public void remove() {
		if(!isEmpty()) {
			size--;
		}
		 
	}
	public int get(int i) {
		return data[i];
	}
	public void set(int i, int n) {
		data[i] = n; 
	}
	public int indexOf(int n) {
		for(int i=0; i<data.length; i++) {
			if(data[i] == n) {
				return i;
			}
		}
		return -1;
	}
	public int size() {
		return size;
	}
	public String toString() {
		return " " + Arrays.toString(data);
	}
}

public class CustomArrayList {
	public static void main(String[] args) {
		
//		ArrayList<Integer> list = new ArrayList<>();
//		System.out.println(list.isEmpty());
//		list.add(5);
//		System.out.println(list);
//		list.clear();
//		list.add(0, 10);
//		System.out.println(list.get(0));
//		list.set(0, 10);
//		list.add(12);
//		System.out.println(list.indexOf(12));
//		System.out.println(list.size());
		
		CAL obj = new CAL();
		obj.add(10);
		obj.add(11);
		obj.add(12);
		System.out.println(obj.toString());
		obj.add(1, 13);
		System.out.println(obj.toString());
		System.out.println(obj.toString());
		obj.remove();
		obj.add(17);
		System.out.println(obj.toString());
		obj.clear();
		
	}//main

}
