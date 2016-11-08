package codepad;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.MarshalException;
import java.util.Scanner;

import Jama.Matrix;
 
public class Readtxt {
    public static void main(String[] args) {   
    	 File file = null;
  		FileWriter fw = null;
  		
    		 for(int j=1;j<=9;j++){
    			 try {
    	            Scanner in = new Scanner(new File("C:/Users/user/Desktop/竞赛用例_数据/case00"+j+"_input.txt"));
    	            int[] a=new int[3];
    	            for(int i=0;i<3;i++){
    	            	try {				    	            
    	            String out=in.nextLine();
    	            Scanner scan=new Scanner(out);    	            
    	            a[i]=scan.nextInt();    	
    	            }catch (Exception e) {
						// TODO: handle exception
					}
    	            }
    	            int m=0;
    	            double  [][] b= new double[a[0]][a[2]];
    	            double[] k=new double[a[0]];
    	            double[][] y=new double[a[0]][1];
       	            while (m<a[0]) {
       	            	try {
       	            	   String str = in.nextLine();
       	            	    Scanner scan1=new Scanner(str);    
       	            	    for(int n=0;n<3;n++){
         	                    b[m][n]=scan1.nextDouble();          	                                
       	            	    } 
       	            	    m++;
       	            	    System.out.println(" ");
						} catch (Exception e) {
							// TODO: handle exception
						}    	             
    	              }
                 	            for(int x=0;x<a[0];x++){
          	            	        k[x]=(b[x][0]*b[x][0]+b[x][1]*b[x][1]+b[x][2]*b[x][2]);
                 	            }
                 	           for(int x=0;x<a[0]-1;x++){
//          	            	        System.out.println(k[x]);
          	            	        b[x][0]=b[x+1][0]-b[0][0];
    	    	            		b[x][1]=b[x+1][1]-b[0][1];
    	    	            		b[x][2]=b[x+1][2]-b[0][2];
    	    	 }
                 	           int count=0;
          	      while(in.hasNext()){
          	    	  count++;
          	    	  try {
          	    		  String str1=in.nextLine();
          	    		Scanner scan2=new Scanner(str1);    
          	    		double[] l1=new double [a[0]];
   	            	    for(int n=0;n<a[0];n++){
     	                    l1[n]=scan2.nextDouble()*3*100000000;       
//     	                    System.out.println(l1[n]);
     	                      	                    
   	            	    }    	            	   
   	            	    for(int u=0;u<a[0];u++)
   	            	    {
   	            	    	 y[u][0]=k[u]-l1[u]*l1[u]-k[0]+l1[0]*l1[0];
//   	            	    	 System.out.println(k[u]);
   	            	    }
   	            	   
   	            	     Matrix Y=new Matrix(y);     	
     	            	   Matrix A2=new Matrix(b);
     	            	   A2=A2.transpose();
     	            	   Matrix  A4=A2.times(Y);
     	            	 	 
     	      	    			file = new File("e:/shuxue/"+count+".txt");
     	      	    			file.createNewFile();
     	      	    			fw = new FileWriter(file);
     	      	    		
//     	      	    			String str3=A4.getMatrix(0, 0, 0, 0);
     	      	    			A2.getMatrix(0, 2, 0, 0);
     	      	    			A2.getMatrix(0, 2, 0, 0).print(0, 2);
     	      	    			double [][] need=A2.getMatrix(0, 2,0,0).getArrayCopy();
     	      	    			String str=need[0][0]+","+need[1][0]+","+need[2][0];
     	      	    			fw.write(str);
     	      	    		 	   
     	      	    		
     	      					try {
     	      						fw.flush();
     	      						fw.close();
     	      					} catch (IOException e) {
     	      						// TODO Auto-generated catch block
     	      						e.printStackTrace();
     	      					}

     	      				
     	      			

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
          	    	  
    			
          	      }
    			 }catch (FileNotFoundException e) {
    	            e.printStackTrace();
    	        }    
 }

    }
}
