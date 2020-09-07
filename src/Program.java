import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import mondel.entites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());	
		System.out.print("Check-out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		
		if(!checkOut.after(checkIn)) {
			System.out.print("Error in  reservation");
			
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.print("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to Update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy)");
			 checkIn = sdf.parse(sc.next());	
			System.out.print("Check-out date (dd/MM/yyyy)");
			 checkOut = sdf.parse(sc.next());
			 
			 
			 Date now = new Date ();
			 if(checkIn.before(now) || checkOut.before(now)) {
				 System.out.println("Error with dates for reservation");
			 }
			 
			 else if (!checkOut.after(checkIn)) {
				 System.out.print("Error in date reservation");
				 
			 }
			 else {
			 reservation.upDates(checkIn, checkOut);
			 System.out.print("Reservation: " + reservation);
			 }
			 
		}
		
		
		
		
		
		sc.close();
	}

}
