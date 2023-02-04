public class PremiumBuyer extends Buyer {

    public PremiumBuyer(String name, String address) {
        super(name, address);
        setShippingCost(calculateShippingCost());
    }
    @Override
    void checkOut(PaymentMethod paymentMethod) {

    }

    @Override
    double calculateShippingCost() {
        return 0;
    }


    /**This class inherits from Buyer class. It has no additional variables.
     *
     * Create corresponding constructor to super. In the constructor
     *                           set the shippingCost to the value you are getting from calculateShippingCost method
     *
     * Implement checkOut method same as RegularBuyer class
     *
     * Implement calculateShippingCost method. return 0.
     * */
}
