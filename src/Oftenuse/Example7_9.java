package Oftenuse;

import java.util.Iterator;
import java.util.LinkedList;

class Student1{
	String name;
	int number;
	float score;
	Student1(String name,int number,float score){
		this.name=name;
		this.number=number;
		this.score=score;
	}
}

public class Example7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Student1> mylist =new LinkedList<Student1>();
        Student1 stu_1=new Student1("ÕÔÃñ", 9012, 80.0f),
        		     stu_2=new Student1("Ç®Çà", 9013, 90.0f),
        		     stu_3=new Student1("ËïÃ¶", 9014, 78.0f),
        		     stu_4=new Student1("ÖÜÓÒ", 9015, 55.0f);
        mylist.add(stu_1);
        mylist.add(stu_2);
        mylist.add(stu_3);
        mylist.add(stu_4);
        Iterator<Student1>iter=mylist.iterator();
        while(iter.hasNext()){
        	Student1 te=iter.next();
        	System.out.println(te.name+" "+te.number+""+te.score);
        }
	}

}
