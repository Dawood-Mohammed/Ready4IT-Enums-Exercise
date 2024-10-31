enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
public class Main {
    public static void main(String[] args) {
        for(Month month: Month.values()){
            System.out.println(month.name() + (month.name().endsWith("Y") ? " ends with y" : " doesn't end with y"));
        }
    }
}