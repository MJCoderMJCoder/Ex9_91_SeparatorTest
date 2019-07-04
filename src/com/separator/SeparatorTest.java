package com.separator;

import java.io.File;

public class SeparatorTest {

	public static void main(String[] args) {
		System.out.println("系统路径分隔符（String）是：" + File.pathSeparator);
		System.out.println("系统路径分隔符（char）是：" + File.pathSeparatorChar);
		System.out.println("系统路径分隔符（String）是：" + File.separator);
		System.out.println("系统路径分隔符（char）是：" + File.separatorChar);
	}

}
