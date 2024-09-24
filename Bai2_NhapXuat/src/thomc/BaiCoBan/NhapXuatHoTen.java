package thomc.BaiCoBan;

import java.util.Scanner;

public class NhapXuatHoTen {
	public static void main(String[] args) {
		System.out.println("-------NHAP XUAT-------");
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		Scanner banPhim;
		banPhim = new Scanner(System.in);
		System.out.print("Họ va tên: ");
		hoTen= banPhim.nextLine(); 
		System.out.print("Tuổi: ");
		tuoi = banPhim.nextInt();
		System.out.print("Chiều cao (m): ");
		chieuCao = banPhim.nextDouble();
		System.out.print("Cân nặng (kg): ");
		canNang = banPhim.nextDouble();		
		System.out.println("__________________");
		System.out.println("Name: " + hoTen);
		System.out.println("Age: " + tuoi);
		System.out.println("Weight: " + canNang);
		System.out.println("Height: " + chieuCao);

		
	}

}

