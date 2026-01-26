package dam.optativa;

public class DiscountCalculator {

    public double calculate(double price, boolean isStudent) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        } else{
            if (isStudent) {
                price = price - (price * 0.2)
            } else {
                price = price - (price * 0.05)
            }
        }
        return price;
    }
}
