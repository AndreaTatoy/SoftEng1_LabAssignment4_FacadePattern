package LabAssignment4;

public class Valet implements HotelService{
    public void pickUpVehicle(String plateNumber){
        System.out.println("The valet is picking up vehicle number " + plateNumber);
    }

    @Override 
    public void performService(){
        System.out.println("In progress...");
    }
    
}
