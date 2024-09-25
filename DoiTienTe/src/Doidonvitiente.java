import java.util.Scanner;
	public class Doidonvitiente {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        @SuppressWarnings("unused")
			double usdToVnd = 24000, eurToVnd = 26000, jpyToVnd = 160.55, usdToEur = 0.92, usdToJpy = 143.70, eurToJpy = 159.98 ;
	        System.out.print("Nhập số tiền: ");
	        double amount = scanner.nextDouble();
	        System.out.print("Từ (USD, EUR ,JPY , VND): ");
	        String from = scanner.next().toUpperCase();
	        System.out.print("Đổi sang (USD, EUR, JPY, VND): ");
	        String to = scanner.next().toUpperCase();
	        double result = (from.equals("USD") && to.equals("VND")) ? amount * usdToVnd :
	                        (from.equals("USD") && to.equals("EUR")) ? amount * usdToEur :
	                        (from.equals("USD") && to.equals("JPY")) ? amount * usdToJpy :
	    	                (from.equals("JPY") && to.equals("USD")) ? amount / usdToJpy :
	                        (from.equals("EUR") && to.equals("VND")) ? amount * eurToVnd :
	                        (from.equals("EUR") && to.equals("USD")) ? amount / usdToEur :
	                        (from.equals("EUR") && to.equals("JPY")) ? amount * eurToJpy :
	    	                (from.equals("JPY") && to.equals("EUR")) ? amount / eurToJpy :
	    	                (from.equals("VND") && to.equals("JPY")) ? amount * jpyToVnd :
	    	                (from.equals("JPY") && to.equals("VND")) ? amount / jpyToVnd :      
	    	                (from.equals("VND") && to.equals("USD")) ? amount / usdToVnd :
	                        (from.equals("VND") && to.equals("EUR")) ? amount / eurToVnd : amount;       
	        System.out.println("Số tiền sau khi đổi: " + result + " " + to);
	        scanner.close();
	    }
}
