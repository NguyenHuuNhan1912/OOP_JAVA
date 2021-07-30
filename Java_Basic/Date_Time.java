import java.time.*;
public class Date_Time{
    public static void main(String[] args){
      
        /*In ra ngày tháng năm hiện tại
        LocalDate nowdate = LocalDate.now();
        System.out.println(nowdate);
        VD Run code -> 2021-07-30*/
        
        /*In ra giờ phút giây hiện tại
        LocalTime nowtime = LocalTime.now();
        System.out.println(nowtime);
        VD Run code -> 19:36:48.4559442200 */

        /*In ra ngày và giờ hiện tại ngăn cách bởi kí tự T
        VD: 2021-07-30T19:36:48.4559442200  */
      
        LocalDateTime now_date_time = LocalDateTime.now();
        System.out.println(now_date_time);
    }
}
/*
1. Có nhiều gói khác được sử dụng để truy xuất ngày và giờ nhưng đã quá lỗi thời không nên sử dụng
   Các gói khác như: java.util.Date, java, java.util.Calendar, java.sql.Date
   
2. Gói java.time.* là gói mới nhất được hỗ trợ từ java 8, API mạnh mẽ khuyến khích nên sử dụng
*/

