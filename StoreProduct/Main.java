class StoreProduct
{
    private String name ;
    private double basePrice;

    StoreProduct(String name, double basePrice)
    {
        this.name = name;
        this.basePrice = basePrice;
    }

    double getBasePrice()
    {
        return basePrice;
    }

    String getName()
    {
        return name;
    }

    double priceForCustomer() {

         return getBasePrice();
    }
}

class SeasonalProduct extends StoreProduct
{
    private double discountPercent;

    SeasonalProduct(String name, double basePrice, double discountPercent)
    {
        super(name, basePrice);

        this.discountPercent = discountPercent;
    }

    @Override
    double priceForCustomer()
    {
        return super.priceForCustomer() * (100 - discountPercent) / 100 ;
    }

    void printTag()
    {
        System.out.println(getBasePrice());
        System.out.println(priceForCustomer());
    }
}

class Main
{
    public static void main(String[] args) {
        
        SeasonalProduct p = new SeasonalProduct("Jacket", 5000, 25);
        p.printTag();
    }
}
