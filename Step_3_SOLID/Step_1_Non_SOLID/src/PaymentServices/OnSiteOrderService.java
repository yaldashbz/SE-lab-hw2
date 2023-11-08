package PaymentServices;

public class OnSiteOrderService implements OrderService {
    @Override
    public void register(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void payment(int foodPrice) {
        System.out.println("on-Site Payment with Price : " + foodPrice + " Tomans!");
    }


}
