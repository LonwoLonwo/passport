import java.sql.SQLOutput;
import java.util.Calendar;

public class Number
{
    public static void main(String[] args) {

        int numbersOfRegion[] = {40, 84, 85, 97};

        int firstYear = 1997;
        int lastYear = Calendar.getInstance().get(Calendar.YEAR);

        int x = (lastYear - firstYear) + 1;

        int yearsNumbers[] = new int[x];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < x; j++) {
                yearsNumbers[j] = 1997 + j;
                System.out.println(numbersOfRegion[i] + " " + Integer.toString(yearsNumbers[j]).substring(2));
            }
        }
    }

}
