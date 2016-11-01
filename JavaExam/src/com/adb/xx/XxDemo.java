package com.adb.xx;

public class XxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method tmp=new Method();
		double m=tmp.method1(args[0], args[1], args[2]);
		System.out.println("二元一次方程的根x1为："+m);
		Method tmp2=new Method();
		double n=tmp.method2(args[0], args[1], args[2]);
		System.out.println("二元一次方程的根x2为："+n);
	}

}
