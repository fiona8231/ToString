/**
 * Created by xuyue on 14/02/17.
 */
public class Date {
    private int month;
    private  int day;
    private  int year;

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s", this ); //this is refercecen for every object we built
    }
  // toString() is built in Java
    public String toString(){
        return String.format("%d/%d/%d", month,day,year);
    }
}
