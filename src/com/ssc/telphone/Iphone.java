package com.ssc.telphone;

import java.util.Scanner;

public class Iphone {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("请输入电话号码:");
		String s = scanner.nextLine();
		if (s.length() == 11) {
			if (s.startsWith("1")) {
				if (s.charAt(1) == '3' || s.charAt(1) == '5' || s.charAt(1) == '7' || s.charAt(1) == '8'
						|| s.charAt(1) == '9') {
					int i = 2;
					for (; i < s.length(); i++) {
						if (s.charAt(i) < '0' || s.charAt(i) > '9') {
							System.out.println("必须全为数字");
							break;
						}
					}
					if (i == 11) {
						System.out.println("输入正确，正在跳转");
					}
				} else {
					System.out.println("第二位必须为3,5,7,8,9");
				}
			} else {
				System.out.println("首位必须为1");
			}
		} else {
			System.out.println("电话号码必须是十一位");
		}
	}
}
