package Oftenuse;

import java.text.NumberFormat;

public class Example7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Math.sqrt(10);
		System.out.println("��ʽ��ǰ��"+a);
		NumberFormat f=NumberFormat.getInstance();
		f.setMaximumFractionDigits(5);
		f.setMaximumIntegerDigits(3);
		String s=f.format(a);
		System.out.println("��ʽ����"+s);
		System.out.println("�õ����������");
		int number=8;
		for(int i=1;i<=20;i++){
			int randomNumber=(int)(Math.random()*number)+1;
			System.out.print(" "+randomNumber);
			if(i%10==0)
				System.out.println("");
		}
	}
}
