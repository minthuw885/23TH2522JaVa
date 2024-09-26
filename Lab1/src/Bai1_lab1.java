import java.util.Scanner;
	public class Bai1_lab1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập họ và tên sinh viên: ");
	        String hoVaTen = scanner.nextLine();
	        System.out.print("Nhập điểm trung bình: ");
	        double diemTrungBinh = scanner.nextDouble();
	        System.out.println(hoVaTen + " " + diemTrungBinh + " điểm");
	        scanner.close();
	    }
}
