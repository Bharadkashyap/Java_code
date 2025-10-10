//Writeajavaprogramtodisplaydateindifferentformat
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pro35 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatted Date: " + sdf.format(date));
    }
}
