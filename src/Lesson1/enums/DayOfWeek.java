package Lesson1.enums;

public enum DayOfWeek {
    Monday (1, 8),
    Tuesday(2, 8),
    Wednesday(3, 8),
    Thursday(4, 8),
    Friday(5, 8),
    Saturday(6, 0),
    Sunday(7,0);




    private int numberOfDay;
    private int workingHours;

    public int getNumberOfDay() {
        return numberOfDay;
    }


    public int getWorkingHours() {
        return workingHours;
    }


    DayOfWeek(int numberOfDay, int workingHours) {
        this.numberOfDay = numberOfDay;
        this.workingHours = workingHours;
    }
}
