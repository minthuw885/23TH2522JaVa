	import java.util.Scanner;
	public class DoidonviTiente {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double usdToVnd = 24000, eurToVnd = 26000, usdToEur = 0.92;	     
	        System.out.print("Nhập số tiền: ");
	        double amount = scanner.nextDouble();
	        System.out.print("Từ (USD, EUR, VND): ");
	        String from = scanner.next().toUpperCase();
	        System.out.print("Đổi sang (USD, EUR, VND): ");
	        String to = scanner.next().toUpperCase();
	        double result = (from.equals("USD") && to.equals("VND")) ? amount * usdToVnd :
	                        (from.equals("USD") && to.equals("EUR")) ? amount * usdToEur :
	                        (from.equals("EUR") && to.equals("VND")) ? amount * eurToVnd :
	                        (from.equals("EUR") && to.equals("USD")) ? amount / usdToEur :
	                        (from.equals("VND") && to.equals("USD")) ? amount / usdToVnd :
	                        (from.equals("VND") && to.equals("EUR")) ? amount / eurToVnd : amount;
	        System.out.println("Số tiền sau khi đổi: " + result + " " + to);
	        scanner.close();
	    }
	}

}
