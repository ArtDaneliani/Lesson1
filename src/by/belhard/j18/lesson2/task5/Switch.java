package by.belhard.j18.lesson2.task5;

public class Switch {
    public static void main(String[] args) {

        String day = "Monday";
        String result;

        switch (day) {
            case "Monday"
                :
                result = "Too long";
                break;
            case "Tuesday"
                :
                result = "A bit closer";
                break;
            case "Wednesday"
                :
                result = "A lot of work";
                break;
            case "Thursday"
                :
                result = "Relax";
                break;
            case "Friday"
                :
                result = "Nothing do";
                break;
            case "Saturday"
                :
                result = "Too long";
                break;
            case "Sunday"
                :
                result = "Too long";
                break;
        }
            System.out.println(result);
        }
    }
}
