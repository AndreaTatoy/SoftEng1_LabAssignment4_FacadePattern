package LabAssignment4;

public class HouseKeeping implements HotelService{
    public void cleanRoom(int roomNumber){
        System.out.println("Cleaning room number " + roomNumber + "... ");
    }

    @Override
    public void performService(){
        System.out.println("In progress...");
    }
}