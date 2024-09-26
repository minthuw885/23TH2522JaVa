import java.util.Scanner;
	public class HinhChuNhat {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();
	        double chuViHCN = 2 * (chieuDai + chieuRong);
	        double dienTichHCN = chieuDai * chieuRong;
	        System.out.println("Chu vi hình chữ nhật: " + Math.round(chuViHCN * 100.0) / 100.0);
	        System.out.println("Diện tích hình chữ nhật: " + Math.round(dienTichHCN * 100.0) / 100.0);
	        scanner.close();
	    }
}
