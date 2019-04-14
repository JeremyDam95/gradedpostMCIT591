import java.util.Scanner;

public class EasterSunday {

	public static void main(String[] args) {
		//Create question for user to get year
		Scanner userInputYear = new Scanner(System.in);
		System.out.println("What year is it?");
		
		//Define Variables:
		String year1 = userInputYear.nextLine();
		int year = Integer.parseInt(year1);
		int a = year % 18;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int month = (h + l - 7 * m + 114) / 31 ;
		int day = (h + l - 7 * m + 114) % 31 + 1;
		
		//Let month be called April or March depending on value of month:
		String monthAsString = "April";
		if (month == 3) monthAsString = "March";
		
		//Print:
		System.out.println("Easter Sunday for " + year + " is on " + monthAsString + " " + day);

	}

}
