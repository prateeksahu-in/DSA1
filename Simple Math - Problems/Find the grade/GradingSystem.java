import java.util.*;

import javax.lang.model.util.ElementScanner6;

class GradingSystem {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float marks = sc.nextFloat();
        String result = gradingSystem(marks);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String gradingSystem(float marks) {

            if(marks<0f)
            return "Invalid";
            if(marks<25f)
            return "F";
            if(marks<45f)
            return "E";
            if (marks<50f)
            return "D";
            if (marks<60f)
            return "C";
            if (marks<80f)
            return "B";
            if (marks<=100f)
            return "A";
            else
            {
                return "Invalid";
            }
    }
}
