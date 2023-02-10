public enum Weekday {
    MONDAY, TUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public boolean isWeekDay() {
        return this != SATURDAY
                && this != SUNDAY;
    }

    public boolean isHoliday() {
        return !isWeekDay();
    }
    }