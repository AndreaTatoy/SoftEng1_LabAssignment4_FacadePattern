package LabAssignment4;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValetService("TAT013");
        frontDesk.requestHouseKeepingService(023);
        frontDesk.requestCartService(2);
    }
}
