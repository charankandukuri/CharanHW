public class SwitchExmple {
    public static void main(String[] args) {
        int marks = 6;

        switch (marks){
            case 0:
                System.out.println ("fail");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println ("Needs Work");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println ("Average");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println ("Good");
                break;
                default:
                    System.out.println ("excellent");
                    break;
        }
    }
}
