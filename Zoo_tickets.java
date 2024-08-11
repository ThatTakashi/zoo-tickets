// Zoo ticket program

// Takes multiple values such as the number of tickets as well as
// if the customer gets a discount and displays a breakdown to the customer

// Made by Q, Ike and Aidan


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
				
		return ticketsPrice - ticketsPrice * getDiscount(month);
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
	// Takes in the output from each method and displays a breakdown of all fees as well as 
	// any applicable discounts and displays the total cost of the tickets
	public static int printReceipt(int childTickets, int adultTickets, String month, float total, int discountPrice) {
		int ticketReceipt = 0;
		
		System.out.print("|*******************************************|\n" +
		"|           Item |      Quantity |    Price |\n" +
		"|*******************************************|\n");
		
		// Prints the fees for each item (Adult Tickets, Child Tickets and Discounts if applicable)
		System.out.printf("|Adult           |     %d x 25NZD |" + adultTickets * 25 + "     NZD|" + "\n", adultTickets);
		
		System.out.printf("|Child           |     %d x 18NZD |" + childTickets * 18 + "     NZD|" + "\n", childTickets);
		
		switch (discountPrice) {
			case 0:
				break;
			default:
				System.out.printf("|Discount        |         " + discountPrice + "NZD |-" + discountPrice + "    NZD|" + "\n");
		}
		
		// Print the total price for all the tickets taking any discounts into account
		System.out.print("|*******************************************|\n");
		
		System.out.printf("|                    Total Price |%.2f NZD |\n", total);
		
		System.out.print("|*******************************************|\n");
		
		System.out.printf("Ticket bought in %s", month);
		
		return ticketReceipt;
	}
		
	// Made by Aidan
	// Runs through each method in order to produce the expected output
	public static void main(String[] args) {

		// Calculates the total price for all tickets
		float totalPrice = calculatePrice(3, 2, "January");
		
		// Calculates the discount price based on the month
		int percentage = (int)(getDiscount("January") * 100);
		
		// Prints the show schedule for the Splash Safari
		System.out.println(printShowSchedule(2) + "\n");
		
		// Checks if the second child is able to get a free ice-cream
		System.out.println("Does the second child get a free ice-cream?: " + isFreeIce(12, "Sunday") + "\n");
		
		// Prints a receipt showing a breakdown of each items cost as well as the total cost
		int receipt = printReceipt(3, 2, "January", totalPrice, percentage);
		
	}

}
