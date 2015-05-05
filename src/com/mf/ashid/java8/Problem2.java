package com.mf.ashid.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2 {
	public static void main(String[] args) throws IOException {
		try (Stream<String> stream = Files.lines(Paths
				.get("D:/ASIF/ncema1_ddy.csv"))) {
			// Print 5 key names in Descending order
			List<String> keys = stream.filter(line -> line.startsWith("key"))
					.map(line -> line.split(",")[3].toLowerCase()).sorted()
					.collect(Collectors.toList());

			Collections.reverse(keys);

			keys.stream().limit(5).forEach(System.out::println);
		}

	}
}
