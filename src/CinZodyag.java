import java.util.Scanner;

public class CinZodyag {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Lutfen Dogdugunuz Yili Giriniz: ");
		int year = scanner.nextInt();
		int kalan = year % 12;
		
		if (kalan == 0) {
			System.out.println("Cin Zodyagi Burcunuz: Maymun");
		}else if (kalan == 1) {
			System.out.println("Cin Zodyagi Burcunuz: Horoz");
		}else if (kalan == 2) {
			System.out.println("Cin Zodyagi Burcunuz: Kopek");
		}else if (kalan == 3) {
			System.out.println("Cin Zodyagi Burcunuz: Domuz");
		}else if (kalan == 4) {
			System.out.println("Cin Zodyagi Burcunuz: Fare");
		}else if (kalan == 5) {
			System.out.println("Cin Zodyagi Burcunuz: Okuz");
		}else if (kalan == 6) {
			System.out.println("Cin Zodyagi Burcunuz: Kaplan");
		}else if (kalan == 7) {
			System.out.println("Cin Zodyagi Burcunuz: Tavsan");
		}else if (kalan == 8) {
			System.out.println("Cin Zodyagi Burcunuz: Ejderha");
		}else if (kalan == 9) {
			System.out.println("Cin Zodyagi Burcunuz: Yilan");
		}else if (kalan == 10) {
			System.out.println("Cin Zodyagi Burcunuz: At");
		}else if (kalan == 11) {
			System.out.println("Cin Zodyagi Burcunuz: Koyun");
		}
		scanner.close();
	}
}
