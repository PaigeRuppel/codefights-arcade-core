package exercise2;

public class NumberMaximizer {

	public int largestNumber(int i) {
		StringBuilder sb = new StringBuilder();
		for (int count = 1; count <= i; count++) {
			sb.append("9");
		}
		return Integer.parseInt(sb.toString());
	}
}
