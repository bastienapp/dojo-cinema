import java.util.*;

class Cinema {

	public static String[] seats(int row, int column) {
		String[] result = new String[row * column];

		int k = 0;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= column; j++) {
				String num = i + "-" + j;
				result[k] = num;
				k++;
			}
		}
		return result;
	}
}
