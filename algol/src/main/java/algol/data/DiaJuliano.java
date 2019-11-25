package algol.data;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DiaJuliano {

   public static Date JD2Date(double jd) {
      Calendar cal = Calendar.getInstance();
      cal.setTimeInMillis(Math.round((jd-2440587.5)*86400.0*1000.0));
      return cal.getTime();
   }

   public static double Date2JD(String date) {
      // Formato: DD/MM/YYYY HH:MM
      String[] partes = date.split(" ");
      String[] fecha = partes[0].split("/");
      String[] hora = partes[1].split(":");
      Calendar cal = Calendar.getInstance();
      cal.set(Integer.parseInt(fecha[2]),
              Integer.parseInt(fecha[1])- 1,
              Integer.parseInt(fecha[0]),
              Integer.parseInt(hora[0]),
              Integer.parseInt(hora[1]),
              0);
      return Date2JD(cal.getTime());
   }

   public static double Date2JD(Date date) {
      Calendar cal = Calendar.getInstance();
      cal.set(2019, Calendar.JANUARY, 1, 22, 15, 0);
      double julianDay = Math.round((date.getTime()/(1000.0*86400.0) + 2440587.5)*10000);
      return julianDay/10000.0;
   }
   
   public static String JD2Day(double jd) {
      SimpleDateFormat formatter = new SimpleDateFormat("d/M/YYYY");
      Calendar cal = Calendar.getInstance();
      cal.setTimeInMillis(Math.round((jd-2440587.5)*86400.0*1000.0));
      return formatter.format(cal.getTime());
   }

   public static String JD2Hour(double jd) {
      SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
      Calendar cal = Calendar.getInstance();
      cal.setTimeInMillis(Math.round((jd-2440587.5)*86400.0*1000.0));
      return formatter.format(cal.getTime());
   }

}
