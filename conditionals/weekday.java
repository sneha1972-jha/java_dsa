import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner (System.in)){
              System.out.println("enter the number of day: ");
              int day=sc.nextInt();
              String weekday=switch(day){
                case 1->"sunday";
                case 2->"monday";
                case 3->"tuesday";
                case 4->"wednesday";
                 case 5->"thrusday";
                 case 6->"friday";
                 case 7->"saturday";
                 default->"invalid day number";
              };
              System.out.println(weekday);
        }
    }
}
