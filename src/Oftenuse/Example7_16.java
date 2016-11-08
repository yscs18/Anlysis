package Oftenuse;

import java.util.Stack;

public class Example7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> stack =new Stack<Integer>();
       stack.push(new Integer(1));
       stack.push(new Integer(2));
       int k=1;
       while(k<=10){
    	   for(int i=1;i<=2;i++){
    		   Integer f1=stack.pop();
    		   int f2=f1.intValue();
    		   Integer f3=stack.pop();
    		   int f4=f3.intValue();
    		   Integer temp=new Integer(f1+f3);
    		   System.out.println(""+temp.toString());
    		   stack.push(temp);
    		   stack.push(f3);
    	   }
    	   k++;
       }
	}

}
