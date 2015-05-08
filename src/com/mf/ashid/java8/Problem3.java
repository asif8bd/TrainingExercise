package com.mf.ashid.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Problem3 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"D:/ASIF/ncema1_ddy.csv"))) {
			
			br.lines()
					.filter(line -> line.startsWith("key"))
					.map(line -> line.split(",")[3])
					.collect(Collectors.groupingBy(s->s.substring(0, 2)))
					.forEach((k, v) -> System.out.println(k + "=" + v));
			
			

			// Map<Object, List<String[]>> col = br.lines()
			// .filter(l -> l.startsWith("key")).map(l -> l.split(","))
			// .collect(Collectors.groupingBy(a -> a[1]));
			//
			// col.forEach((k, v) -> System.out.println(k + " = "
			// + v.stream().map(a -> a[3]).collect(Collectors.toList())));

		}

	}
}
