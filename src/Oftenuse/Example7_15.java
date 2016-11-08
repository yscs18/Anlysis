package Oftenuse;

import java.util.*;

@SuppressWarnings("rawtypes")
class MyKey implements Comparable{
	int number=0;
	MyKey(int number){
		this.number=number;
	}
	public int compareTo(Object b){
		MyKey st=(MyKey)b;
		if((this.number -st.number)==0){
			return -1;
		}
		else{
			return (this.number-st.number);
		}
	}
	}
class Students{
	String name=null;
	int height,weight;
	Students(int w,int h,String name){
		weight=w;
		height=h;
		this.name=name;
	}
}
public class Example7_15 {

	public static void main(String[] args) {
		Students s1=new Students(65, 177,"张三");
		// TODO Auto-generated method stub
		Students s2=new Students(85, 166, "李四");
		TreeMap<MyKey,Students>treemap=new TreeMap<MyKey,Students>();
		treemap.put(new MyKey(s1.weight), s1);
		treemap.put(new MyKey(s2.weight), s2);
        int number=treemap.size();
        System.out.println("树映射中有"+number+"个对象：");
        Collection<Students>collection=treemap.values();
        Iterator<Students> iter=collection.iterator();
        while(iter.hasNext()){
        	Students te=iter.next();
        	System.out.println("   "+te.name+"   "+te.weight);
        }
        treemap.clear();
        treemap.put(new MyKey(s1.height), s1);
        treemap.put(new MyKey(s2.height), s2);
        number=treemap.size();
        System.out.println("树映射中有"+number+"个对象：");
        collection=treemap.values();
        iter=collection.iterator();
        while(iter.hasNext()){
        	Students te=iter.next();
        	System.out.println("  "+te.name+"  "+te.height );
        }
        
		
		
		             

	}

}
