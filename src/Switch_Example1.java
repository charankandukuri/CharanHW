public class Switch_Example1 {
    public static void main(String[] args) {
        String birthmonth = "may";

        switch (birthmonth){
            case "january ":
            case "feb":
            case "march":
                System.out.println ("Born in Spring Season");
                break;
            case "april":
            case "may":
            case "june":
                System.out.println ("Born in Summer Season");
                break;
            case "july":
            case "august":
            case "September":
                System.out.println ("Born in mansoon Season");
                break;
            case "october":
            case "november":
            default:
                System.out.println ("Born in Winter Season");
                break;




        }
    }
}
