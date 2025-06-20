package opgave02.models;

import opgave02.models.products.Beer;

public class betalingStudent implements BetallingsStrategi {
    @Override
    public double betaling(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }
}
