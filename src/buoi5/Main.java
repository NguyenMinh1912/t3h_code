package buoi5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		bai6();
	}
	
	private static void bai6() {
		String a = input();
		
		Character[] charArray = new Character[a.length()];
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			Character currentChar = a.charAt(i);
			if (i % 2 == 0) {
				builder.append(currentChar.toString().toUpperCase()); 
				charArray[i] = Character.toUpperCase(currentChar);
			} else {
				builder.append(currentChar.toString().toLowerCase()); 
				charArray[i] = Character.toLowerCase(currentChar);
			}
		}
		System.out.println(builder.toString());
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
	}
	
	
	
	private static void bai5() {
		String a = input();
		Character firstChar = a.charAt(0);
		String result = a.replaceFirst(firstChar.toString(), firstChar.toString().toUpperCase());
		System.out.println(result);
	}
	
	private static void bai4_2() {
		// 3. Viết chương trình nhập từ bàn phím một chuỗi,
		// in ra chuỗi mà tất cả các ký tự trong chuỗi thành chữ thường.
		
		String a = input();
		
		String uppertChar = input();
		
		String result = a.replaceAll(uppertChar, uppertChar.toUpperCase());
		System.out.println(result);
		
		
		// Nguyễn Minh
		
	}
	
	private static void bai4() {
		// 3. Viết chương trình nhập từ bàn phím một chuỗi,
		// in ra chuỗi mà tất cả các ký tự trong chuỗi thành chữ thường.
		
		String a = input();
		
		String uppertChar = input();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < a.length(); i++) {
			Character currentChar = a.charAt(i);
			if (currentChar.toString().equals(uppertChar)) {
				builder.append(currentChar.toString().toUpperCase());
				continue;
			}
			builder.append(currentChar);
		}
		
		System.out.println(builder.toString());
		
		
		// Nguyễn Minh
		
	}
	
	private static void bai3() {
		// 3. Viết chương trình nhập từ bàn phím một chuỗi,
		// in ra chuỗi mà tất cả các ký tự trong chuỗi thành chữ thường.
		String a = input();
		String b = a.toLowerCase();
		System.out.println(b);
	}
	
	private static void bai1() {
		String a = input();
		
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	private static void bai2() {
		String a = input();
		String b = a.replaceAll(" ", "");
		System.out.println(b);
	}
	
	
	
	private static String input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập chuỗi");
		String a = scanner.nextLine();
		return a;
	}
	
}
