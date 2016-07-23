package oca_vorbereitung_arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String sa[]			 = { "index 0", "index 1", "index 2" };
		String saa[][] 		 = { { "index 0,0", "index 0,1", "index 0,2" },
						   	     { "index 1,0", "index 1,1", "index 1,2" },
						   	     { "index 2,0", "index 2,1", "index 2,2" } };
		
		String saaa[][][] 	 = { { {"index 0,0,0", "index 0,0,1", "index 0,0,2" },
								   {"index 0,1,0", "index 0,1,1", "index 0,1,2" },
								   {"index 0,2,0", "index 0,2,1", "index 0,2,2" }},
								   
								 { {"index 1,0,0", "index 1,0,1", "index 1,0,2" },
								   {"index 1,1,0", "index 1,1,1", "index 1,1,2" },
								   {"index 1,2,0", "index 1,2,1", "index 1,2,2" }},
								   
								 { {"index 2,0,0", "index 2,0,1", "index 2,0,2" },
								   {"index 2,1,0", "index 2,1,1", "index 2,1,2" },
								   {"index 2,2,0", "index 2,2,1", "index 2,2,2" }}};
		String saaa2[][][] 	 = {saa, {saa[0], {saa[0][0]},{saa[0][1]},{saa[0][2]}, {"normale inhalte"}},
									 {saa[1], {saa[1][0]},{saa[1][1]},{saa[1][2]}},
									 {saa[2], {saa[2][0]},{saa[2][1]},{saa[2][2]}}};
		// [] -> {normale inhalte}
		// [][] -> {eindimensionales array{normale inhalte}}
		// [][][] -> {zweidimensionales array{eindimensionales array{normale inhalte}}}
		
		for (int a = 0; a < 3; a++) {
			System.out.print(" "+ sa[a] + ",");
			System.out.println();
			int b = 0;
			for (; b < 3; b++) {
				System.out.print(" "+ saa[a][b]);
				System.out.println();
				int c = 0;
				for (; c < 3; c++) {
					System.out.print(" " + saaa[a][b][c]);
					System.out.println();
				}
			}
		}
		System.out.println(Arrays.deepToString(sa));
		System.out.println(Arrays.deepToString(saa));
		System.out.println(Arrays.deepToString(saaa));
		System.out.println();
		System.out.println(Arrays.deepToString(saaa2));
		
		String s = new String(new char[]{'a','b','c'});
		System.out.println(s);
	}
}
