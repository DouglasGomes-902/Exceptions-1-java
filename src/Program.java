import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import mondel.entites.Reservation;
import mondel.execption.DomeinException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		System.out.println();

		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.print("Reservation: " + reservation);
		System.out.println();
		
		System.out.print("Enter data to Update the reservation: ");
		System.out.println();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());

		  reservation.upDates(checkIn, checkOut);
		System.out.print("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalide date format ");
		}
		catch(DomeinException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("unexpected error ! ");
		}
		
		
		sc.close();
	}
			
	
	}


