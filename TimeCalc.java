public class TimeCalc {
    public static void main(String[] args) {
        
        //recieves the first input as a time in the 24 hour clock
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        //second input arg[1] is the number of minutes to add on to that time
        int addMinutes = Integer.parseInt(args[1]);

        //calculate the new hours and minutes
        int totalMinutes = (hours * 60) + minutes + addMinutes;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        //display the new number of hours and minutes as the new time

        boolean minute = newMinutes < 10;
        boolean hour = newHours < 10;

        if (hour) {
            if (minute)
            {
                System.out.println("0" + newHours + ":" + "0" + newMinutes);
            } else {
                System.out.println("0" + newHours + ":" + newMinutes);
            } } else if (minute) {
                System.out.println(newHours + ":" + "0" + newMinutes);
 
            } else {
                System.out.println(newHours + ":" + newMinutes);
            }

        }

    }
