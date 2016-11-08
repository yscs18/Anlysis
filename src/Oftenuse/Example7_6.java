package Oftenuse;

import java.math.BigInteger;

public class Example7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n1=new BigInteger("987654321987654321987654321"),
				         n2=new BigInteger("123456789123456789123456789"),
				         result=null;
		result=n1.add(n2);
		System.out.println(n1+"+"+n2+"="+result);
		result=n1.subtract(n2);
		System.out.println(n1+"-"+n2+"="+result);
		result=n2.multiply(n1);
		System.out.println(n1+"*"+n2+"="+result);
		result=n1.divide(n2);
		System.out.println(n1+"/"+n2+"="+result);
		BigInteger m=new BigInteger("77889988"),
				         count=new BigInteger("0"),
		                 one=new BigInteger("1"),
		                 two=new BigInteger("2");
		for(BigInteger i=two;i.compareTo(m)<0;i=i.add(one)){
			if((n1.remainder(i).compareTo(BigInteger.ZERO))==0){
				count=count.add(one);
				System.out.println(m+"的因子： "+i);
			}
		}
		                 System.out.println(m+"一共有"+count+"个因子");

	}

}
