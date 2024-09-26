	import java.util.Scanner;
	public class Donvido {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập Km hay Byte: ");
	        String from = scanner.next().toUpperCase();
	        System.out.print("Nhập số km: ");
	        double km = scanner.nextDouble();
	        double meters = km * 1000; 
	        System.out.println(km + " km = " + meters + " m");
	        System.out.print("Nhập số byte: ");
	        double bytes = scanner.nextDouble();
	        double bits = bytes * 8; 
	        System.out.println(bytes + " byte = " + bits + " bit");
	        scanner.close();
	    }
}

