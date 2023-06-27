package exam02;

public class Schedule {
    int year;
    int month;
    int day;

    public void setYear(int _year) {
        year = _year;
    }
    public int getYear() {
        return year;
    }

    public void setMonth(int _month) {
        year = _month;
    }
    public int getMonth() {
        return month;
    }




    /*public void setDay(int _day) {
        if (month =)
    }*/

    void showInfo() {
        System.out.println("year=" + year + ",month=" + month + ",day=" + day);
    }
}
