package Oftenuse;

import java.io.StreamCorruptedException;
import java.util.*;

public class Example7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar  days=Calendar.getInstance();
		days.set(1931, 8, 1);
		int weeks=days.get(Calendar.DAY_OF_WEEK)-1;
		String a[]=new String[weeks+30];
		for(int i=0;i<weeks;i++){
			a[i]="";
		}
		for(int i=weeks,n=1;i<weeks+30;i++){
			a[i]=String.valueOf(n);
			n++;
		}
		int year=days.get(Calendar.YEAR),
				month=days.get(Calendar.MONTH)+1;
		System.out.println(""+year+"年"+month+"月"+"18日，日本发动侵华战争");
		System.out.println("' 日',' 一',' 二',' 三',' 四',' 五',' 六',' 日'");
		for(int i=0;i<a.length;i++){
			if(i%7==0&&i!=0){
				System.out.print("\n");
			}
			System.out.print("  "+a[i]+"  ");
		}

	}

}
