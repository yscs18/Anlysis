package Oftenuse;

import java.util.HashSet;
import java.util.Iterator;

public class Example7_12 {
	public static void main(String args[]){
		Integer one =new Integer(1);
		Integer two =new Integer(2);
		Integer three =new Integer(3);
		Integer four =new Integer(4);
		Integer five =new Integer(5);
		Integer six =new Integer(6);
		HashSet<Integer>A=new HashSet<Integer>(),
				B=new HashSet<Integer>(),
				tempset=new HashSet<Integer>();
		A.add(one);
		A.add(two);
		A.add(three);
		A.add(four);
		B.add(one);
		B.add(two);
		B.add(five);
		B.add(six);
		tempset=(HashSet<Integer>)A.clone();
		A.removeAll(B);
		B.removeAll(tempset);
		B.addAll(A);
		int number=B.size();
		System.out.println("A和B的对称差集合有"+number+"个元素");
		Iterator<Integer>iter=B.iterator();
		while(iter.hasNext()){
			Integer te =iter.next();
			System.out.println("  "+te.intValue());
			
		
		}
		
		
		
	}

}
