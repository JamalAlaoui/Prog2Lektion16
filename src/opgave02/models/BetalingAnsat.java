package opgave02.models;

public class BetalingAnsat implements BetallingsStrategi {
    @Override
    public double betaling(Order order) {
        return order.getTotalPrice() * 0.95;
    }
}
