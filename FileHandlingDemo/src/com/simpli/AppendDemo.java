package com.simpli;

import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) throws IOException {
		// 
		
		String fileName ="C:\\Users\\JOTHIKA\\jothi\\file1.txt" ;
		
		FileWriter fw = new FileWriter(fileName, true);
		
		fw.append(System.lineSeparator() + " QWERTY");
		
		fw.close();

	}

}
