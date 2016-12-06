package com.java.Reafactor￥Thread1;

 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Method {
	//定义一个标记
	static boolean flag;
	//设置一个带参的构造函数
	public Method(boolean flag){
		this.flag=flag;
	}
	//改为普通方法 等会反射调用#####
	public static void  method(int m,int n) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"configruation.txt");
		//初始化配置文件
		config(file);
		
		//对数据进行处理
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("请输入被除数:");
		int m=scanner.nextInt();
		System.out.println("请输入除数:");//在这里不是在debug模式下键盘录入！
		int n=scanner.nextInt();*/
		//处理数据
		math(m,n,file);
		//解题思路
		String answer="1 调用config(file)方法配置文件 \r\n"+"2通过math(srcData[0],srcData[1],file)方法求出满足条件的数据并追加进文件!\r\n"+"3通过deal()方法向文件追加解题思路，最后通过show()方法在控制台打印!\r\n";
		//向文件中追加解题思路
		deal(answer,file);
		//在控制台打印输出一切
		show(file);
	}
	//打印输出一切
	public  static void show(File file) throws IOException {
		// TODO Auto-generated method stub
		//高效字符输入流
				Reader reader=new FileReader(file); 
				BufferedReader io=new BufferedReader(reader);
				//读出每一行！
				String string=io.readLine();
				while (string!=null) {
					System.out.println(string);
					string=io.readLine();
				}
				//关闭流 先刷新在处理！
				io.close();
	}
	//向文件追加最后的解题思路
	public static void deal(String answer,File file) throws IOException {
		// TODO Auto-generated method stub
		//向文件中追加数据
				OutputStream os=new FileOutputStream(file, true);
				Writer writer=new OutputStreamWriter(os,"UTF-8");
				writer.write("解题思路为："+"\r\n");
				writer.write(answer);
				//关闭刷新流
				writer.flush();
				writer.close();
	}
	//对数据处理求得最大 最小 平均值 排序   
	private static int math(int i, int j,File file) throws IOException {
		// TODO Auto-generated method stub
		
		//定义一个list容器
		List<Integer> list=new LinkedList<Integer>();
		//文件写入流 设置为可追加   编码方式为utf-8
		OutputStream os=new FileOutputStream(file,true);
		OutputStreamWriter wt=new OutputStreamWriter(os,"UTF-8");
		//如果被除数小于等于0,提示不符合要求
		if (j<=0) {
			System.out.println("数据不符合要求,请重新输入");
			return 0;
		}
		//把满足条件的数据加到list集合中去
		for(int m=0;m<=i;m++){
			if (m%j==0) {
				list.add(m);
			}
		}
		//对数组进行排序
		//Collections.sort(list);并不需要排序，list本身有序不需要
		wt.write("满足条件的数据为:"+"\r\n");
		for (Integer integer : list) {
			wt.write(integer+"    ");
		}
		//求得最大最小值 和它们的平均值
		int max=Collections.max(list);
		int min=Collections.min(list);
		//对数组进行求和
		int sum=0;
		for (Integer integer : list) {
			sum+=integer;
		}
		wt.write("满足条件的数据的最大值是"+max+"   最小值是"+min+"   平均值是"+sum/list.size()+"   所有数据之和是"+sum+"\r\n");
		//关闭流
		wt.flush();
		wt.close();
		return 1;
	}
	//向配置文件配置
	public static void config(File file) throws IOException {
		// TODO Auto-generated method stub
		//文件写入流 设置为可追加   编码方式为utf-8
		OutputStream os=new FileOutputStream(file,flag);
		OutputStreamWriter wt=new OutputStreamWriter(os,"UTF-8");
		//键盘输入数据
		/*Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();*/ //这里并不需要录入数据
		//向文件追加数据
		wt.write("读取当前行的内容是:这是一个java上机题的文档文件:\r\n");
		wt.write("读取当前行的内容是:需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		//刷新关闭流
		wt.flush();
		wt.close();
	}

}
