package com.adb.triangle;import java.rmi.activation.ActivationGroup_Stub;

public class TriangleDemo extends Method{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建对象并使用方法 传入参数 打印实心向上三角形
		System.out.println("打印向上实心三角形！");
		Method real=new Method(); 
		real.method1(args[0],args[1]);
		//创建对象并使用方法 传入参数 打印空心向上三角形
		System.out.println("打印向上虚心三角形！");
		Method empty=new Method();
		empty.method2(args[0],args[1]);
		//创建对象并使用方法 传入参数 打印实心向下三角形
		System.out.println();
		System.out.println("打印向下虚心三角形！");
		Method empty2=new Method();
		empty2.method3(args[0],args[1]);
		System.out.println();
		System.out.println("打印向下实心三角形！");
		Method real2=new Method();
		real2.method4(args[0],args[1]);
	}

}
