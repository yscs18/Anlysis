package Oftenuse;

public class Example7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Math.sqrt(10);
		System.out.println("格式化前："+a);
		MyNumberFormat  myformat=new MyNumberFormat();
		System.out.println("格式化后："+myformat.format(a,5));

	}

}
class MyNumberFormat{
	public String format(double a,int n){
		String str=String.valueOf(a);
		int index=str.indexOf(".");
		String temp=str.substring(index+1);
		int fractionLeng=temp.length();
		n=Math.min(fractionLeng, n);
		str=str.substring(0, index+n+1);
		return str;
}
}
