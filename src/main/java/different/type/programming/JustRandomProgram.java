package different.type.programming;

import java.time.LocalDate;

public class JustRandomProgram {
    public static void main(String[] args) {
        int absBusinessDays=4;
        int shiftedWorkday=6;
        int i = absBusinessDays + (absBusinessDays + shiftedWorkday - 1) / 5 * 2;
        System.out.println("value of i="+i);
        LocalDate date= LocalDate.parse("2023-02-27");
        System.out.println("Date:"+date.plusDays(2));
        //System.out.println(" Get All Days="+getAllDays(5,10));
    }
    public static long getAllDays(int dayOfWeek, long businessDays) {
        long result = 0;
        if (businessDays != 0) {
            boolean isStartOnWorkday = dayOfWeek < 6;
            long absBusinessDays = Math.abs(businessDays);

            if (isStartOnWorkday) {
                // if negative businessDays: count backwards by shifting weekday
                int shiftedWorkday = businessDays > 0 ? dayOfWeek : 6 - dayOfWeek;
                result = absBusinessDays + (absBusinessDays + shiftedWorkday - 1) / 5 * 2;
            } else { // start on weekend
                // if negative businessDays: count backwards by shifting weekday
                int shiftedWeekend = businessDays > 0 ? dayOfWeek : 13 - dayOfWeek;
                result = absBusinessDays + (absBusinessDays - 1) / 5 * 2 + (7 - shiftedWeekend);
            }
        }
        return result;
    }
}
