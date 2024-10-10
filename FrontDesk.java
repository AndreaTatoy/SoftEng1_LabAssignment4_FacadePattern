package LabAssignment4;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(){
        valet = new Valet();
        housekeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValetService(String plateNumber){
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeepingService(int roomNumber){
        housekeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts){
        cart.requestCart(numberOfCarts);
    }
}
