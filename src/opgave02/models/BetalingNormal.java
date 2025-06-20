package opgave02.models;

public class BetalingNormal implements BetallingsStrategi{
    @Override
    public double betaling(Order order) {

        return order.getTotalPrice();
    }
}
