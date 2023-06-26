package Excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String x = Excel.readstringmethod(0, 0);
		System.out.println(x);
		String x1 = Excel.readintegermethod(1, 0);
		System.out.println(x1);

	}

}
