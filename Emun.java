enum weekday{
    MONDAY,TUESDAY,WED,THUES,FRI,STA ,SUN;
}
public class Emun {
    public static void main(String ar[]) {

        for(weekday w: weekday.values())
        System.out.println(w.compareTo(weekday.WED));
        
    }
}
