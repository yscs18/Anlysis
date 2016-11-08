package Oftenuse;

import java.util.LinkedList;

class Student{
	String name;
	int score;
	Student(String name,int score){
		this.name=name;
		this.score=score;
	}
}
public class Example7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList<Student> mylist=new LinkedList<Student>();
         Student stu1=new Student("张三", 78),
        		      stu2=new Student("王二", 98),
        		      stu3=new Student("李二",67);
         mylist.add(stu1);
         mylist.add(stu2);
         mylist.add(stu3);
         int number=mylist.size();
         System.out.println("现在链表中有"+number+"个节点");
         for(int i=0;i<number;i++){
        	 Student temp =mylist.get(i);
        	 System.out.println("第"+i+"节点中数据，学生："+temp.name+"   分数"+temp.score);
         }
         Student removeSTU=mylist.remove(1);
         System.out.println("被删除的节点中数据信息是"+removeSTU.name+"   "+removeSTU.score);
         Student replaceSTU=mylist.set(1, new Student("赵钩林",68));
         System.out.println("被替换的节点中数据是"+replaceSTU.name+""+replaceSTU.score);
         number=mylist.size();
         System.out.println("现在链表中有"+number+"个节点");
         for(int i=0;i<number;i++){
        	 Student temp=mylist.get(i);
        	 System.out.println("第"+i+"节点中的数据是"+temp.name+" "+temp.score);
         }
         if(mylist.contains(stu1)){
        	 System.out.println("链表包含:"+stu1+" : ");
        	 System.out.println(stu1.name+","+stu1.score);
         }else{
        	 System.out.println("链表没有节点含有"+stu1);
         }
         
	}

}
