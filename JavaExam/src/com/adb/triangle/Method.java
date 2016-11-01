package com.adb.triangle;

public class Method {
	public void method1(String str1, String str2) throws Exception {
		int m = Integer.parseInt(str1);
		int n = Integer.parseInt(str2);

		if (m <= 0 || n <= 0) {
			System.out.println("出现数据异常");
			throw new Exception();
		}
		// 获得数据行m，列
		int d = m / 2;
		int c = n / 2;
		for (int i = 0; i < d + 1; i++) { 
			for (int j = 0; j < n; j++) {
				// 在j列中大于c+i的列输出空格
				if (j > c + i || j < c - i) {
					System.out.print(" ");
					// 在i行小于d+1时输出星号
				} else {
					System.out.print("*");
				}
			}                                                                                                                                                                    
			System.out.println();
		}
	}

	public void method2(String str1, String str2) throws Exception {
		int m = Integer.parseInt(str1);
		int n = Integer.parseInt(str2);

		if (m <= 0 || n <= 0) {
			System.out.println("出现数据异常");
			throw new Exception();
		}
		// 获得数据行m，列
		int d = m / 2;
		int c = n / 2;
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < n; j++) {
				// 在j列中等于c+i或者c-的列输出星号
				if (j == c + i || j == c - i) {
					System.out.print("*");
					// 在i行小于d+1时输出星号
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 在d加一列时输出全部星星
		for (int p = 0; p < n; p++) {
			System.out.print("*");
		}
	}

	public void method3(String str1, String str2) throws Exception {
		int m = Integer.parseInt(str1);
		int n = Integer.parseInt(str2);

		if (m <= 0 || n <= 0) {
			System.out.println("出现数据异常");
			throw new Exception();
		}
		// 获得数据行m，列
		int d = m / 2;
		int c = n / 2;
		for (int i = 0; i < d + 1; i++) {
			for (int j = n; j > 0; j--) {
				// 打印第一行全部的星号
				if (j == j - i) {
					System.out.print("*");
					// 在第二行i=1,第二列j就是8 后面j=2，i=1;所以 第二行左右两颗心
				} else if (n == j + i || j == i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void method4(String str1, String str2) throws Exception {
		int m = Integer.parseInt(str1);
		int n = Integer.parseInt(str2);
		/*
				
				*/
		if (m <= 0 || n <= 0) {
			System.out.println("出现数据异常");
			throw new Exception();
		}
		// 获得数据行m，列
		int d = m / 2;
		int c = n / 2;
		for (int i = 0; i < d + 1; i++) {
			for (int j = n; j > 0; j--) {
				// 打印第一行全部的星号
				if (j == j - i) {
					System.out.print("*");
					// 在第二行i=1,第二列j就是8 后面j=2，i=1;所以 第二行左右两颗心
				} else if (n < j + i || j < i + 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
