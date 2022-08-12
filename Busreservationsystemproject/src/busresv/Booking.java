package busresv;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	int booked=0;
//	private DateFormat dateFormat;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName= scanner.next();
		System.out.println("Enter bus no:");
		busNo =scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter date dd/mm/yyyy");
		String dateInput = scanner.nextLine();
	//	SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
	
		 //Date date = DateFormat.getDateInstance().parse(dateInput);
		//try {
		//date = dateFormat.parse(dateInput);
			//	}catch(ParseException e) {
				//	e.printStackTrace();
			//	}
		
	}
		
	 public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses) {
		int capacity =0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}
for(Booking b:bookings) {
	if(b.busNo== busNo && b.date.equals(date)) {
		booked++;
	}
}
return booked<capacity?true:false;
}
}



