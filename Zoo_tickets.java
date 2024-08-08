
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
		// show name and times it is performed
		
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
			
			return (age < 13 && day.equals("Sunday"))?(true):(false);
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		// Lines below are just for testing the methods
		float totalPrice = calculatePrice(3, 2, "February");
		int percentage = (int)(getDiscount("February") * 100);
		
		System.out.printf("Total: $%.2f\n", totalPrice);
		System.out.printf("%d%%\n", percentage);
	}

}
