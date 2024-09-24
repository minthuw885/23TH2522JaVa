	import java.util.Scanner;
	public class BMI_Calculator {
	    public static void main(String[] args) {
	    	System.out.println("_____NHAP DU LIEU_____");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập họ tên: ");
	        String hoTen = scanner.nextLine();
	        System.out.print("Nhập tuổi: ");
	        int tuoi = scanner.nextInt();
	        System.out.print("Nhập cân nặng (kg): ");
	        float canNang = scanner.nextFloat();
	        System.out.print("Nhập chiều cao (m): ");
	        float chieuCao = scanner.nextFloat();
	        System.out.println("_____XUAT DU LIEU_____");
	        float bmi = canNang / (chieuCao * chieuCao);
	        System.out.printf("\n%s, Tuổi: %d\nBMI: %.2f\n", hoTen, tuoi, bmi);        
	        scanner.close();
	    }
}
