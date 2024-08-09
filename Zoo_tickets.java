
public class Zoo_tickets {
	// To get percentage for printReceipt:
	// int percentage = (int)(getDiscount(month) * 100);
	public static float getDiscount(String month) {
		
		float discount = 0.0f;
		
		switch (month) {
		case "February": discount = 0.15f; break;
		
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			discount = 0.10f; break;
		
		case "April":
		case "June":
		case "September":
		case "November":
			break;
		default: ;
		}
		
		return discount;
	}
	
	public static float calculatePrice(int childTickets, int adultTickets, String month) {
		// Price of the tickets without discount.
		float ticketsPrice = (childTickets * 18) + (adultTickets * 25);
		
		ticketsPrice -= ticketsPrice * getDiscount(month);
		
		return ticketsPrice;
	}
	
	// Made by Q
	// Takes in a ShowID and returns a string with the 
	// show name and times it is performed so it can be printed
	
	public static String printShowSchedule(int showId) {
		
		String showSchedule;
		
		switch (showId) {
		
		case 1: showSchedule = String.format("The %s is scheduled for %s", "Bird Show", "12:30 PM"); break;
		
		case 2: showSchedule = String.format("The %s is scheduled for %s", "Splash Safari", "2:00 PM"); break;
		
		case 3: showSchedule = String.format("The %s is scheduled for %s", "Animal Friends Show", "12:00 PM and 2:30 PM"); break;
		
		case 4: showSchedule = String.format("The %s is scheduled for %s", "Lion Feeding", "9 AM and 3 PM"); break;
		
		case 5: showSchedule = String.format("The %s is scheduled for %s", "Zoo Theatre", "9 AM, 12:30PM and 3 PM"); break;
		
		default: showSchedule = "That is not a valid show ID";
		
		
		}
		
		return showSchedule;
		
	}
	// Made by Q
	// returns true if the customer's age is less than 13 and the day is Sunday
	public static boolean isFreeIce(int age, String day) {
		
		return age < 13 && day.equals("Sunday");
		
	}
	
	// Made by Aidan
	// Displays a breakdown of all fees as well as any applicable discounts and displays the total cost of the tickets
	public static int printReceipt(int childTickets, int adultTickets, String month, float total, int discountPrice) {
		int ticketReceipt = 0;
		
		System.out.print("|*******************************************|\n" +
		"|           Item |      Quantity |    Price |\n" +
		"|*******************************************|\n");
		
		System.out.printf("|Adult           |     %d x 25NZD |" + adultTickets * 25 + "     NZD|" + "\n", adultTickets);
		
		System.out.printf("|Child           |     %d x 18NZD |" + childTickets * 18 + "     NZD|" + "\n", childTickets);
		
		switch (discountPrice) {
			case 0:
				break;
			default:
				System.out.printf("|Discount        |         " + discountPrice + "NZD |-" + discountPrice + "    NZD|" + "\n");
		}
		
		
		System.out.print("|*******************************************|\n");
		
		System.out.printf("|                    Total Price |%.2f NZD |\n", total);
		
		System.out.print("|*******************************************|\n");
		
		System.out.printf("Ticket bought in %s", month);
		
		return ticketReceipt;
	}
		

	public static void main(String[] args) {

		// Lines below are just for testing the methods
		float totalPrice = calculatePrice(3, 2, "February");
		int percentage = (int)(getDiscount("February") * 100);
		int receipt = printReceipt(3, 2, "Febuary", totalPrice, percentage);
		
	}

}
