package com.Javamodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelConsonant {
	public static void main(String[] args) throws IOException {
		char n;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character");
		n = (char) bf.read();
		switch(n)
		{
		case 'a':
			System.out.println("The given character "+n+" is vowel");
			break;
		case 'e':
		System.out.println("The given character "+n+" is vowel");
		break;
		case 'i':
		System.out.println("The given character "+n+" is vowel");
		break;
		case 'o':
		System.out.println("The given character"+n+" is vowel");
		break;
		case 'u':
		System.out.println("The given character "+n+" is vowel");
		break;
	    default:
		System.out.println("The given character "+n+" is consonant");
		
		break;
		}
		bf.close();
	}

}
