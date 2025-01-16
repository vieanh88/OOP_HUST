package baitapNgayThang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //khai báo biến tháng, năm, số ngày
        int month;
        int year;
        int day = 0;

        Scanner input = new Scanner(System.in);
        
        //yêu cầu người dùng nhập tháng và năm
        System.out.println ("Month: ");
        month = input.nextInt();

        System.out.println ("Year: ");
        year = input.nextInt();

        //tạo đối tượng lớp leapYear
        leapYear year1 = new leapYear();

        //lệnh switch-case
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
            day = 31;
            break;

            case 4, 6, 9, 11:
            day = 30;
            break;

            case 2:
            if (year1.checkLeapYear(year)) {
                day = 29;
            }
            else {
                day = 28;
            }
            break;
        }

        System.out.println ("Number of days in " + month + "-" + year + " is " + day + " days");

        input.close();

    }
}
