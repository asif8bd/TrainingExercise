package com.mf.ashid.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {
	public static void main(String[] args) throws IOException {
		try (Stream<String> stream = Files
				.lines(Paths.get("D:/ASIF/ncema1_ddy.csv"))) {
			Map<String, List<String>> results = stream
					.filter(line -> line.startsWith("key"))
					.map(line -> new String[] { line.split(",")[1],
							line.split(",")[3] })
					.collect(
							Collectors.groupingBy(
									n -> n[0],
									Collectors.mapping(n -> n[1],
											Collectors.toList())));
			// Print File names with related key names
			results.forEach((k, v) -> System.out.println(k + "=" + v));

		}

	}
}
