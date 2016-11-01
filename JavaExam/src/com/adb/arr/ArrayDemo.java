package com.adb.arr;
class Arr{
	public int method1(String args,String args2,String args3,String args4,String args5,String args6){
		int arr[]=new int[Integer.parseInt(args)];
		arr[0]=Integer.parseInt(args2);
		arr[1]= Integer.parseInt(args3);
		arr[2]=Integer.parseInt(args4);;
		arr[3]=Integer.parseInt(args5);;
		arr[4]=Integer.parseInt(args6);;
		int max=0;
		//在数组中遍历 设定最大值值 并比较
		for (int i=0;i<arr.length-1;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public int method2(String args,String args2,String args3,String args4,String args5,String args6){
		int arr[]=new int[Integer.parseInt(args)];
		arr[0]=Integer.parseInt(args2);
		arr[1]= Integer.parseInt(args3);
		arr[2]=Integer.parseInt(args4);
		arr[3]=Integer.parseInt(args5);
		arr[4]=Integer.parseInt(args6);
		int max=0,min=arr[0];
		//在数组中遍历 设定最小值 并比较
		for (int i=0;i<arr.length-1;i++) {
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}

}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象并使用方法 并赋值
		Arr array=new Arr();
		int max=array.method1(args[0], args[1], args[2], args[3], args[4], args[5]);
		System.out.println("最大值是："+max);
		int min=array.method2(args[0], args[1], args[2], args[3], args[4], args[5]);
		System.out.println("最小值是："+min);
		int c=(max+min)/2;
		System.out.println("最大值和最小值的平均值是："+c);

	}

}
