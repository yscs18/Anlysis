package Oftenuse;
import java.text.*;

public class Example7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456789;
		System.out.println("整数"+n+"按千分组（带正号）：");
//		String s=String.format("%d", n);
		int p[][] = {
		        {0,0,2,2,1,3,2,3,0,4},
		        {1,1,1,2,0,4,0,3,3,2},
		        {2,0,0,3,3,4,2,1,1,2},
		        {3,0,2,3,2,0,4,1,1,0},
		        {3,0,2,2,4,1,4,0,3,2},
		        {4,3,0,0,3,0,4,3,0,0},
		        {3,3,1,4,1,0,2,3,2,1},
		        {0,3,2,2,3,1,4,0,2,1},
		        {1,1,3,3,0,0,4,2,2,1},
		        {4,2,0,0,4,3,2,0,0,1}};
		System.out.println(p[2][2]);

	}
}
