package utility;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mike
 */
public class MCH_DateUtilities {
    private static MCH_DateUtilities instance;
    private long DAYS_IN_YEAR = 365;
    
    
    /**
     * Uses a singleton instance to keep multiple libraries from being created..
     * @return returns the MCH_DateUtilities
     */
     public static MCH_DateUtilities getInstance() {
        if (instance == null) {
            instance = new MCH_DateUtilities();
        }

        return instance;
    }
     
     /**
      * 
      * @return returns a LocalDateTime object with the current time
      */
     public LocalDateTime now(){
         return LocalDateTime.now();
     }
    
    //Two methods for converting Date/Time Objects to formatted strings
     
    /**
     * Takes a DateTime and formats it to the pattern MM/dd/yyyy hh:mm:ss a
     * @param localDateTime
     * @return returns a string formatted as MM/dd/yyyy hh:mm:ss a
     */
    public String toString(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"));
    }
    
    /**
     * Takes a DateTime and a pattern. Method then formats the DateTime to the input
     * pattern
     * @param localDateTime
     * @param pattern
     * @return returns a string that matches the pattern passed to the method.
     */
    public String toString(LocalDateTime localDateTime, String pattern){
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }
     
    //Two methods for converting Strings to Date/Time Objects
    
    /**
     * Takes a String that is in the format of MM/dd/yyyy hh:mm:ss a and returns
     * a DateTime Object
     * @param dateTime requires a String in the format of MM/dd/yyyy hh:mm:ss a 
     * to be passed in
     * @return returns a LocalDateTime object.
     */
    public LocalDateTime format(String dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        return LocalDateTime.parse(dateTime, formatter);
    }
    
    /**
     * Takes both a String with a date that matches the pattern passed in.
     * @param dateTime requires a String that be in the same format as 
     * the pattern
     * @param pattern requires the pattern that the String is in for formatting
     * @return returns a LocalDateTime object
     */
    public LocalDateTime format(String dateTime, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTime, formatter);
    }
    
    
    /**
     * Takes in two LocalDateTimes and finds the difference in the amount of days 
     * between the two dates.
     * @param localDateTimeOne First LocalDateTime object
     * @param localDateTimeTwo Second LocalDateTime object
     * @return returns the difference in days between the two LocalDateTime objects.
     */
    public long dateDiff(LocalDateTime localDateTimeOne, LocalDateTime localDateTimeTwo){
        Duration diff =  Duration.between(localDateTimeOne, localDateTimeTwo);
        return diff.toDays();
    }
     
     
//     public static void main(String[] args){
//         MCH_DateUtilities mchDateUtilties = MCH_DateUtilities.getInstance();
//         
//         System.out.println(mchDateUtilties.now());
//         System.out.println(mchDateUtilties.toString(mchDateUtilties.now(), "MM/dd/yyyy"));
//         System.out.println(mchDateUtilties.toString(mchDateUtilties.now()));
//         mchDateUtilties.format("11/15/1994 12:00:00 PM");
//         mchDateUtilties.format("2016-03-04 11:30", "yyyy-MM-dd HH:mm");
//         System.out.println(mchDateUtilties.dateDiff(mchDateUtilties.format("11/15/1994 12:00:00 PM"), mchDateUtilties.format("11/15/1995 12:00:00 PM")));
//         mchDateUtilties.dateDiff(mchDateUtilties.format("11/15/1994 12:00:00 PM"), mchDateUtilties.format("11/15/1994 12:00:00 PM"));
//     }
}
