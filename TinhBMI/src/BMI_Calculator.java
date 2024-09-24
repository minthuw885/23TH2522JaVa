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
	        System.out.println("\nHọ tên: " + hoTen);
	        System.out.println("Tuổi: " + tuoi);
	        System.out.println("Cân nặng: " + canNang + " kg");
	        System.out.println("Chiều cao: " + chieuCao + " m");
	        System.out.println("Chỉ số BMI: " + bmi);
	        if (bmi < 18.5)
	            System.out.println("Bạn gầy, nên tăng cân.");
	        else if (bmi <= 24.9)
	            System.out.println("BMI bình thường.");
	        else if (bmi <= 29.9)
	            System.out.println("Bạn thừa cân, nên tập thể dục.");
	        else
	            System.out.println("Bạn béo phì, cần giảm cân.");
	        scanner.close();
	    }
}
