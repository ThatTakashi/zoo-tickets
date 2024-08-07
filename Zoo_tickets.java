
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
