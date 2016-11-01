package com.adb.xx;

public class Method {
	//定义x1,x2 在初始化数据
	double x1,x2;
	public double method1(String str1,String str2,String  str3){
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=Integer.parseInt(str3);
		int m=b*b-4*a*c;
		
		try {
			if(a==0){
				System.out.println("这是一元一次方程！请重新输入数据：");
				throw new ArithmeticException("一个算术异常");
			}else if(b==0){
				System.out.println("这个二次方程！");
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("抛出异常为："+e);
			e.printStackTrace();
		}
		if(m>=0&&a!=0){
			x1=(-b+Math.sqrt(m))/2*a;
		}else {
			System.out.println("这个一元二次方程没有根！");
		}
		return x1;
	}
	public double method2(String str1,String str2,String  str3){
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=Integer.parseInt(str3);
		int m=b*b-4*a*c;
		try {
			if(a==0){
				System.out.println("这是一元一次方程！请重新输入数据：");
				throw new ArithmeticException("一个算术异常");
			}else if(b==0){
				System.out.println("这个二次方程！");
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("抛出异常为："+e);
			e.printStackTrace();
		}
		if(m>=0&&a!=0){
			x2=(-b-Math.sqrt(m))/2*a;
		}else{
			System.out.println("这个一元二次方程没有根！");

		}
		return x2;
	}
}
