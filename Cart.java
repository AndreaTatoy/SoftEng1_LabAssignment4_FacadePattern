package LabAssignment4;

public class Cart implements HotelService{
    public void requestCart(int numberOfCarts){
        System.out.println("Requesting " + numberOfCarts + " carts");
    }

    @Override
    public void performService(){
        System.out.println("In progress...");
    }
}
