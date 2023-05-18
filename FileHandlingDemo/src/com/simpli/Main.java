package com.simpli;

import java.io.*;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\JOTHIKA\\jothi\\file.txt");
		// File f = new File("c:/temp/a2000.txt");

		boolean created = f.createNewFile();

		if (created)
			System.out.println("File creation success!");
		else
			System.out.println("File creation failed!");

		// Writing to File
		// Write Content Appraoch 1
//		FileWriter writer = new FileWriter(f);
//		writer.write("Test data TTTTTTTTTT");
//		writer.close();

		// Approach 2 using FileOutputStream
		String data = "Approach 2 test Data";
		FileOutputStream out = new FileOutputStream("C:\\Users\\JOTHIKA\\jothi\\file2.txt");
		out.write(data.getBytes());
		out.close();
	}}