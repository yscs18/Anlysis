package Oftenuse;

import java.util.Calendar;
import java.util.Date;

public class Example7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		String 年=String.valueOf(calendar.get(Calendar.YEAR)),
				  日=String.valueOf(calendar.get(Calendar.MONTH)+1),
				  月=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
				  星期=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
		int hour=calendar.get(Calendar.HOUR_OF_DAY),
			minute=calendar.get(Calendar.MINUTE),
		    second = calendar.get(Calendar.SECOND);
		System.out.println("现在时间是： ");
		System.out.println(""+年+"年"+月+"月"+日+"日"+星期+"星期");
		System.out.println(""+hour+"时"+minute+"分"+second+"秒");
		calendar.set(1931,8,18);
		long timeOne=calendar.getTimeInMillis();
		calendar.set(1945,7,15);
		long timeTwo=calendar.getTimeInMillis();
		long 相隔天数=(timeTwo-timeOne)/(1000*60*60*24);
		System.out.println("1945年8月15日与1931年9月18日相隔‘"+相隔天数+"天");
				  

	}

}
