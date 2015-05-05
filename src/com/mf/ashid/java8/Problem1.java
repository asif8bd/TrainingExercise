package com.mf.ashid.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Problem1 {
	public static void main(String[] args) throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get("D:/ASIF/ncema1_ddy.csv"))) {
			long n=stream
	        .filter(line -> line.startsWith("file") && line.split(",")[1].startsWith("C"))
	        .map(line -> line.split(",")[1])
	        .count();
			System.out.println(n);
		}
	}
}
