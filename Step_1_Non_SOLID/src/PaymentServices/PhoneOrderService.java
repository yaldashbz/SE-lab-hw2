package PaymentServices;

public class PhoneOrderService implements OrderService {

    @Override
    public void onSiteOrderRegister(String customerName) {

    }

    @Override
    public void onlineOrderRegister(String customerName) {

    }

    @Override
    public void PhoneOrderRegister(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {

    }

    @Override
    public void onlineOrderPayment(int foodPrice) {

    }

    @Override
    public void PhoneOrderPayment(int foodPrice) {
        System.out.println("phone order Payment with Price : " + foodPrice + " Tomans!");
    }
}