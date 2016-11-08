package Oftenuse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date nowTime=new Date();
		System.out.println("现在的时间："+nowTime);
		SimpleDateFormat matter1=new SimpleDateFormat("'BeijingTime':yyyy-MMM-dd");
		System.out.println("现在的时间"+matter1.format(nowTime));
		SimpleDateFormat matter2=new SimpleDateFormat("北京时间 yyyy-MM-dd HH:mm:ss(a)(EE)");
		long time=-1000L;
		Date date=new Date(time);
		System.out.println(time+"秒表示的时间是："+matter2.format(date));
		time=1000L;
		date=new  Date(time);
		System.out.println(time+"秒表示的日期时间是："+matter2.format(date));
	}
}
