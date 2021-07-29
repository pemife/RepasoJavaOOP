package repaso;

public enum DaysOfWeek {
	
    MONDAY(1,"Lunes"),
    TUESDAY(2,"Martes"),
    WEDNESDAY(3,"Miercoles"),
    THRUSDAY(4,"Jueves"),
    FRIDAY(5,"Viernes"),
    SATURDAY(6,"Sabado"),
    SUNDAY(7,"Domingo");

    private int numDay;
    private String spanishDay;

    DaysOfWeek(int numDay, String spanishDay) {
        this.numDay = numDay;
        this.spanishDay = spanishDay;
    }

    public int getNumDay() {
        return numDay;
    }

    public String getSpanishDay() {
        return spanishDay;
    }
}
