package Lesson1.enums;

public class enumMain {
    public static void main(String[] args) {
        System.out.println("Осталось работать "+ getWorkingHours(DayOfWeek.Sunday)+" часов");
    }

    public static int getWorkingHours(DayOfWeek dayOfWeek){
        int result = 0;
        if ( dayOfWeek.getWorkingHours() == 0) {
            System.out.println("Сегодня выходной день!");
        }
        else {
            for (DayOfWeek d : DayOfWeek.values()) {
                if (d.getNumberOfDay() >= dayOfWeek.getNumberOfDay()) {
                    result = result + d.getWorkingHours();
                }

            }
        }
        return result;
    }
}
