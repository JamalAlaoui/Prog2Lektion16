package opgave02.models;

import opgave02.models.products.Beer;

public class Customer {
    BetallingsStrategi betallingsStrategi;
    private BarTab tab;

    public Customer(BetallingsStrategi betallingsStrategi) {
        this.tab = new BarTab();
        this.betallingsStrategi = betallingsStrategi;
    }

    public void placeOrder(Order order) {
        double ajustedPrice = betallingsStrategi.betaling(order);
//        switch (billing) {
//            case Billing.NORMAL:
//                ajustedPrice = CalculateNormalPrice(order);
//                break;
//            case Billing.STUDENT:
//                ajustedPrice = CalculateStudentPrice(order);
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + billing);
//        }
        tab.addItem(new BarTabItem(order, ajustedPrice));
    }

//    private int CalculateStudentPrice(Order order) {
//        if (order.getProduct() instanceof Beer beer) {
//            return order.getTotalPrice() - order.getCount() * 5;
//        }
//        return order.getTotalPrice();
//    }
//
//    private int CalculateNormalPrice(Order order) {
//        return order.getTotalPrice();


    public BarTab getBarTab() {
        return tab;
    }

    public void setBetallingsStrategi(BetallingsStrategi betallingsStrategi) {
        this.betallingsStrategi = betallingsStrategi;
    }
}
