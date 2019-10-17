import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int day, month;
		String sign = "not found!!!";

		System.out.println("Enter your day of birth ");
		System.out.print("Day - ");
		day = kb.nextInt();
		System.out.print("Month - ");
		month = kb.nextInt();

		System.out.println("Your date of birth: " + day + "/" + month);

		switch (month) {
		case 1:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Capricorn" : "Aquarius";
			}
			break;
		case 2:
			if (day > 0 && day < 28) {
				sign = (day < 21) ? "Aquarius" : "Pisces";
			}
			break;
		case 3:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Pisces" : "Aries";
			}
			break;
		case 4:
			if (day > 0 && day < 31) {
				sign = (day < 21) ? "Aries" : "Taurus";
			}
			break;
		case 5:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Taurus" : "Gemini";
			}
			break;
		case 6:
			if (day > 0 && day < 31) {
				sign = (day < 21) ? "Gemini" : "Cancer";
			}
			break;
		case 7:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Cancer" : "Leo";
			}
			break;
		case 8:
			if (day > 0 && day < 31) {
				sign = (day < 21) ? "Leo" : "Virgo";
			}
			break;
		case 9:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Virgo" : "Libra";
			}
			break;
		case 10:
			if (day > 0 && day < 31) {
				sign = (day < 21) ? "Libra" : "Scorpio";
			}
			break;
		case 11:
			if (day > 0 && day < 32) {
				sign = (day < 21) ? "Scoprio" : "Sagittarius";
			}
			break;
		case 12:
			if (day > 0 && day < 31) {
				sign = (day < 21) ? "Sagittarius" : "Capricorn";
			}
			break;
		default:
			System.out.println("Wrong month!!!");

		}

		System.out.println("Your sign is - " + sign);

	}

}
