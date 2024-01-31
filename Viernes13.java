import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Viernes13 {
	
	/*
	 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
	 * - La función recibirá el mes y el año y retornará verdadero o falso.
	 */

    public static void main(String[] args) {

        Scanner mc = new Scanner(System.in);

        int month;
        int year;
        
        System.out.print("Dime que mes quieres saber: ");
        month = mc.nextInt();
        System.out.print("Dime que año quieres saber: ");
        year = mc.nextInt();

        System.out.println(isFridayThirteenth(month,year));
    }

    private static boolean isFridayThirteenth(int month,int year) {
        try {
            return LocalDate.of(year,month,13).getDayOfWeek()==DayOfWeek.FRIDAY;
        } catch(Exception exc) {
            return false;
        }
    }

}
