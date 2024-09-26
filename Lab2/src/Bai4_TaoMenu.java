import java.util.Scanner;
	public class Bai4_TaoMenu {

	    // Giải phương trình bậc nhất
	    public static void giaiPTBacNhat() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập a: ");
	        double a = sc.nextDouble();
	        System.out.print("Nhập b: ");
	        double b = sc.nextDouble();
	        if (a != 0) {
	            System.out.println("Nghiệm: x = " + (-b / a));
	        } else {
	            System.out.println(b == 0 ? "Vô số nghiệm" : "Vô nghiệm");
	        }
	    }
	    // Giải phương trình bậc hai
	    public static void giaiPTBacHai() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập hệ số a: ");
	        double a = sc.nextDouble();
	        System.out.print("Nhập hệ số b: ");	
	        double b = sc.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = sc.nextDouble();
	        double delta = b * b - 4 * a * c;
	        if (a == 0) {
	            giaiPTBacNhat();
	        } else if (delta < 0) {
	            System.out.println("Vô nghiệm");
	        } else if (delta == 0) {
	            System.out.println("Nghiệm kép: x = " + (-b / (2 * a)));
	        } else {
	            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a) + ", x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
	        }
	    }
	    // Tính tiền điện
	    public static void tinhTienDien() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập số điện: ");
	        int soDien = sc.nextInt();
	        int tien = soDien <= 50 ? soDien * 1000 : 50 * 1000 + (soDien - 50) * 1200;
	        System.out.println("Số tiền: " + tien + " VND");
	    }
	    // Vòng lặp
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	        	System.out.println("__________MENU__________");
	            System.out.println("1. Giải PT bậc nhất");
	            System.out.println("2. Giải PT bậc hai");
	            System.out.println("3. Tính tiền điện");
	            System.out.println("4. Thoát");
	            System.out.print("Bạn vui lòng chọn: ");
	            choice = sc.nextInt();
                System.out.println("__________________");
	            switch (choice) {
	                case 1: giaiPTBacNhat(); break;
	                case 2: giaiPTBacHai(); break;
	                case 3: tinhTienDien(); break;
	                case 4: System.out.println("Thoát."); break;
	                default: System.out.println("Lựa chọn sai.");
	            }
	        } while (choice != 4);
	        
	    }
	}

