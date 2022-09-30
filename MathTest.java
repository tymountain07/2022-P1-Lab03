public class MathTest {
    public static void main (String args[]) {

        int startingSeconds = 10000;
        int hours = startingSeconds/3600;
        int remainder = startingSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;

        System.out.println("");
        System.out.println("Starting Seconds:\t" + startingSeconds);
        System.out.println("Hours:\t\t\t\t" + hours);
        System.out.println("Minutes:\t\t\t" + minutes);
        System.out.println("Seconds:\t\t\t" + seconds);



    }
}
