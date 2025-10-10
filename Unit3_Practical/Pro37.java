//Writeajavaprogramtoadd,subtractadays/monthintocurrentdateand
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Pro37 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after 10 days: " + sdf.format(cal.getTime()));

        cal.add(Calendar.MONTH, -2);
        System.out.println("Date 2 months ago: " + sdf.format(cal.getTime()));
    }
}
