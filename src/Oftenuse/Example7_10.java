package Oftenuse;

import java.util.*;

public class Example7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList mylist=new LinkedList();
		mylist.add("It");
		mylist.add("is");
		mylist.add("a");
		mylist.add("door");
		int number=mylist.size();
		for(int i=0;i<number;i++){
			String temp=(String)mylist.get(i);
			System.out.println("第"+i+"节点中数据："+temp);
			
		}
		Iterator iter =mylist.iterator();
		while(iter.hasNext()){
			String te=(String)iter.next();
			System.out.print(te+" "
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ "");
					
		}
		
	}

}
