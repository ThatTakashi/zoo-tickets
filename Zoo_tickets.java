
public class Zoo_tickets {
		// Usage example to get the discount as a percentage:
		// int percentage = 100 - (int)(getDiscount(month) * 100);
		// This might be stupid.
		public static float getDiscount(String month) {
			
			float discount = 1.0f;
			
			switch (month) {
			case "February": discount = 0.85f; break;
			
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				discount = 0.9f; break;
			
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
			
			float total = 0.0f;
			
			if (childTickets > 0) {
				total += (childTickets * 18) * getDiscount(month);
			}
			if (adultTickets > 0) {
				total += (adultTickets * 25) * getDiscount(month);
			}
			
			return total;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
	}

}
