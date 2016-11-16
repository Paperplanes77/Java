package com.java.Reafactor￥Thread;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入被除数:");
		int m=scanner.nextInt();
		System.out.println("请输入除数:");
		int n=scanner.nextInt();
		Class<?> class1=null;
		try {
			class1 = Class.forName("com.java.question2.Method");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//获取构造方法
		Constructor<?>[] c=null;
		try {
			c = class1.getConstructors();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Object obj=c[0].newInstance(false);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//配置方法
		Method method=null;
		try {
			method= class1.getMethod("method",int.class,int.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			method.invoke(null,m,n);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
