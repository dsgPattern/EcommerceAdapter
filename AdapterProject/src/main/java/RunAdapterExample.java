public class RunAdapterExample {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        testPayX(xpay);
    }

    private static void testPayX(Xpay payD) {
        System.out.println(payD.getCustomerName());
        System.out.println(payD.getCreditCardNo());
        System.out.println(payD.getCardCVVNo());
        System.out.println(payD.getCardExpMonth());
        System.out.println(payD.getAmount());
    }
}
