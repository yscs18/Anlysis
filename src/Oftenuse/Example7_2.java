package Oftenuse;

import java.util.Calendar;
import java.util.Date;

public class Example7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		String ��=String.valueOf(calendar.get(Calendar.YEAR)),
				  ��=String.valueOf(calendar.get(Calendar.MONTH)+1),
				  ��=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
				  ����=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
		int hour=calendar.get(Calendar.HOUR_OF_DAY),
			minute=calendar.get(Calendar.MINUTE),
		    second = calendar.get(Calendar.SECOND);
		System.out.println("����ʱ���ǣ� ");
		System.out.println(""+��+"��"+��+"��"+��+"��"+����+"����");
		System.out.println(""+hour+"ʱ"+minute+"��"+second+"��");
		calendar.set(1931,8,18);
		long timeOne=calendar.getTimeInMillis();
		calendar.set(1945,7,15);
		long timeTwo=calendar.getTimeInMillis();
		long �������=(timeTwo-timeOne)/(1000*60*60*24);
		System.out.println("1945��8��15����1931��9��18�������"+�������+"��");
				  

	}

}
