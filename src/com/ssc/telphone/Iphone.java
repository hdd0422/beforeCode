package com.ssc.telphone;

import java.util.Scanner;

public class Iphone {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("������绰����:");
		String s = scanner.nextLine();
		if (s.length() == 11) {
			if (s.startsWith("1")) {
				if (s.charAt(1) == '3' || s.charAt(1) == '5' || s.charAt(1) == '7' || s.charAt(1) == '8'
						|| s.charAt(1) == '9') {
					int i = 2;
					for (; i < s.length(); i++) {
						if (s.charAt(i) < '0' || s.charAt(i) > '9') {
							System.out.println("����ȫΪ����");
							break;
						}
					}
					if (i == 11) {
						System.out.println("������ȷ��������ת");
					}
				} else {
					System.out.println("�ڶ�λ����Ϊ3,5,7,8,9");
				}
			} else {
				System.out.println("��λ����Ϊ1");
			}
		} else {
			System.out.println("�绰���������ʮһλ");
		}
	}
}
