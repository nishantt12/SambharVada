package nishant.com.sambharvada;

import org.ocpsoft.prettytime.PrettyTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by nishant on 24/8/16.
 */
public class DateTimeUtil {

    public static String getTimeDiff(String time) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(Config.TIME_FORMAT);
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = dateFormat.parse(time);

//            Date dateCurrent = new Date();

            PrettyTime prettyTime = new PrettyTime();

            return prettyTime.format(date);

//            return printDifference(dateCurrent, date);


        } catch (Exception e) {

            return null;
        }

    }


    public static String getTime(String time) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(Config.TIME_FORMAT);
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = dateFormat.parse(time);

            String timeString = date.getDay() + "/" + date.getMonth();

            return timeString;


        } catch (Exception e) {

            return null;
        }

    }


    public static String getExactTimeAndDate(String time) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(Config.TIME_FORMAT);
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = dateFormat.parse(time);

//            PrettyTime prettyTime = new PrettyTime();

//            L.e(prettyTime + "   " + time);

            System.out.println(date);
            String your_format = new SimpleDateFormat(Config.DISPLAY_FORMAT).format(date);


//            return prettyTime.format(date) + "\n" + time;

            return your_format;

        } catch (Exception e) {

            return null;
        }

    }


    public static String getTimeFormat2(String time, String format) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(Config.TIME_FORMAT);
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = dateFormat.parse(time);

            System.out.println(date);
            String your_format = new SimpleDateFormat(format).format(date);

            return your_format;

        } catch (Exception e) {

            return null;
        }

    }


    public static String printDifference(Date startDate, Date endDate) {

        //milliseconds
        long different = endDate.getTime() - startDate.getTime();


        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;

        long ten_extra_min = 10 * minutesInMilli;

        if (ten_extra_min < different) {
            different = different - ten_extra_min;
        }

        long elapsedDays = different / daysInMilli;
        different = different % daysInMilli;

        long elapsedMinutes = different / minutesInMilli;

        long elapsedHours = different / hoursInMilli;
        different = different % hoursInMilli;


        if (elapsedDays < 1) {

            return "Today";

        } else if (elapsedDays == 1) {
            return "Yesterday";
        } else {
            return elapsedDays + " days later";
        }


    }


}
