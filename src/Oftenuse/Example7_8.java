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
         Student stu1=new Student("����", 78),
        		      stu2=new Student("����", 98),
        		      stu3=new Student("���",67);
         mylist.add(stu1);
         mylist.add(stu2);
         mylist.add(stu3);
         int number=mylist.size();
         System.out.println("������������"+number+"���ڵ�");
         for(int i=0;i<number;i++){
        	 Student temp =mylist.get(i);
        	 System.out.println("��"+i+"�ڵ������ݣ�ѧ����"+temp.name+"   ����"+temp.score);
         }
         Student removeSTU=mylist.remove(1);
         System.out.println("��ɾ���Ľڵ���������Ϣ��"+removeSTU.name+"   "+removeSTU.score);
         Student replaceSTU=mylist.set(1, new Student("�Թ���",68));
         System.out.println("���滻�Ľڵ���������"+replaceSTU.name+""+replaceSTU.score);
         number=mylist.size();
         System.out.println("������������"+number+"���ڵ�");
         for(int i=0;i<number;i++){
        	 Student temp=mylist.get(i);
        	 System.out.println("��"+i+"�ڵ��е�������"+temp.name+" "+temp.score);
         }
         if(mylist.contains(stu1)){
        	 System.out.println("�������:"+stu1+" : ");
        	 System.out.println(stu1.name+","+stu1.score);
         }else{
        	 System.out.println("����û�нڵ㺬��"+stu1);
         }
         
	}

}
