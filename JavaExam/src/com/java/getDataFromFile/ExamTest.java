package com.java.getDataFromFile;

import java.awt.List;
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
import java.util.Scanner;


public class ExamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"configruation.txt");
		//初始化配置文件
		config(file);
		//解析获得需要的数据
		int[] arr=getData(file);
		//对数据进行处理
		math(arr[0],arr[1],file);
		//解题思路
		String answer="1 调用config(file)方法配置文件 \r\n"+"2通过getData(file)方法获得设置数据源,向配置文件追加数据说明,并告知退出配置文件.并同时返回一个数组的int数组!\r\n"
		+"3通过math(srcData[0],srcData[1],file)方法求出满足条件的数据并追加进文件!\r\n"+"4通过deal()方法向文件追加解题思路，最后通过show()方法在控制台打印!\r\n";
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
		LinkedList<Integer> list=new LinkedList<Integer>();
		//文件写入流 设置为可追加   编码方式为utf-8
		OutputStream os=new FileOutputStream(file,true);
		OutputStreamWriter wt=new OutputStreamWriter(os,"UTF-8");
		//如果被除数小于等于0,提示不符合要求
		if (j<=0) {
			System.out.println("数据不符合要求,请重新输入");
			return 0;
		}
		//把满足条件的数据加到list集合中去
		for(int m=0;m<i;m++){
			if (m%j==0) {
				list.add(m);
			}
		}
		//对数组进行排序
		Collections.sort(list);
		wt.write("满足条件的数据为:"+"\r\n");
		for (Integer integer : list) {
			wt.write(integer+"    ");
		}
		//求得最大最小值 和它们的平均值
		int max=Collections.max(list);
		int min=Collections.min(list);
		int average=(max+min)/2;
		//对数组进行求和
		int sum=0;
		for (Integer integer : list) {
			sum+=integer;
		}
		wt.write("满足条件的数据的最大值是"+max+"   最小值是"+min+"   平均值是"+average+"   所有数据之和是"+sum+"\r\n");
		//关闭流
		wt.flush();
		wt.close();
		return 1;
	}
	//通过解析获得数据源并同时完成配置问价的追加
	public static int[] getData(File file) throws IOException {
		// TODO Auto-generated method stub
		//高效读取流
		Reader is=new FileReader(file);
		BufferedReader br=new BufferedReader(is);
		//文件写入流 设置为可追加   编码方式为utf-8
		OutputStream os=new FileOutputStream(file,true);
		OutputStreamWriter wt=new OutputStreamWriter(os,"UTF-8");
		//定义一个tmp字符创接受包含目标数据的字符串 
		String tmp=null;
		String string=br.readLine();
		while (string!=null) {
			if (string.contains("#")) {
				tmp=string;
				break;
			}
			string=br.readLine();
		}
		//对字符串数据进行处理获得数据
		int index=tmp.lastIndexOf(":");
		String data=tmp.substring(index+1);
		String[] str=data.split("#");
		int m=Integer.parseInt(str[0]);
		//去处手尾的空格和符号
		String string2=str[1].trim();
		int n=Integer.parseInt(string2);
		//用数组接受下数据
		int[] arr={m,n};
		//追加文件说明
		wt.write("当前行中，有需要的参数，参数为:"+m+"   "+n+"\r\n");
		wt.write("不再读取当前文件，读取配置文件的方法退出!\r\n");
		wt.flush();
		wt.close();
		return arr;
	}
	//向配置文件录入数据并同时完成部分文件的配置
	public static void config(File file) throws IOException {
		// TODO Auto-generated method stub
		//文件写入流 设置为可追加   编码方式为utf-8
		OutputStream os=new FileOutputStream(file,true);
		OutputStreamWriter wt=new OutputStreamWriter(os,"UTF-8");
		//键盘输入数据
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		//向文件追加数据
		wt.write("读取当前行的内容是:这是一个java上机题的文档文件:\r\n");
		wt.write("读取当前行的内容是:在"+m+"范围内有多少数整除与"+n+"求出满足条件的所有数据的和,并同时求出最大值与最小值和它们的平均值？\r\n");
		wt.write("读取当前行的内容是:需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		wt.write("读取当前行的内容是:"+m+"#"+n+"\r\n");
		//刷新关闭流
		wt.flush();
		wt.close();
	}

}
