import java.util.Scanner;
	public class Bai2_lab1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();
	        double chuVi = (chieuDai + chieuRong) * 2;
	        double dienTich = chieuDai * chieuRong;
	        double canhNhoNhat = Math.min(chieuDai, chieuRong);
	        System.out.println("Chu vi hình chữ nhật: " + chuVi);
	        System.out.println("Diện tích hình chữ nhật: " + dienTich);
	        System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + canhNhoNhat);
	        scanner.close();
	    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	