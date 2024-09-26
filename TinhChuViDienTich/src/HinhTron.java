import java.util.Scanner;
	public class HinhTron {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập bán kính hình tròn: ");
	        double banKinh = scanner.nextDouble();
	        double chuViTron = 2 * Math.PI * banKinh;
	        double dienTichTron = Math.PI * banKinh * banKinh;
	        System.out.println("Chu vi hình tròn: " + Math.round(chuViTron * 100.0) / 100.0);
	        System.out.println("Diện tích hình tròn: " + Math.round(dienTichTron * 100.0) / 100.0);
	        scanner.close();
	    }
}
