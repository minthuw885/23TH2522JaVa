import java.util.Scanner;
	public class Bai3_Tinhtiendien {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Nhập số điện sử dụng: ");
				int soDien = scanner.nextInt();
				int tien;
				if (soDien <= 50) {
				    tien = soDien * 1000;
				} else {
				    tien = 50 * 1000 + (soDien - 50) * 1200;
				}
				System.out.println("Tiền điện phải trả: " + tien + " VND");
			}
	    
	   }
}
